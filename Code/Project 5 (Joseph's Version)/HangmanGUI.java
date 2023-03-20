/*
Joseph Edradan
11/29/18
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

import javafx.scene.control.Alert;

public class HangmanGUI extends Application {
    private String filePath = "words.txt";  // file path

    private String currentWord;             // the randomly selected word
    private String displayedCurrentWord;       // copy of the current word

    private TextField guessField;       // the user enters their guess here
    private Text currentWordText;       // show the current word (with - for unguessed letters)
    private Text outcomeText;           // show the outcome of each guess and the game
    private Text wrongGuessesText;      // show a list of incorrect guesses
    private Text wrongGuessNumberText;  // show how many incorrect guesses (or how many guesses remain)

    private Button playAgainButton;     // Play button
    private Alert errorAlert;           // Alert window

    private final static int MAX_WRONG_GUESSES = 7;
    private static final Color TITLE_AND_OUTCOME_COLOR = Color.rgb(221, 160, 221);
    private static final Color INFO_COLOR = Color.rgb(224, 255, 255);
    private static final Color WORD_COLOR = Color.rgb(224, 255, 255);

    private int remainingGuesses;   // Remaining amount of guesses

    private List<String> listOfGuessableWords = new ArrayList<>();      // Contains words that you can guess

    private List<Character> listCharsCurrent = new ArrayList<>();       // Contains chars of current
    private List<Character> listCharsGuessWrong = new ArrayList<>();    // Contains chars of guess wrong
    private List<Character> listCharsGuessCorrect = new ArrayList<>();  // Contains chars of guess correct

    public void start(Stage primaryStage) {

        // Main window
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

        // Text placed in Box
        VBox introBox = new VBox(welcomeText, introText1, introText2);
        introBox.setAlignment(Pos.CENTER);
        introBox.setSpacing(10);
        mainVBox.getChildren().add(introBox);

        // Error Alert window
        errorAlert = new Alert(Alert.AlertType.INFORMATION);
        errorAlert.setTitle("Error Alert");
        errorAlert.setHeaderText(null);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Created before game is started

        // Initial game settings
        guessField = new TextField();           // User Input

        outcomeText = new Text("");             // Text based on result of input
        wrongGuessNumberText = new Text("");    // Text number of guesses

        currentWordText = new Text(displayedCurrentWord);       // Text of displayedCurrentWord
        wrongGuessesText = new Text("Wrong Guesses: []");       // Text of amount of wrong guesses

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // The Hangman text
        currentWordText.setFont(Font.font("Helvetica", FontWeight.BOLD, 48));
        currentWordText.setFill(WORD_COLOR);
        HBox currentBox = new HBox(currentWordText);
        currentBox.setAlignment(Pos.CENTER);
        currentBox.setSpacing(10);
        mainVBox.getChildren().add(currentBox);

        // Text for input field
        Text guessIntroText = new Text("Enter your guess: ");
        guessIntroText.setFont(Font.font("Helvetica", 26));
        guessIntroText.setFill(INFO_COLOR);
        guessField.setOnAction(this::handleGuessField);
        HBox guessBox = new HBox(guessIntroText, guessField);
        guessBox.setAlignment(Pos.CENTER);
        guessBox.setSpacing(10);
        mainVBox.getChildren().add(guessBox);

        // Text for outcome of game
        outcomeText.setFont(Font.font("Helvetica", 28));
        outcomeText.setFill(TITLE_AND_OUTCOME_COLOR);
        HBox outcomeBox = new HBox(outcomeText);
        outcomeBox.setAlignment(Pos.CENTER);
        outcomeBox.setSpacing(10);
        mainVBox.getChildren().add(outcomeBox);

        // Wrong guess text (includes a string list)
        wrongGuessesText.setFont(Font.font("Helvetica", 24));
        wrongGuessesText.setFill(INFO_COLOR);
        HBox wrongGuessesBox = new HBox(wrongGuessesText);
        wrongGuessesBox.setAlignment(Pos.CENTER);
        wrongGuessesBox.setSpacing(10);
        mainVBox.getChildren().add(wrongGuessesBox);

        // Wrong guess number text
        wrongGuessNumberText.setFont(Font.font("Helvetica", 24));
        wrongGuessNumberText.setFill(INFO_COLOR);
        HBox wrongGuessNumberBox = new HBox(wrongGuessNumberText);
        wrongGuessNumberBox.setAlignment(Pos.CENTER);
        mainVBox.getChildren().add(wrongGuessNumberBox);

        // Play Again button
        playAgainButton = new Button("Play Again");
        playAgainButton.setOnAction(this::handleButton);
        playAgainButton.setVisible(false);
        HBox buttonBox = new HBox(playAgainButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        mainVBox.getChildren().add(buttonBox);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Game Starts here

        // Check if words.txt file exists
        addWordsFromTextFile();

        // Starts game
        gameStart();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Main Window

        Scene scene = new Scene(mainVBox, 550, 500);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void gameStart() {
        try {
            // Initial game stats clear
            gameClearStats();

            // Setting ints
            remainingGuesses = MAX_WRONG_GUESSES;     // set remaining amount of guesses

            // Setting text and strings
            currentWord = chooseWord().toUpperCase();                   // Get Random word for Current word in UpperCase
            displayedCurrentWord = getHiddenString(currentWord);        // Make hidden copy of Current word
            listCharsCurrent = getListCharsOfString(currentWord);       // Make list of chars of Current word

            outcomeText.setText("");                            // Text based on result of input
            wrongGuessNumberText.setText("");                   // Text number of guesses

            currentWordText.setText(displayedCurrentWord);      // Text of displayedCurrentWord
            wrongGuessesText.setText("Wrong Guesses: []");      // Text of amount of wrong guesses

            printDebug();
        } catch (Exception e) {
            handleGeneralException(e);
        }
    }

    private void gameClearStats() {
        listCharsCurrent.clear();
        listCharsGuessWrong.clear();
        listCharsGuessCorrect.clear();
    }

    private void checkGameCondition() {
        printDebug();

        if (displayedCurrentWord.equals(currentWord)) {
            checkGameConditionHelper(
                    String.format("You won!"),
                    "Game loss");

        } else if (remainingGuesses == 0) {
            checkGameConditionHelper(
                    String.format("The word was (%s)", currentWord),
                    "Game loss");
        }
    }

    private void checkGameConditionHelper(String stringOutcomeText, String stringPrintln) {
        checkGameConditionHelper(stringOutcomeText, stringPrintln, true, true);
    }

    private void checkGameConditionHelper(String stringOutcomeText, String stringPrintln, boolean booleanGuessField, boolean booleanPlayAgainButton) {
//        guessField.setDisable(true);        // Inaccessible
//        playAgainButton.setVisible(true);   // Appear

        outcomeText.setText(stringOutcomeText);
        System.out.println(stringPrintln);

        guessField.setDisable(booleanGuessField);
        playAgainButton.setVisible(booleanPlayAgainButton);

    }

    private void printDebug() {
        System.out.println((String.format(
                "currentWord: %s\n" +
                        "listCharsCurrent: %s\n" +
                        "listCharsGuessWrong: %s\n" +
                        "listCharsGuessCorrect: %s\n" +
                        "_____________________________________________\n",
                currentWord,
                listCharsCurrent,
                listCharsGuessWrong,
                listCharsGuessCorrect)));
    }

    private void handleButton(ActionEvent actionEvent) {
        guessField.setDisable(false);       // Accessible
        playAgainButton.setVisible(false);  // Disappear

        gameStart();
    }

    private void handleGuessField(ActionEvent actionEvent) {
        // Get user input
        String guessInput = guessField.getText();

        // Valid Chars Only
        if (isValidUserInput(guessInput)) {
            char guessChar = guessInput.charAt(0);
            char guessCharUpper = Character.toUpperCase(guessChar);

            System.out.println("Guess Char Upper is: " + guessCharUpper);

            // Already Guessed Chars
            if (listCharsGuessWrong.contains(guessCharUpper) || listCharsGuessCorrect.contains(guessCharUpper)) {

                outcomeText.setText("You've already guessed that letter.");

            }
            // Char in Current (Right)
            else if (listCharsCurrent.contains(guessCharUpper)) {
                displayedCurrentWord = modifyDisplayedCurrentWord(guessCharUpper);
                currentWordText.setText(displayedCurrentWord);

                addCharToGivenList(guessCharUpper, listCharsGuessCorrect);
                outcomeText.setText("Good Guess!");

            }
            // Char not in Current (Wrong)
            else {
                addCharToGivenList(guessCharUpper, listCharsGuessWrong);
                outcomeText.setText("Nope! Try again.");

                remainingGuesses--;
            }
        }

        wrongGuessNumberText.setText(String.format("Number of Guesses Remaining: %s", remainingGuesses));
        wrongGuessesText.setText(String.format("Wrong Guesses: %s", listCharsGuessWrong.toString()));

        guessField.clear();

        // Check Game Status
        checkGameCondition();
    }

    // If only it was a first class citizen...
    private String chooseWord() throws Exception {
        String randomWord = listOfGuessableWords.get((int) (Math.random() * listOfGuessableWords.size()));
        return randomWord;
    }

    private boolean isValidUserInput(String userInput) {
        try {
            if (userInput.length() < 1) {
                throw new UserInputEmpty();
            } else if (userInput.length() > 1) {
                throw new UserInputTooLong();
            } else if (!Character.isAlphabetic(userInput.charAt(0))) {
                throw new UserInputContainsIllegalCharacter();
            } else {
                System.out.println("Input is valid");
                return true;
            }
        } catch (UserInputEmpty | UserInputTooLong | UserInputContainsIllegalCharacter e) {
            System.out.println(e);
            outcomeText.setText(e.getMessage());
            System.out.println("Input is invalid");
            return false;
        }
    }

    private List<Character> getListCharsOfString(String word) {
        List<Character> listOfChars = new ArrayList<>();
        char[] arrayOfChars = word.toCharArray();

        for (char letter : arrayOfChars) {
            listOfChars.add(letter);
        }
        return listOfChars;
    }

    private String getHiddenString(String text) {
        String separator = "-";
        String displayString = "";

        for (int i = 0; i < text.length(); i++) {
            displayString += separator;
        }
        return displayString;
    }

    private String modifyDisplayedCurrentWord(char givenChar) {
        char[] tempHiddenCurrentWord = displayedCurrentWord.toCharArray();

        for (int i = 0; i < listCharsCurrent.size(); i++) {
            if (givenChar == listCharsCurrent.get(i).charValue()) {
                tempHiddenCurrentWord[i] = givenChar;
            }
        }
        return String.valueOf(tempHiddenCurrentWord);
    }

    // If only it was a first class citizen...
    private void addWordsFromTextFile() {
        try {
            Scanner scan = new Scanner(new FileReader(new File(filePath)));

            while (scan.hasNext()) {
                listOfGuessableWords.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            handleGeneralException(e, filePath);

        } catch (Exception e) {
            handleGeneralException(e);
        }

    }

    private void addCharToGivenList(char c, List<Character> listChar) {
        if (listChar.contains(c)) {
            System.out.println(String.format("Character (%s) in %s already!", c, listChar));
        } else {
            listChar.add(c);
        }
    }

    private void handleGeneralException(Exception e, String additionalText) {
        handleGeneralException(String.format("%s\n\n(%s)", e, additionalText));
    }

    private void handleGeneralException(Exception e) {
        handleGeneralException(e.toString());
    }

    private void handleGeneralException(String e) {
        System.out.println(e);

        guessField.setDisable(true);        // Inaccessible

        outcomeText.setText("Please close game!");

        errorAlert.setContentText(e);
        errorAlert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
