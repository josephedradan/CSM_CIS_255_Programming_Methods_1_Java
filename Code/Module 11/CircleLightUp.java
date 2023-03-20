import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;


public class CircleLightUp extends Application {


    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        for (int i = 0; i < 5; i++) {

            Circle circle = new Circle(100 + (i * 100), 100 + (i * 100), 50);
            pane.getChildren().add(circle);
            // YOUR CODE HERE: CODE A
            circle.setOnMouseEntered(this::handleMouseEntered);
            circle.setOnMouseExited(this::handleMouseExited);

        }


        Scene scene = new Scene(pane, 700, 700, Color.AZURE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    // YOUR CODE HERE: CODE B
    private void handleMouseEntered(MouseEvent event) {
        if (event.getSource() instanceof Circle) {
            Circle circle = (Circle) event.getSource();
            circle.setFill(Color.YELLOW);
        }
    }

    private void handleMouseExited(MouseEvent event) {
        if (event.getSource() instanceof Circle) {
            Circle circle = (Circle) event.getSource();
            circle.setFill(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        launch(args);

    }
}
