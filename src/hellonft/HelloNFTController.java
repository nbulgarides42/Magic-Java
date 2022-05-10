package hellonft;

import appentry.TurtleTower;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import typography.TypographyBubble;
import typography.TypographyFactory;
import utility.JavaSquire;
import utility.Settings;
import utility.ImageFinders.WorkshopSymbolFinder;

import java.util.ArrayList;

public class HelloNFTController {

    private TurtleTower turtleTower;
    private HelloNFT helloNFT;
    private ImageView hideView;
    public TypographyFactory typographyFactory;

    public WorkshopSymbolFinder workshopSymbolFinder;

    /** Notes 1.5 - we look at the displayHelloNFT function we've created which we add
     * to the base turtle stack
     * createHideWindowScreen and addMyNFTCreations here start off //commented out
     * We will uncomment these out as we progress through lesson 1
     * Note that uncommenting displayHelloNFT adds an entirely new view to the window -
     * @param turtleTower
     */

    public HelloNFTController(TurtleTower turtleTower) {
        this.workshopSymbolFinder = new WorkshopSymbolFinder();
        this.turtleTower = turtleTower;
        generateTypographyFactory(); //Don't worry about the typography factory right now, we will revisit this in a later lesson
        //displayHelloNFT(); //starts off commented out
        //createHideWindowScreen(); //starts off commented out
      // addMyNFTCreationsHere(); //starts off commented out
    }


    /**
     * 1.51 - The typography factory that will be used to generate visuals for text
     */
    private void generateTypographyFactory() {
        this.typographyFactory = new TypographyFactory();
    }


    /**
     * 1.52 - The method below adds the HelloNFT pane to our turtle stack so we can examine the various functions
     *
     */

    private void displayHelloNFT() {
        this.helloNFT = new HelloNFT(this);
        this.turtleTower.getChildren().add(this.helloNFT);
    }
    /** Note 1.53 - Hide WindowScreen function to toggle between theatre pane and hellonft
     * Loads the workshop symbol finder and uses it to generate a visibility icon
     * which is added to the bottom right corner of the screen. Clicking it
     * toggles the visibility of the HelloNFT space-themed "pane" or window.
     */
    private void createHideWindowScreen() {

        Image visibilitySymbol = this.workshopSymbolFinder.getSymbolByEnum(WorkshopSymbolFinder.WorkshopSymbolEnum.VISIBILITY);
        this.hideView = new ImageView(visibilitySymbol);
        JavaSquire.resizeImage(this.hideView,256,256);

        //Use of - 300, - 300 to offset the visibility icon from the edge of the screen
        this.hideView.setLayoutX(Settings.getScreenWidth() - 300);
        this.hideView.setLayoutY(Settings.getScreenHeight() - 300);

        //node this "lambda" syntax below for having actions occur on a click event on a node
        this.turtleTower.getChildren().add(this.hideView);
        this.hideView.setOnMouseClicked(event -> {
            toggleVisibilityOfNFT();
        });
    }

    /**
     * The visibility is determined, automatically negated and then in one additional line the visibility of the base pane is updated
     */
    private void toggleVisibilityOfNFT() {
        boolean isVisible = !this.helloNFT.isVisible();
        this.helloNFT.setVisible(isVisible);
    }

    /**
     * Section 1.6 - here is where we will be adding the Pane made by the code we will be writing to the screen
     * Your HelloNFTWork class is in the form of a Pane, meaning you can directly it add it to the screen as if you were
     * pasting a printed out picture and displaying it. Because they are pages, you can toggle between which one is displayed at a given time
     * THIS IS WHERE YOU WILL BE ADDING
     * UNCOMMENT line 70 this.turtleTower.getChildren().add(new HelloNFTWork());
     */
    private void addMyNFTCreationsHere() {

        //this.turtleTower.getChildren().add(new HelloNFTWork());
        //this.turtleTower.getChildren().add(new HelloNFTTeacher()); //starts off commented out

    }





    /**
     * Ignore this for now, this is more advanced code that uses the custom class TypographyFactory to generate visuals
     * to accompany text
     */

    public void displayTextFromTextArea(String text) {
        TypographyBubble bubble = this.typographyFactory.getBubbleFromWord(text);
        ArrayList<Image> letterImages = bubble.bubbleContentImages;
        HBox testHbox = new HBox();

        int counter = 0;
        while (counter < letterImages.size()) {
            ImageView letterView = new ImageView(letterImages.get(counter));
            letterView.setFitHeight(200);
            letterView.setPreserveRatio(true);
            testHbox.getChildren().add(letterView);
            counter++;
        }

        this.helloNFT.getChildren().add(testHbox);

    }
}
