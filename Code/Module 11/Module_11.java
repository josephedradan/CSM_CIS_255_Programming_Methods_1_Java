import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;

public class Module_11 extends Application {
    private Button eyeColorButton;
    private Circle faceCircle, leftEye, rightEye, nose;
    private Rectangle mouth;
    private final int EYE_RADIUS = 20;
    private final int LEFT_EYE_CENTER_X = 165;
    private final int RIGHT_EYE_CENTER_X = 325;
    private CheckBox descriptionDisplayCheckBox;

    private ImageView memeTestImageView2;


    private RadioButton dogPictureRadioButton, catPictureRadioButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();

        /* Scaling */
        // FIRST IMAGE
        Image memeTestImage = new Image("memeTest.png", 200, 200, true, true);
        ImageView memeTestImageView = new ImageView(memeTestImage);

        // SECOND IMAGE
        // Question 2
        memeTestImageView2 = new ImageView(memeTestImage);
        memeTestImageView2.setScaleX(.5);
        memeTestImageView2.setScaleY(.5);
        // Question 4
        // Will Rotate Counter Clock
        memeTestImageView2.setRotate(-10);


        // ADDING BOTH IMAGES TO HBox
        HBox imageBox = new HBox(memeTestImageView, memeTestImageView2);
        // ADDING imageBox to group
        group.getChildren().add(imageBox);

        //Pane pane = new FlowPane(group);
        // ADDING group to scene

        // Question 5
        // In the Java coordinate system, the point (0, 0) is ________. Upper Left

        // Question 6
        Ellipse ellipse = new Ellipse(100, 200, 90, 55);
        // Move 100 Right, Move 200 Down, etc... RELATIVE TO CORNER LEFT TOP
        group.getChildren().add(ellipse);

        // Question 7
        // 200 pixels wide, 400 pixels high, and its upper-left corner position is at point (50, 30)?
//        Rectangle shape = new Rectangle(50, 30, 200, 400);
//        shape.setScaleX(.5);
//        shape.setScaleY(.5);
//        group.getChildren().add(shape);


///////////////////////////////////////////
        // Question 8 and above
        // Question 8
        // The code creates a green circle, centered at coordinates (100, 100).
        // Question 9
        // The rectangle will have a blue border.
        // Question 10
        // The circle will have a black border.
        // Question 11
        // Which of the following is true?
        // The rectangle overlaps the circle. Because the rectangle is transparent, the circle is still visible.
        //

        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.GREEN);

        Rectangle rectangle = new Rectangle(70, 70, 225, 75);
        rectangle.setStroke(Color.BLUE);
        rectangle.setStrokeWidth(2);
        rectangle.setFill(Color.TRANSPARENT);

        group.getChildren().add(circle);
        group.getChildren().add(rectangle);

        // Question 12
        eyeColorButton = new Button("Change Eye Color");
        eyeColorButton.setOnAction(this::handleEyeColorButton);

        leftEye = new Circle(LEFT_EYE_CENTER_X, 125, EYE_RADIUS);
        leftEye.setFill(Color.GREEN);
        leftEye.setStroke(Color.BLACK);

        rightEye = new Circle(RIGHT_EYE_CENTER_X, 125, EYE_RADIUS);
        rightEye.setFill(Color.GREEN);
        rightEye.setStroke(Color.BLACK);

        group.getChildren().add(leftEye);
        group.getChildren().add(rightEye);
///////////////////////////////////////////
        // Question 13
        // The logical relationship between radio buttons is defined using what class?
        // ToggleGroup

        // Question 12
        // If you forget to group together RadioButton objects, what will happen?
        // there will be a compiler error

        ToggleGroup pictureGroup = new ToggleGroup();
        dogPictureRadioButton = new RadioButton("Dog Picture");
        dogPictureRadioButton.setToggleGroup(pictureGroup);
        dogPictureRadioButton.setSelected(true);
        dogPictureRadioButton.setOnAction(this::handlePictureRadioButtons);

        catPictureRadioButton = new RadioButton("Cat Picture");
        catPictureRadioButton.setToggleGroup(pictureGroup);
        catPictureRadioButton.setOnAction(this::handlePictureRadioButtons);


        // ADD BOTH BUTTONS TO THE radioButtonBox
        HBox radioButtonBox = new HBox(dogPictureRadioButton, catPictureRadioButton);
        radioButtonBox.setAlignment(Pos.CENTER);
        radioButtonBox.setSpacing(10);

        // Not Grouping the buttons will still work but not have the buttons
        group.getChildren().add(radioButtonBox);
///////////////////////////////////////////
        // Question 15
        descriptionDisplayCheckBox = new CheckBox("Display Description");
        descriptionDisplayCheckBox.setSelected(true);
        descriptionDisplayCheckBox.setOnAction(this::handleDescriptionCheckbox);
        group.getChildren().add(descriptionDisplayCheckBox);

        // Question 3
        // CAN NOT ADD IMAGE TO Scene Graph
        Scene scene = new Scene(group, 400, 400);
        //        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Transformations!");
        primaryStage.show();

        //////////////
        // Question 19
        // Optional<String> userInput1 = inputDialog.showAndWait();
        // It will return Optional<String>
    }

    private void handleEyeColorButton(ActionEvent event) {
        Color eyeColor = Color.color(Math.random(), Math.random(), Math.random());
        leftEye.setFill(eyeColor);
        rightEye.setFill(eyeColor);
    }

    private void handlePictureRadioButtons(ActionEvent event) {
        // Question 16
        // isSelected for Radio
        if (dogPictureRadioButton.isSelected()) {
//            memeTestImageView2.setImage(dogImage);
            memeTestImageView2.setRotate(90);
//            animalDescription.setText(dogName);

        } else if (catPictureRadioButton.isSelected()) {
//            memeTestImageView2.setImage(catImage);
            memeTestImageView2.setRotate(0);
//            animalDescription.setText(catName);
        }
    }

    private void handleDescriptionCheckbox(ActionEvent event) {
        if (descriptionDisplayCheckBox.isSelected()) {
//            animalDescription.setVisible(true);
        } else if (!descriptionDisplayCheckBox.isSelected()) {
//            animalDescription.setVisible(false);
        }
    }

    // Question 18
    // A MouseEvent object contains data bout the location of the mouse when the event occurred.
    // ANSWER IS FALSE
    private void handleMouse(MouseEvent event) {
//        clickCount++;
//        clickCountText.setText("Click Count: " + clickCount);

        double x = event.getX();
        double y = event.getY();

//        Circle circle = new Circle(x, y, CIRCLE_RADIUS);
//        String coordinateString = "(" + x + ", " + y + ")";
//        Text coordinates = new Text(x-CIRCLE_RADIUS, y-CIRCLE_RADIUS-2, coordinateString);
//        pane.getChildren().add(circle);
//        pane.getChildren().add(coordinates);

    }
}
