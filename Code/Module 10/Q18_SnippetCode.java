import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q18_SnippetCode extends Application {
    private TextField inputField;
    private Text outputText;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField inputField;
        Text outputText = new Text("here");

        Pane paneMain = new FlowPane();
        paneMain.setStyle("-fx-background-color: null;");

        paneMain.getChildren().add(outputText);
        Scene scene = new Scene(paneMain, 400, 100, Color.WHITE);
        primaryStage.setTitle("MadLibs");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void handleTextField(ActionEvent e) {
        String inputText = inputField.getText();
        boolean correct = inputText.equals("here") ? true : false;
        outputText.setText(correct ?  "you got it" : "not quite");
    }
}
