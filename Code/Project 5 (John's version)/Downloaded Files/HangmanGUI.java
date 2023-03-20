import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class HangmanGUI extends Application {

	private String currentWord; // the randomly selected word
	private TextField guessField; // the user enters their guess here
	private Text currentWordText; // show the current word (with - for unguessed letters)
	private Text outcomeText; // show the outcome of each guess and the game
	private Text wrongGuessesText; // show a list of incorrect guesses
	private Text wrongGuessNumberText; // show how many incorrect guesses (or how many guesses remain)
	private final static int MAX_WRONG_GUESSES = 7;
	private static final Color TITLE_AND_OUTCOME_COLOR = Color.rgb(221, 160, 221);
	private static final Color INFO_COLOR = Color.rgb(224, 255, 255);
	private static final Color WORD_COLOR = Color.rgb(224, 255, 255);

	public void start(Stage primaryStage) {

		VBox mainVBox = new VBox();
		mainVBox.setStyle("-fx-background-color: royalblue");
		mainVBox.setAlignment(Pos.CENTER);
		mainVBox.setSpacing(10);

		Text welcomeText = new Text("Welcome to Hangman!");
		welcomeText.setFont(Font.font("Helvetica", FontWeight.BOLD, 36));
		welcomeText.setFill(TITLE_AND_OUTCOME_COLOR);
		Text introText1 = new Text("Guess a letter.");
		Text introText2 = new Text("You can make " + MAX_WRONG_GUESSES + " wrong guesses!");
		introText1.setFont(Font.font("Helvetica", 24));
		introText1.setFill(INFO_COLOR);
		introText2.setFont(Font.font("Helvetica", 24));
		introText2.setFill(INFO_COLOR);

		VBox introBox = new VBox(welcomeText, introText1, introText2);
		introBox.setAlignment(Pos.CENTER);
		introBox.setSpacing(10);
		mainVBox.getChildren().add(introBox);

		// create before game is started
		outcomeText = new Text("");
		guessField = new TextField();
		wrongGuessNumberText = new Text("");
		currentWord = chooseWord();
		currentWordText = new Text(currentWord);
		wrongGuessesText = new Text("Wrong Guesses: []");

		
		currentWordText.setFont(Font.font("Helvetica", FontWeight.BOLD, 48));
		currentWordText.setFill(WORD_COLOR);
		HBox currentBox = new HBox(currentWordText);
		currentBox.setAlignment(Pos.CENTER);
		currentBox.setSpacing(10);
		mainVBox.getChildren().add(currentBox);

		Text guessIntroText = new Text("Enter your guess: ");
		guessIntroText.setFont(Font.font("Helvetica", 26));
		guessIntroText.setFill(INFO_COLOR);
		guessField.setOnAction(this::handleGuessField);
		HBox guessBox = new HBox(guessIntroText, guessField);
		guessBox.setAlignment(Pos.CENTER);
		guessBox.setSpacing(10);
		mainVBox.getChildren().add(guessBox);

		outcomeText.setFont(Font.font("Helvetica", 28));
		outcomeText.setFill(TITLE_AND_OUTCOME_COLOR);
		HBox outcomeBox = new HBox(outcomeText);
		outcomeBox.setAlignment(Pos.CENTER);
		outcomeBox.setSpacing(10);
		mainVBox.getChildren().add(outcomeBox);

		wrongGuessesText.setFont(Font.font("Helvetica", 24));
		wrongGuessesText.setFill(INFO_COLOR);
		HBox wrongGuessesBox = new HBox(wrongGuessesText);
		wrongGuessesBox.setAlignment(Pos.CENTER);
		wrongGuessesBox.setSpacing(10);
		mainVBox.getChildren().add(wrongGuessesBox);

		wrongGuessNumberText.setFont(Font.font("Helvetica", 24));
		wrongGuessNumberText.setFill(INFO_COLOR);
		HBox wrongGuessNumberBox = new HBox(wrongGuessNumberText);
		wrongGuessNumberBox.setAlignment(Pos.CENTER);
		mainVBox.getChildren().add(wrongGuessNumberBox);

		Scene scene = new Scene(mainVBox, 550, 500);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	private void handleGuessField(ActionEvent event) {
		// YOUR CODE HERE
	}
	private String chooseWord() {
		// YOUR CODE HERE
		return "";
	}

	public static void main(String[] args) {
		launch(args);

	}

}
