package utility.ImageFinders;

import javafx.scene.image.Image;

import java.util.HashMap;

public class DigitImgFinder {

    public enum DigitColorEnum {
        BLACK, BLUE, GREEN, RED
    }
    private HashMap<Integer, String> greenDigitResourceMap;
    private HashMap<Integer, Image> greenDigitImageMap;
    private HashMap<Integer, String> blackDigitResourceMap;
    private HashMap<Integer, Image> blackDigitImageMap;
    private HashMap<Integer, String> blueDigitResourceMap;
    private HashMap<Integer, Image> blueDigitImageMap;
    private HashMap<Integer, String> redDigitResourceMap;
    private HashMap<Integer, Image> redDigitImageMap;


    public DigitImgFinder(){
        initializeCollections();
        loadResourceMaps();
    }

    /**
        Using the color enum with possibilities of BLUE, GREEN, RED, BLACK, automatically
     switch the targeted map to the matching color resource map and color image map
     if a digit is already loaded, retrieve and return the image, if the digit image has not
     been loaded, then the image is loaded, stored and then returned, thus causing zero wasted / reloaded
     images
     */
    public Image getDigitImageByColorAndInt(DigitColorEnum digitColor, Integer digit) {
        Image digitImageToReturn = null;

        HashMap<Integer, Image> matchingImageMap = null;
        HashMap<Integer, String> matchingResourceMap = null;

        switch (digitColor) {

            case RED: {
                matchingImageMap = redDigitImageMap;
                matchingResourceMap = redDigitResourceMap;
            } case BLUE: {
                matchingImageMap = blueDigitImageMap;
                matchingResourceMap = blueDigitResourceMap;
            } case BLACK: {
                matchingImageMap = blackDigitImageMap;
                matchingResourceMap = blackDigitResourceMap;
            } case GREEN: {
                matchingImageMap = greenDigitImageMap;
                matchingResourceMap = greenDigitResourceMap;
            }
        }

        if (matchingImageMap.containsKey(digit)) {
            digitImageToReturn = matchingImageMap.get(digit);
        } else {
            Image digitImage = new Image(matchingResourceMap.get(digit));
            matchingImageMap.put(digit, digitImage);
            digitImageToReturn = digitImage;
        }
        return digitImageToReturn;
    }

    /**
     * Initialize the two sets of hash maps, the resource maps containing the string addresses of images
     * and the image hash maps which will contain the images once they have been called at least once
     */
    private void initializeCollections() {
        this.redDigitResourceMap = new HashMap<Integer, String>();
        this.redDigitImageMap = new HashMap<Integer, Image>();
        this.greenDigitResourceMap = new HashMap<Integer, String>();
        this.greenDigitImageMap = new HashMap<Integer, Image>();
        this.blackDigitResourceMap = new HashMap<Integer, String>();
        this.blackDigitImageMap = new HashMap<Integer, Image>();
        this.blueDigitResourceMap = new HashMap<Integer, String>();
        this.blueDigitImageMap = new HashMap<Integer, Image>();
    }

    /**
     * These four methods load the String addresses for the images of the corresponding color
     * when a digit image of a specific color is requested, first the corresponding hash map
     * is checked to see if that image is already loaded, if yes, return image, if no, load image,
     * then store the image in the matching hash map to avoid ever double loading an image. This is maximum
     * efficiency for loading images, and image finders throughout this course will use this setup.
     */
    private void loadResourceMaps() {
        loadRedDigitResources();
        loadBlueDigitResources();
        loadGreenDigitResources();
        loadBlackDigitResources();
    }

