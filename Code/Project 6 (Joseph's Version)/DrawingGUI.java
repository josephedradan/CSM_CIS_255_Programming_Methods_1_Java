/*
        Coded and tested by John San Jose & Joseph Edradan
        CIS 255, Masters

        Note:
        At smaller pen sizes Assignment Classic drawing looks like MSPaint and PhotoShop/Illustrator.
        At bigger pen sizes Assignment Intended drawing looks like MSPaint and PhotoShop/Illustrator.
 */
import javafx.application.*;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.stage.*;

public class DrawingGUI extends Application {


    private static final Color APPLICATION_TEXT_DEFAULT_COLOR = Color.rgb(0, 0, 0);
    private static final String APPLICATION_BACKGROUND_COLOR_HEX = "#ffffff";
    private static final String APPLICATION_BACKGROUND_BOX_COLOR_HEX = "#C5C3CC";

    private static final int WINDOW_HEIGHT = 600;
    private static final int WINDOW_WIDTH = 600;

    private int penSize;
    private Color penColor;

    private ToggleButton toggleButtonAssignment;

    private CheckBox checkBoxErase, checkBoxClassicPen;
    private Button clearButton;

    private static final int CENTER_HEIGHT = 500;
    private static final int CENTER_WIDTH = 600;

    private StackPane stackPane;
    private Pane assignmentPaneIntended;
    private Canvas assignmentCanvasClassic;

    private ColorPicker colorPicker = new ColorPicker();

    private boolean booleanErase = false;

    private ComboBox comboBoxPenSize;

    private PenState penState;
    private PenMode penMode;
    private AssignmentMode assignmentMode;

    private GraphicsContext graphicsContext;

    private Text textPenState, textPenMode, textAssignmentMode;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Defaults
        penState = PenState.OFF;
        penMode = PenMode.INTENDED;
        assignmentMode = AssignmentMode.INTENDED;

        penSize = 6;
        penColor = Color.BLACK;

        // Main border pane
        BorderPane mainBorderPane = new BorderPane();
        mainBorderPane.setStyle(String.format("-fx-background-color: %s;", APPLICATION_BACKGROUND_COLOR_HEX));

        // Center pane 1 (Assignment Intended)
        assignmentPaneIntended = new Pane();
        assignmentPaneIntended.setPrefSize(CENTER_WIDTH, CENTER_HEIGHT);
        assignmentPaneIntended.setStyle(String.format("-fx-background-color: %s;", APPLICATION_BACKGROUND_COLOR_HEX));

        // Classic Pen implementation on Assignment Intended
        assignmentPaneIntended.setOnMouseDragged(this::handleOnMouseDraggedIntended);
        assignmentPaneIntended.setOnMouseReleased(this::handleOnMouseReleased);

        // Intended Pen implementation on Assignment Intended
        assignmentPaneIntended.setOnMouseMoved(this::handleOnMouseMovedIntended);
        assignmentPaneIntended.setOnMouseClicked(this::handleOnMouseClicked);

        mainBorderPane.setCenter(assignmentPaneIntended);

        // Center pane 2 (Assignment Canvas)
        assignmentCanvasClassic = new Canvas(CENTER_WIDTH, CENTER_HEIGHT);

        // Classic Pen implementation on Assignment Classic
        assignmentCanvasClassic.setOnMouseDragged(this::handleOnMouseDraggedClassic);
        assignmentCanvasClassic.setOnMouseReleased(this::handleOnMouseReleased);

        // Intended Pen implementation on Assignment Classic
        assignmentCanvasClassic.setOnMouseMoved(this::handleOnMouseMovedClassic);
        assignmentCanvasClassic.setOnMouseClicked(this::handleOnMouseClicked);
        assignmentCanvasClassic.setOnMouseExited(this::handleOnMouseExited);

        // Literally for drawing on the assignmentCanvasClassic (Pen basically)
        graphicsContext = assignmentCanvasClassic.getGraphicsContext2D();

        // Pen options
        graphicsContext.setStroke(penColor);
        graphicsContext.setLineWidth(penSize);

        // Random square
//        graphicsContext.setFill(Color.BLUE);
//        graphicsContext.fillRect(23, 42, 24, 12);

        // Stack pane (For swapping panes)
        stackPane = new StackPane();
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setStyle(String.format("-fx-background-color: %s;", APPLICATION_BACKGROUND_COLOR_HEX));
        stackPane.setPrefSize(CENTER_WIDTH, CENTER_HEIGHT);
        stackPane.getChildren().addAll(assignmentPaneIntended, assignmentCanvasClassic);
        mainBorderPane.setCenter(stackPane);

        // Top box
        VBox vBoxTop = new VBox(0);
        vBoxTop.setStyle(String.format("-fx-background-color: %s;", APPLICATION_BACKGROUND_BOX_COLOR_HEX));
        vBoxTop.setPrefHeight((WINDOW_HEIGHT - CENTER_HEIGHT) / 2);
        vBoxTop.setAlignment(Pos.CENTER);
        mainBorderPane.setTop(vBoxTop);

        // Bottom box
        HBox hBoxBottom = new HBox(0);
        hBoxBottom.setStyle(String.format("-fx-background-color: %s;", APPLICATION_BACKGROUND_BOX_COLOR_HEX));
        hBoxBottom.setPrefHeight((WINDOW_HEIGHT - CENTER_HEIGHT) / 2);
        hBoxBottom.setAlignment(Pos.CENTER);
        mainBorderPane.setBottom(hBoxBottom);

        // Top box Pen states
        textPenState = new Text();
        textPenState.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));
        textPenState.setFill(APPLICATION_TEXT_DEFAULT_COLOR);
        vBoxTop.getChildren().add(textPenState);

        // Top box Pen Mode
        textPenMode = new Text();
        textPenMode.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));
        textPenMode.setFill(APPLICATION_TEXT_DEFAULT_COLOR);
        vBoxTop.getChildren().add(textPenMode);

        // Top box Assignment Mode
        textAssignmentMode = new Text();
        textAssignmentMode.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));
        textAssignmentMode.setFill(APPLICATION_TEXT_DEFAULT_COLOR);
        vBoxTop.getChildren().add(textAssignmentMode);

        // Bottom box Pen size
        comboBoxPenSize = new ComboBox ();
        for(int i = 0; i < 20; i++){
            comboBoxPenSize.getItems().add((i+1)*2);
        }
        comboBoxPenSize.setValue(penSize);
        comboBoxPenSize.setOnAction(this::handleComboBox);
        hBoxBottom.getChildren().add(comboBoxPenSize);

        // Bottom box Color picking box
        colorPicker.setValue((Color) graphicsContext.getStroke());
        colorPicker.setOnAction(this::handleColorPicker);
        hBoxBottom.getChildren().add(colorPicker);

        // Bottom box Checkbox Eraser
        checkBoxErase = new CheckBox("Erase");
        checkBoxErase.setOnAction(this::handleCheckBox);
        hBoxBottom.getChildren().add(checkBoxErase);

        // Bottom box Checkbox Classic Pen
        checkBoxClassicPen = new CheckBox("Classic Pen Mode");
        checkBoxClassicPen.setOnAction(this::handleCheckBox);
        hBoxBottom.getChildren().add(checkBoxClassicPen);

        // Bottom box Checkbox Clear
        clearButton = new Button("Clear");
        clearButton.setOnAction(this::handleButtonClear);
        hBoxBottom.getChildren().add(clearButton);

        // Bottom box Toggle button
        toggleButtonAssignment = new ToggleButton();
        toggleButtonAssignment.setOnAction(this::handleToggleButtonAssignment);
        hBoxBottom.getChildren().add(toggleButtonAssignment);

        Scene scene = new Scene(mainBorderPane, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Not Adobe Illustrator");

        // TODO: IGNORE THIS
//        primaryStage.widthProperty().addListener((observable, oldValue, newValue) -> {
//
//        }); // like will run twice that all
//        primaryStage.heightProperty().addListener(this::handleOnResizeWindow); // like will run twice that all

        primaryStage.show();


        // Stuff to run after everything has been loaded.

        if (assignmentMode == AssignmentMode.INTENDED) {
            assignmentCanvasClassic.setVisible(false);
            assignmentPaneIntended.setVisible(true);

        } else if (assignmentMode == AssignmentMode.CLASSIC) {
            assignmentCanvasClassic.setVisible(true);
            assignmentPaneIntended.setVisible(false);
        }

        updateText();

    }

    private void handleComboBox(Event event) {
        String comboBoxSize = comboBoxPenSize.getValue().toString();
//        comboBoxPenSize.setValue(String.format("size: %s", comboBoxSize));
        penSize = Integer.parseInt(comboBoxSize);
        updatePen();
    }

    private void handleToggleButtonAssignment(ActionEvent actionEvent) {
        // Classic mode
        if (toggleButtonAssignment.isSelected()) {
            assignmentCanvasClassic.setVisible(true);
            assignmentPaneIntended.setVisible(false);

            assignmentMode = AssignmentMode.CLASSIC;

        }
        // Intended mode
        else {
            assignmentCanvasClassic.setVisible(false);
            assignmentPaneIntended.setVisible(true);

            assignmentMode = AssignmentMode.INTENDED;

        }

        updateText();
    }

    private void handleButtonClear(ActionEvent actionEvent) {
        if (assignmentMode == AssignmentMode.CLASSIC) {
            graphicsContext.clearRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        } else if (assignmentMode == AssignmentMode.INTENDED) {
            assignmentPaneIntended.getChildren().clear();
        }
    }

    private void handleCheckBox(ActionEvent actionEvent) {
        // TODO: IGNORE THIS
//        if (actionEvent.getSource() == checkBoxErase.isSelected()){
//            penState = PenState.OFF;
//        }

        // If Erase is selected
        if (checkBoxErase.isSelected()) {
//            penState = PenState.ERASE; // If uncommented, it will Erase immediately
            booleanErase = true;
        } else {
            graphicsContext.setStroke(colorPicker.getValue()); // Could have been in a lambda...
            booleanErase = false;

        }

        // If Classic Pen mode is selected
        if (checkBoxClassicPen.isSelected()) {
            penMode = PenMode.CLASSIC;
        } else {
            penMode = PenMode.INTENDED;
        }

        penState = PenState.OFF;

        updateText();

    }

    private void handleColorPicker(ActionEvent actionEvent) {
        penColor = colorPicker.getValue();
        graphicsContext.setStroke(penColor); // Could have been in a lambda...
    }

    // State Handler
    private void handleOnMouseMovedIntended(MouseEvent mouseEvent) {
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Shape.html#setStroke-javafx.scene.paint.Paint-
        if (penMode == PenMode.INTENDED) {
            if (penState == PenState.DRAW) {
                assignmentIntendedDrawMode(mouseEvent);

            } else if (penState == PenState.ERASE) {
                assignmentIntendedEraseMode(mouseEvent);

            } else if (penState == PenState.OFF) {
                // Nothing to be handled
            }
        }
    }

    // State Handler
    private void handleOnMouseMovedClassic(MouseEvent mouseEvent) {
        if (penMode == PenMode.INTENDED) {
            if (penState == PenState.DRAW) {
                assignmentClassicDrawModeStart(mouseEvent);

            } else if (penState == PenState.ERASE) {
                graphicsContext.setStroke(Color.web(APPLICATION_BACKGROUND_COLOR_HEX));
                assignmentClassicDrawModeStart(mouseEvent);

            } else if (penState == PenState.OFF) {
                assignmentClassicDrawModeEnd();

            }
        }
    }

    // Note That a Mouse Drag includes a Click
    // State Changer
    private void handleOnMouseClicked(MouseEvent mouseEvent) {
        /*
        Allows you to toggle (Erase and Off) and (Draw and Off)

        Not needed:
        if (assignmentMode == AssignmentMode.CLASSIC) {}
        else if (assignmentMode == AssignmentMode.INTENDED) {}
         */

        if (penMode == PenMode.INTENDED) {
            // This is here so you can toggle Erase and Off
            if (booleanErase) {
                if (penState == PenState.OFF) {
                    penState = PenState.ERASE;

                } else if (penState == PenState.ERASE) {
                    penState = PenState.OFF;
                }
            } else {
                if (penState == PenState.OFF) {
                    penState = PenState.DRAW;

                } else if (penState == PenState.DRAW) {
                    penState = PenState.OFF;
                }
            }
            updateText();
        }
    }


    private void handleOnMouseExited(MouseEvent mouseEvent) {
        /*
        This will prevent the mouse from jumping to the new mouse position if the mouse was moved off the assignmentCanvasClassic
        and then moved back on the assignmentCanvasClassic.
         */

        assignmentClassicDrawModeEnd();
        updateText();
    }

    // TODO: IGNORE THIS
    private void handleOnResizeWindow(Observable observable) {
        System.out.println("sdfsdfsdf");
        assignmentCanvasClassic.setWidth(WINDOW_WIDTH);
    }

    // State Changer
    private void handleOnMouseReleased(MouseEvent mouseEvent) {
        /*
        Imagine instead of drawing with the mouse your actually moving a paint brush with the mouse,
        the methods that graphicsContext has will affect that paint brush.

        closePath(); will get your Initial Position you started to draw with (the literal first position you started to draw)
        and bring your paint brush from where it is (which is the last position you gave it) to your literal first position you started to draw
        (Can be exploited for a line tool)

        beginPath(); will end that that literal first starting position to wherever you called this method.

        ... Just read the documentation

        https://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/GraphicsContext.html#appendSVGPath-java.lang.String-

         */

        if (penMode == PenMode.CLASSIC) {
            if (assignmentMode == AssignmentMode.CLASSIC) {
                assignmentClassicDrawModeEnd();

            } else if (assignmentMode == AssignmentMode.INTENDED) {
                // Nothing to be handled
            }
            penState = PenState.OFF;
            updateText();
        }
    }

    // State Changer
    private void handleOnMouseDraggedIntended(MouseEvent mouseEvent) {
        // Don't call beginPath() here or you will refresh based on when ever this function is called.
        if (penMode == PenMode.CLASSIC) {
            if (booleanErase) {
                assignmentIntendedEraseMode(mouseEvent);
                penState = PenState.ERASE;
            } else {
                assignmentIntendedDrawMode(mouseEvent);
                penState = PenState.DRAW;
            }
            updateText();
        }
    }

    // State Changer
    private void handleOnMouseDraggedClassic(MouseEvent mouseEvent) {
        if (penMode == PenMode.CLASSIC) {
            if (booleanErase) {
                graphicsContext.setStroke(Color.web(APPLICATION_BACKGROUND_COLOR_HEX));
                assignmentClassicDrawModeStart(mouseEvent);
                penState = PenState.ERASE;
            } else {
                assignmentClassicDrawModeStart(mouseEvent);
                penState = PenState.DRAW;
            }
            updateText();
        }
    }

    private void updatePen(){
        graphicsContext.setStroke(penColor);
        graphicsContext.setLineWidth(penSize);
    }
    private void updateText() {

        textPenState.setText(String.format("Pen State: %s", penState.getText()));
        textPenMode.setText(String.format("Pen Mode: %s", penMode.getText()));
        textAssignmentMode.setText(String.format("Assignment Mode: %s", assignmentMode.getText()));

        toggleButtonAssignment.setText(String.format("Assignment Mode: %s", assignmentMode.getText()));
    }

    private void assignmentIntendedEraseMode(MouseEvent mouseEvent) {
        for (Node node : assignmentPaneIntended.getChildren()) {
            if (node.contains(mouseEvent.getX(), mouseEvent.getY())) {
                assignmentPaneIntended.getChildren().remove(node);
                break; // to prevent Errors after looping and removing
            }
        }
    }

    private void assignmentIntendedDrawMode(MouseEvent mouseEvent) {
        Circle circle = new Circle(mouseEvent.getX(), mouseEvent.getY(), penSize);
        circle.setFill(colorPicker.getValue());
        circle.setStroke(colorPicker.getValue());
        assignmentPaneIntended.getChildren().add(circle);
    }

    private void assignmentClassicDrawModeStart(MouseEvent mouseEvent) {
        graphicsContext.lineTo(mouseEvent.getX(), mouseEvent.getY()); // Do "stuff" at mouse position
        graphicsContext.stroke(); // Actually draw
    }

    private void assignmentClassicDrawModeEnd() {
        graphicsContext.beginPath();
    }

    public static void main(String[] args) {
        launch(args);
    }

}