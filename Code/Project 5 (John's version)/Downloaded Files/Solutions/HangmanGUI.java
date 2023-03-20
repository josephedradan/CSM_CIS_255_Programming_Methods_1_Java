import java.util.Collections;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import java.util.List;
import javafx.application.Application;

// 
// Decompiled by Procyon v0.5.30
// 

public class HangmanGUI extends Application
{
    private List<String> wordList;
    private List<Character> guessedCharactersList;
    private boolean[] isWordPositionGuessed;
    private static final String LETTER_NOT_GUESSED_STRING = "-";
    private String currentWord;
    private int numWrongGuesses;
    private static final int MAX_WRONG_GUESSES = 7;
    private TextField guessField;
    private Text currentWordText;
    private Text wrongGuessesText;
    private Text statsText;
    private Text outcomeText;
    private static final Color TITLE_AND_OUTCOME_COLOR;
    private static final Color INFO_COLOR;
    private static final Color WORD_COLOR;
    private Button playAgainButton;
    
    static {
        TITLE_AND_OUTCOME_COLOR = Color.rgb(221, 160, 221);
        INFO_COLOR = Color.rgb(224, 255, 255);
        WORD_COLOR = Color.rgb(224, 255, 255);
    }
    
    public void start(final Stage primaryStage) {
        final VBox mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: royalblue");
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setSpacing(10.0);
        final Text welcomeText = new Text("Welcome to Hangman!");
        welcomeText.setFont(Font.font("Helvetica", FontWeight.BOLD, 36.0));
        welcomeText.setFill((Paint)HangmanGUI.TITLE_AND_OUTCOME_COLOR);
        final Text introText1 = new Text("Guess a letter.");
        final Text introText2 = new Text("You can make 7 wrong guesses!");
        introText1.setFont(Font.font("Helvetica", 24.0));
        introText1.setFill((Paint)HangmanGUI.INFO_COLOR);
        introText2.setFont(Font.font("Helvetica", 24.0));
        introText2.setFill((Paint)HangmanGUI.INFO_COLOR);
        final VBox introBox = new VBox(new Node[] { welcomeText, introText1, introText2 });
        introBox.setAlignment(Pos.CENTER);
        introBox.setSpacing(10.0);
        mainVBox.getChildren().add((Object)introBox);
        this.outcomeText = new Text("");
        this.guessField = new TextField();
        this.statsText = new Text("");
        this.currentWordText = new Text("");
        this.guessedCharactersList = new ArrayList<Character>();
        this.wrongGuessesText = new Text("Wrong Guesses: []");
        this.playAgainButton = new Button("Play Again");
        this.startGame();
        this.currentWordText.setFont(Font.font("Helvetica", FontWeight.BOLD, 48.0));
        this.currentWordText.setFill((Paint)HangmanGUI.WORD_COLOR);
        final HBox currentBox = new HBox(new Node[] { this.currentWordText });
        currentBox.setAlignment(Pos.CENTER);
        currentBox.setSpacing(10.0);
        mainVBox.getChildren().add((Object)currentBox);
        final Text guessIntroText = new Text("Enter your guess: ");
        guessIntroText.setFont(Font.font("Helvetica", 26.0));
        guessIntroText.setFill((Paint)HangmanGUI.INFO_COLOR);
        this.guessField.setOnAction(this::handleGuessField);
        final HBox guessBox = new HBox(new Node[] { guessIntroText, this.guessField });
        guessBox.setAlignment(Pos.CENTER);
        guessBox.setSpacing(10.0);
        mainVBox.getChildren().add((Object)guessBox);
        this.outcomeText.setFont(Font.font("Helvetica", 28.0));
        this.outcomeText.setFill((Paint)HangmanGUI.TITLE_AND_OUTCOME_COLOR);
        final HBox outcomeBox = new HBox(new Node[] { this.outcomeText });
        outcomeBox.setAlignment(Pos.CENTER);
        outcomeBox.setSpacing(10.0);
        mainVBox.getChildren().add((Object)outcomeBox);
        this.wrongGuessesText.setFont(Font.font("Helvetica", 24.0));
        this.wrongGuessesText.setFill((Paint)HangmanGUI.INFO_COLOR);
        final HBox wrongGuessesBox = new HBox(new Node[] { this.wrongGuessesText });
        wrongGuessesBox.setAlignment(Pos.CENTER);
        wrongGuessesBox.setSpacing(10.0);
        mainVBox.getChildren().add((Object)wrongGuessesBox);
        this.statsText.setFont(Font.font("Helvetica", 24.0));
        this.statsText.setFill((Paint)HangmanGUI.INFO_COLOR);
        final HBox statsBox = new HBox(new Node[] { this.statsText });
        statsBox.setAlignment(Pos.CENTER);
        mainVBox.getChildren().add((Object)statsBox);
        final HBox buttonBox = new HBox(new Node[] { this.playAgainButton });
        buttonBox.setAlignment(Pos.CENTER);
        this.playAgainButton.setVisible(false);
        this.playAgainButton.setOnAction(this::handleButton);
        mainVBox.getChildren().add((Object)buttonBox);
        this.updateTextDisplays();
        final Scene scene = new Scene((Parent)mainVBox, 550.0, 500.0);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    private void handleButton(final ActionEvent event) {
        this.startGame();
    }
    
    private void handleGuessField(final ActionEvent event) {
        final String userInput = this.guessField.getText();
        this.guessField.clear();
        if (this.isGuessValid(userInput)) {
            final char userGuess = userInput.toUpperCase().charAt(0);
            if (this.guessedCharactersList.contains(userGuess) || (this.currentWord.contains(Character.toString(userGuess)) && this.isWordPositionGuessed[this.currentWord.indexOf(userGuess)])) {
                this.outcomeText.setText("You've already guessed that letter.");
            }
            else {
                if (this.currentWord.contains(Character.toString(userGuess))) {
                    this.updateGuessStatus(userGuess);
                    this.outcomeText.setText("Good guess!");
                }
                else {
                    this.guessedCharactersList.add(userGuess);
                    ++this.numWrongGuesses;
                    this.outcomeText.setText("Nope! Try again.");
                }
                this.updateTextDisplays();
            }
            if (this.wordIsGuessed()) {
                this.outcomeText.setText("You guessed it! Great job!");
                this.guessField.setDisable(true);
                this.playAgainButton.setVisible(true);
            }
            else if (this.numWrongGuesses == 7) {
                this.outcomeText.setText("Better luck next time! (" + this.currentWord + ")");
                this.guessField.setDisable(true);
                this.playAgainButton.setVisible(true);
            }
        }
    }
    
    private void updateGuessStatus(final char userGuess) {
        for (int i = 0; i < this.currentWord.length(); ++i) {
            if (this.currentWord.charAt(i) == userGuess) {
                this.isWordPositionGuessed[i] = true;
            }
        }
    }
    
    private boolean isGuessValid(final String userInput) {
        try {
            if (userInput.length() < 1) {
                throw new EmptyGuessException();
            }
            if (userInput.length() > 1) {
                throw new GuessTooLongException();
            }
            if (!Character.isAlphabetic(userInput.charAt(0))) {
                throw new ImproperGuessException();
            }
            return true;
        }
        catch (EmptyGuessException | GuessTooLongException | ImproperGuessException ex3) {
            final Exception ex2;
            final Exception ex = ex2;
            this.outcomeText.setText(ex.getMessage());
            this.guessField.clear();
            this.updateTextDisplays();
            return false;
        }
    }
    
    private void startGame() {
        this.currentWord = this.chooseWord();
        this.numWrongGuesses = 0;
        this.guessedCharactersList.clear();
        this.isWordPositionGuessed = new boolean[this.currentWord.length()];
        this.guessField.setDisable(false);
        this.guessField.clear();
        this.outcomeText.setText("");
        this.updateTextDisplays();
        this.playAgainButton.setVisible(false);
    }
    
    private void updateTextDisplays() {
        this.currentWordText.setText(this.getDisplayString());
        this.statsText.setText("Number of Guesses Remaining = " + (7 - this.numWrongGuesses));
        Collections.sort(this.guessedCharactersList);
        this.wrongGuessesText.setText("Wrong Guesses: " + this.guessedCharactersList);
    }
    
    private boolean wordIsGuessed() {
        boolean[] isWordPositionGuessed;
        for (int length = (isWordPositionGuessed = this.isWordPositionGuessed).length, i = 0; i < length; ++i) {
            final boolean guessed = isWordPositionGuessed[i];
            if (!guessed) {
                return false;
            }
        }
        return true;
    }
    
    private String getDisplayString() {
        String displayString = "";
        for (int i = 0; i < this.isWordPositionGuessed.length; ++i) {
            if (this.isWordPositionGuessed[i]) {
                displayString = String.valueOf(displayString) + this.currentWord.charAt(i);
            }
            else {
                displayString = String.valueOf(displayString) + "-";
            }
            displayString = String.valueOf(displayString) + " ";
        }
        return displayString.toUpperCase();
    }
    
    private String chooseWord() {
        (this.wordList = new ArrayList<String>()).add("APPLE");
        this.wordList.add("BANANA");
        this.wordList.add("PEAR");
        Collections.shuffle(this.wordList);
        return this.wordList.get(0);
    }
    
    public static void main(final String[] args) {
        launch(args);
    }
}
