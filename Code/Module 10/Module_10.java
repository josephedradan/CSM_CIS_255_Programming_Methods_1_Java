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

import javax.swing.*;

public class Module_10 extends Application { // 12. JavaFX Class extends Application Class
    private Text messageText;
    private TextField nameInputField;
    private Button submitButton;
    public static void main(String args[]){

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new FlowPane();
        pane.setStyle("-fx-background-color: null;");

        Group group = new Group();

        group.getChildren().add(submitButton);  // 14. Add button like this

        Group group2 = new Group(submitButton); // 14. This too ----- NO IT DOES NOT

//        Group group3 = Group.add(submitButton); // 14. ---------- NO WORK DONT ADD

        Group group4 = new Group(); group4.getChildren().add(submitButton); // 14. WILL WORK


        messageText = new Text("Hello World!");
        messageText.setFont(Font.font(18));
        messageText.setFill(Color.DARKRED); // 6. TEXT CAN HAVE COLOR AND FONT
        pane.getChildren().add(messageText);

        Text textExample = new Text("Enter Verb:\n"); // 5. YOU CAN HAVE \n HERE
        group.getChildren().add(textExample); // 3. group.getChildren().add(textObject)

        submitButton = new Button("Submit Name");
        submitButton.setOnAction(this::processTextField); // 4. NOT HAVING THIS WILL STILL RUN
        pane.getChildren().add(submitButton);


        Scene scene = new Scene(pane, 200, 300, Color.SKYBLUE); // 2. GUI WINDOW

        primaryStage.setTitle("Hello User!");
        primaryStage.setScene(scene);
        primaryStage.show();
//        primaryStage.setFill();  13. THESE WON'T WORK
//        primaryStage.getChildren();
//        primaryStage.add();

        // Number 8 which is what color is blue
        Color blue1 = Color.color(0, 0, 1);
        Color blue2 = Color.rgb(0, 0, 256);
        Color blue3 = Color.color(1, 1, 0);
        Color blue4 = Color.rgb(0, 0, 255);
        Color blue5 = Color.rgb(255, 0, 0);
    }

    private void processTextField(ActionEvent event) {
        String userInputText = nameInputField.getText();
        if(!userInputText.equals("")) {
            messageText.setText("Hello " + userInputText); // 7. CAN HAVE TEXT OBJECT INTERACTED WITH USER
            nameInputField.clear();
        }
    }

}
