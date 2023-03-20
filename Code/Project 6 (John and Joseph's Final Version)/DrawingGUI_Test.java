

import javafx.application.*;
import javafx.beans.Observable;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class DrawingGUI_Test extends Application {


    private static final Color HEADER_AND_OUTCOME_COLOR = Color.rgb(221, 160, 221);
    private static final Color INFO_COLOR = Color.rgb(224, 255, 255);
    private static final Color WORD_COLOR = Color.rgb(224, 255, 255);


    private Canvas canvas;
    private GraphicsContext graphicsContext;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create all the shit
        BorderPane mainBorderPane = new BorderPane();
        mainBorderPane.setStyle("-fx-border-color : black; -fx-border-width : 0 5 "); // COLORS ENTIRE BOX BORDER BLACK

//        mainBorderPane.setStyle("-fx-background-color: red");
//        mainBorderPane.setAlignment(Pos.CENTER);
//        mainBorderPane.setSpacing(10);

        FlowPane mainflowPane = new FlowPane();
//        mainflowPane.setStyle("-fx-border-color: black"); // inline css
//        mainflowPane.setStyle("-fx-border-color: black");
        mainflowPane.setStyle("-fx-background-color: blue");
//        mainflowPane.setStyle("-fx-border-width: 2"); // does not work
//        mainflowPane.setAlignment(Pos.CENTER);

//        mainBorderPane.setCenter(mainflowPane);
        HBox hbox1 = new HBox(0);
//        hbox.setStyle("-fx-border-width: 2");

//        Button buttonCurrent = new Button("Current");
//        buttonCurrent.setPrefSize(100, 20);
//
//        Button buttonProjected = new Button("Projected");
//        buttonProjected.setPrefSize(100, 20);
//        hbox1.getChildren().addAll(buttonCurrent, buttonProjected);

        hbox1.setStyle("-fx-background-color: #336699;");
//        hbox1.setStyle("-fx-border-color: black"); // THIS STHI DOES NOT WORK WITH THIS BOX


//        hbox.setPrefWidth(500);
//        hbox.setPrefHeight(500);
//        hbox.setPadding( new Insets(100,23,80,0)); // WILL PUSH BOXES // ITS INSIDE TEH BOX
//        hbox.setSpacing(10); // ITS INSIDE TEH BOX
        mainBorderPane.setTop(hbox1);


        HBox hboxcenter = new HBox(0);
//        hboxcenter.setStyle("-fx-border-width: 2"); // dont do shit
        hboxcenter.setStyle("-fx-background-color: blue");
//        hboxcenter.setPadding( new Insets(310,312,300,300)); // WILL PUSH BOXES
        hboxcenter.setPrefWidth(500);
        hboxcenter.setPrefHeight(500);
//        hbox.setSpacing(10);
//        mainBorderPane.setCenter(hboxcenter);


        Text headerText = new Text("Drawing GUI");
        headerText.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));
        headerText.setFill(HEADER_AND_OUTCOME_COLOR);

        canvas = new Canvas(500,500);
//        canvas.setStyle("-fx-background-color: white");  // nothing
//        canvas.setStyle("-fx-background-color: white"); // nothing
//        canvas.setStyle("-fx-padding: 20 ;"); // nothing
        canvas.setStyle("-fx-border-color: black");
        canvas.setStyle("-fx-border-color : black; -fx-border-width : 0 5 "); // DOES NOT DO FUCKING SHIT

        canvas.setStyle("-fx-border-width: 2");

        // literally for drwaing
        graphicsContext = canvas.getGraphicsContext2D();

        // THIS IS A GOD DAMN SQUARE FOR ART NOT THE BACKGORUND
        graphicsContext.setFill(Color.BLUE); // together
        graphicsContext.fillRect(23,42,24,12);

        graphicsContext.setStroke(Color.BLACK);
        graphicsContext.setLineWidth(5);


        canvas.setOnMouseDragged(this::handleOnMouseDragged);

//        hboxcenter.getChildren().add(canvas);
//        canvas.setOnMousePressed(this::handleOnMouseDragged);
//        mainBorderPane.getChildren().add(canvas);
//        mainflowPane.getChildren().add(canvas);
//        mainBorderPane.setCenter(canvas);

        Scene scene = new Scene(mainBorderPane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);

        primaryStage.widthProperty().addListener(this::handleOnResizeWindow); // like will run twice that all
        primaryStage.heightProperty().addListener(this::handleOnResizeWindow); // like will run twice that all

        primaryStage.show();


    }
    private void handleOnResizeWindow(Observable observable) {
        System.out.println("sdfsdfsdf");
    }

    private void handleOnMouseDragged(MouseEvent mouseEvent) {
        graphicsContext.beginPath();
        graphicsContext.lineTo(mouseEvent.getX(), mouseEvent.getY());
        graphicsContext.stroke();

    }

    public static void main(String[] args) {
        launch(args);
    }
}