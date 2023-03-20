import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class MadLibs extends Application {

    private Text messageText;
    private TextField nameInputField1;
    private TextField nameInputField2;
    private Button submitButton;

    public void start(Stage primaryStage) {

        Pane paneMain = new FlowPane();
        paneMain.setStyle("-fx-background-color: null;");

        GridPane pane = new GridPane();
        Pane pane2 = new FlowPane();

        Text nameInputFieldLabel1 = new Text("Enter Name:");
        pane.add(nameInputFieldLabel1,0,0);

        nameInputField1 = new TextField();
        nameInputField1.setOnAction(this::processTextField);
        pane.add(nameInputField1, 1, 0);

        Text nameInputFieldLabel2 = new Text("Enter Verb:");
        pane.add(nameInputFieldLabel2, 0,1);

        nameInputField2 = new TextField();
        nameInputField2.setOnAction(this::processTextField);
        pane.add(nameInputField2, 1, 1);

        submitButton = new Button("Submit Name and Verb");
        submitButton.setOnAction(this::processTextField);
        pane.add(submitButton,0,3);

        messageText = new Text("");
        messageText.setFont(Font.font(18));
        messageText.setFill(Color.BLACK);
        pane2.getChildren().add(messageText);

        Scene scene = new Scene(paneMain, 400, 100, Color.WHITE);
        paneMain.getChildren().addAll(pane,pane2);
        primaryStage.setTitle("MadLibs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processTextField(ActionEvent event) {
        String userInputText1 = nameInputField1.getText();
        String userInputText2 = nameInputField2.getText();
        if(!userInputText1.equals("") && !userInputText2.equals("")) {
            messageText.setText(String.format("%s was cool, they %s for President!",userInputText1, userInputText2));
            nameInputField1.clear();
            nameInputField2.clear();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
