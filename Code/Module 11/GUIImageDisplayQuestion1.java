import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIImageDisplayQuestion1 extends Application {
    public void start(Stage primaryStage) {

        VBox primaryBox = new VBox();
        primaryBox.setAlignment(Pos.CENTER);
        primaryBox.setSpacing(10);

        Image zuckImage = new Image("zxAixQF.gif", 728, 818, true, true);
        ImageView zuckImageView = new ImageView(zuckImage);
        primaryBox.getChildren().add(zuckImageView);

        Text zuckDescription = new Text("\"The Zuck Smile\"");
        zuckDescription.setFont(Font.font("Verdana", FontPosture.ITALIC, 70));
        zuckDescription.setFill(Color.WHITE);
        primaryBox.getChildren().add(zuckDescription);


        Scene scene = new Scene(primaryBox, 818, 900, Color.BLACK);
        primaryStage.setTitle("The Zuck");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}
