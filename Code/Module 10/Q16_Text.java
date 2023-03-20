import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q16_Text extends Application {

    public void start(Stage primaryStage) {
        Text text = new Text("Joseph Edradan");
        text.setFont(Font.font("Ariel", 12));
        text.setFill(Color.RED);

    }

    public static void main(String[] args) {
        launch(args);
    }
}

//public class Q16_Text extends Application {
//
//    public void start(Stage primaryStage) {
//
//        GridPane gridPane = new GridPane();
//        Text text = new Text("Joseph Edradan");
//        text.setFont(Font.font("Ariel", 12));
//        text.setFill(Color.RED);
//
//        gridPane.add(text, 0 ,0);
//
//        Scene scene = new Scene(gridPane, 200, 300);
//
//        primaryStage.setTitle("Question 16");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}