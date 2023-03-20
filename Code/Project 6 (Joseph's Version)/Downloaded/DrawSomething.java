package Downloaded;

import java.util.Iterator;
import java.util.List;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;

//
// Decompiled by Procyon v0.5.30
//

public class DrawSomething extends Application
{
    private static final int CIRCLE_SIZE = 5;
    private BorderPane mainPane;
    private Pane drawingPane;
    private PenState penState;
    private Text penStateText;
    private RadioButton redButton;
    private RadioButton blueButton;
    private RadioButton yellowButton;
    private RadioButton eraserButton;
    private Button clearButton;
    private Color drawingColor;

    public void start(final Stage primaryStage) {
        this.penState = PenState.OFF;
        this.drawingColor = Color.RED;

        (this.mainPane = new BorderPane()).setStyle("-fx-background-color: white");
        this.mainPane.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));

        (this.penStateText = new Text()).setFont(Font.font(16.0));
        this.penStateText.setFill((Paint)Color.BLACK);
        this.updatePenStateText();

        final HBox textBox = new HBox(new Node[] { this.penStateText });
        textBox.setAlignment(Pos.CENTER);
        this.mainPane.setTop((Node)textBox);

        (this.drawingPane = new Pane()).setOnMouseMoved(this::handleDrawing);
        this.drawingPane.setOnMouseClicked(this::handleClicks);
        this.drawingPane.setStyle("-fx-background-color: white");
        this.drawingPane.setStyle("-fx-border-color: black");
        this.mainPane.setCenter((Node)this.drawingPane);

        final HBox colorButtonBox = new HBox();
        colorButtonBox.setSpacing(5.0);
        final ToggleGroup colorGroup = new ToggleGroup();
        colorButtonBox.setAlignment(Pos.CENTER);

        (this.redButton = new RadioButton("Red")).setSelected(true);
        this.redButton.setOnAction(this::handleColorChange);
        this.redButton.setToggleGroup(colorGroup);
        colorButtonBox.getChildren().add((Object)this.redButton);

        (this.blueButton = new RadioButton("Blue")).setOnAction(this::handleColorChange);
        this.blueButton.setToggleGroup(colorGroup);
        colorButtonBox.getChildren().add((Object)this.blueButton);

        (this.yellowButton = new RadioButton("Yellow")).setOnAction(this::handleColorChange);
        this.yellowButton.setToggleGroup(colorGroup);
        colorButtonBox.getChildren().add((Object)this.yellowButton);

        (this.eraserButton = new RadioButton("Eraser")).setOnAction(this::handleColorChange);
        this.eraserButton.setToggleGroup(colorGroup);
        colorButtonBox.getChildren().add((Object)this.eraserButton);

        (this.clearButton = new Button("Clear")).setOnAction(this::handleClear);
        final HBox controlBox = new HBox(new Node[] { colorButtonBox, this.clearButton });
        controlBox.setAlignment(Pos.CENTER);
        controlBox.setSpacing(10.0);
        this.mainPane.setBottom((Node)controlBox);
        final Scene scene = new Scene((Parent)this.mainPane, 500.0, 500.0, (Paint)Color.TRANSPARENT);

        primaryStage.setTitle("Draw Something");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void handleClear(final ActionEvent event) {
        while (!this.drawingPane.getChildren().isEmpty()) {
            this.drawingPane.getChildren().remove(0);
        }
    }

    private void handleColorChange(final ActionEvent event) {
        if (event.getSource() == this.redButton) {
            this.drawingColor = Color.RED;
        }
        else if (event.getSource() == this.blueButton) {
            this.drawingColor = Color.BLUE;
        }
        else if (event.getSource() == this.yellowButton) {
            this.drawingColor = Color.YELLOW;
        }
        else if (event.getSource() == this.eraserButton) {
            this.penState = PenState.ERASE;
        }
        this.penState = PenState.OFF;
    }

    private void handleDrawing(final MouseEvent event) {
        if (this.penState == PenState.DRAW) {
            final double x = event.getX();
            final double y = event.getY();
            final Circle circle = new Circle(x, y, 5.0);
            circle.setFill((Paint)this.drawingColor);
            circle.setStroke((Paint)this.drawingColor);
            this.drawingPane.getChildren().add((Object)circle);
        }
        else if (this.penState == PenState.ERASE) {
            final List<Node> circleList = (List<Node>)this.drawingPane.getChildren();
            final Iterator<Node> circleIterator = circleList.iterator();
            while (circleIterator.hasNext()) {
                final Node node = circleIterator.next();
                if (node instanceof Circle) {
                    final Circle circle2 = (Circle)node;
                    if (!circle2.contains(event.getX(), event.getY())) {
                        continue;
                    }
                    circleIterator.remove();
                }
            }
        }
    }

    private void handleClicks(final MouseEvent event) {
        if (this.penState == PenState.DRAW || this.penState == PenState.ERASE) {
            this.penState = PenState.OFF;
        }
        else if (this.penState == PenState.OFF) {
            if (this.eraserButton.isSelected()) {
                this.penState = PenState.ERASE;
            }
            else {
                this.penState = PenState.DRAW;
            }
        }
        this.updatePenStateText();
    }

    private void updatePenStateText() {
        this.penStateText.setText("Pen: " + this.penState.toString());
    }

    public static void main(final String[] args) {
        launch(args);
    }

    private enum PenState
    {
        DRAW("DRAW", 0),
        ERASE("ERASE", 1),
        OFF("OFF", 2);

        private PenState(final String s, final int n) {
        }
    }
}
