import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class AlertConverter extends Application {

    final private double gramsToOnceRatio = .035274;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setHeaderText(null);
        inputDialog.setTitle("Conversion");
        inputDialog.setContentText("Enter the number of number: ");

        Optional<String> userInput = inputDialog.showAndWait();

        Alert resultAlert = new Alert(Alert.AlertType.INFORMATION);
        resultAlert.setTitle("Results");
        resultAlert.setHeaderText(null);

        // What a fun way of doing it.
        try {
            double number = Integer.parseInt(userInput.get());
            double ouncesResult = number * gramsToOnceRatio;
            resultAlert.setContentText(String.format("That is %.6f ounces.", ouncesResult));
        } catch (NumberFormatException e) {
            resultAlert.setContentText("Invalid input.");
        } catch (Exception e) {
            System.exit(0);
        }

        resultAlert.showAndWait();
    }
}