    private void loadBlackDigitResources() {
        this.blackDigitResourceMap.put(0, "/assets/symbols/digits/digitsBlack/zeroBlack.png");
        this.blackDigitResourceMap.put(1, "/assets/symbols/digits/digitsBlack/zeroOne.png");
        this.blackDigitResourceMap.put(2, "/assets/symbols/digits/digitsBlack/zeroTwo.png");
        this.blackDigitResourceMap.put(3, "/assets/symbols/digits/digitsBlack/zeroThree.png");
        this.blackDigitResourceMap.put(4, "/assets/symbols/digits/digitsBlack/zeroFour.png");
        this.blackDigitResourceMap.put(5, "/assets/symbols/digits/digitsBlack/zeroFive.png");
        this.blackDigitResourceMap.put(6, "/assets/symbols/digits/digitsBlack/zeroSix.png");
        this.blackDigitResourceMap.put(7, "/assets/symbols/digits/digitsBlack/zeroSeven.png");
        this.blackDigitResourceMap.put(8, "/assets/symbols/digits/digitsBlack/zeroEight.png");
        this.blackDigitResourceMap.put(9, "/assets/symbols/digits/digitsBlack/zeroNine.png");
    }
    private void loadGreenDigitResources() {
        this.greenDigitResourceMap.put(0, "/assets/symbols/digits/digitsGreen/zeroGreen.png");
        this.greenDigitResourceMap.put(1, "/assets/symbols/digits/digitsGreen/oneGreen.png");
        this.greenDigitResourceMap.put(2, "/assets/symbols/digits/digitsGreen/twoGreen.png");
        this.greenDigitResourceMap.put(3, "/assets/symbols/digits/digitsGreen/threeGreen.png");
        this.greenDigitResourceMap.put(4, "/assets/symbols/digits/digitsGreen/fourGreen.png");
        this.greenDigitResourceMap.put(5, "/assets/symbols/digits/digitsGreen/fiveGreen.png");
        this.greenDigitResourceMap.put(6, "/assets/symbols/digits/digitsGreen/sixGreen.png");
        this.greenDigitResourceMap.put(7, "/assets/symbols/digits/digitsGreen/sevenGreen.png");
        this.greenDigitResourceMap.put(8, "/assets/symbols/digits/digitsGreen/eightGreen.png");
        this.greenDigitResourceMap.put(9, "/assets/symbols/digits/digitsGreen/nineGreen.png");
    }
    private void loadBlueDigitResources() {
        this.blueDigitResourceMap.put(0, "/assets/symbols/digits/digitsBlue/zeroBlue.png");
        this.blueDigitResourceMap.put(1, "/assets/symbols/digits/digitsBlue/oneBlue.png");
        this.blueDigitResourceMap.put(2, "/assets/symbols/digits/digitsBlue/twoBlue.png");
        this.blueDigitResourceMap.put(3, "/assets/symbols/digits/digitsBlue/threeBlue.png");
        this.blueDigitResourceMap.put(4, "/assets/symbols/digits/digitsBlue/fourBlue.png");
        this.blueDigitResourceMap.put(5, "/assets/symbols/digits/digitsBlue/fiveBlue.png");
        this.blueDigitResourceMap.put(6, "/assets/symbols/digits/digitsBlue/sixBlue.png");
        this.blueDigitResourceMap.put(7, "/assets/symbols/digits/digitsBlue/sevenBlue.png");
        this.blueDigitResourceMap.put(8, "/assets/symbols/digits/digitsBlue/eightBlue.png");
        this.blueDigitResourceMap.put(9, "/assets/symbols/digits/digitsBlue/nineBlue.png");
    }
    private void loadRedDigitResources() {
        this.redDigitResourceMap.put(0,"/assets/symbols/digits/digitsRed/zeroRed.png");
        this.redDigitResourceMap.put(1,"/assets/symbols/digits/digitsRed/oneRed.png");
        this.redDigitResourceMap.put(2,"/assets/symbols/digits/digitsRed/twoRed.png");
        this.redDigitResourceMap.put(3,"/assets/symbols/digits/digitsRed/threeRed.png");
        this.redDigitResourceMap.put(4,"/assets/symbols/digits/digitsRed/fourRed.png");
        this.redDigitResourceMap.put(5,"/assets/symbols/digits/digitsRed/fiveRed.png");
        this.redDigitResourceMap.put(6,"/assets/symbols/digits/digitsRed/sixRed.png");
        this.redDigitResourceMap.put(7,"/assets/symbols/digits/digitsRed/sevenRed.png");
        this.redDigitResourceMap.put(8,"/assets/symbols/digits/digitsRed/eightRed.png");
        this.redDigitResourceMap.put(9,"/assets/symbols/digits/digitsRed/nineRed.png");
    }


}
