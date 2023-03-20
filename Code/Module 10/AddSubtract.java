import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

import javax.swing.*;

public class AddSubtract extends Application {
    private Button addButton, subtractButton;
    private int operand1, operand2, result;
    private TextField operand1Field, operand2Field;
    private Text resultText;

    public void start(Stage primaryStage) {
        VBox mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: yellow");
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setSpacing(10);

        operand1Field = new TextField();
        operand1Field.setOnAction(this::handleButtons);
        operand2Field = new TextField();
        operand2Field.setOnAction(this::handleButtons);

        HBox intervalBox = new HBox(operand1Field, operand2Field);
        intervalBox.setAlignment(Pos.CENTER);
        intervalBox.setSpacing(10);
        mainVBox.getChildren().add(intervalBox);

        addButton = new Button(" + ");
        addButton.setOnAction(this::handleButtons);

        subtractButton = new Button(" - ");
        subtractButton.setOnAction(this::handleButtons);

        HBox buttonBox = new HBox(addButton, subtractButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        mainVBox.getChildren().add(buttonBox);

        resultText = new Text();
        resultText.setFont(Font.font("Helvetica", 28));
        resultText.setFill(Color.BLACK);

        HBox resultBox = new HBox(resultText);
        resultBox.setAlignment(Pos.CENTER);
        resultBox.setSpacing(10);
        mainVBox.getChildren().add(resultBox);
        Scene scene = new Scene(mainVBox, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtons(ActionEvent event) {
//        System.out.println(event.getTarget());
//        System.out.println(event.getSource());

        try {
            double input1 = Integer.parseInt(operand1Field.getText());
            double input2 = Integer.parseInt(operand2Field.getText());

            if (event.getSource() == subtractButton) {
                resultText.setText(String.format("%.3f", (input1 - input2)));
                clearFields();
            } else if (event.getSource() == addButton) {
                resultText.setText(String.format("%.3f", (input1 + input2)));
                clearFields();
            }
        } catch (NumberFormatException e) {
            resultText.setText("Error Try Again");
            clearFields();
        }


    }
    private void clearFields() {
        operand1Field.clear();
        operand2Field.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}