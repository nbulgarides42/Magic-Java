package typography;

import javafx.scene.image.Image;
import utility.ImageFinders.LetterImgHashMap;

import java.util.ArrayList;
import java.util.Random;

public class TypographyFactory {
    private Random random;
    private LetterImgHashMap letterImgHashMap;
    private boolean lettersLoaded = false;
    public TypographyFactory(){

        this.letterImgHashMap = new LetterImgHashMap(this);
        Thread thread = new Thread(this.letterImgHashMap);
        thread.start();

        this.random = new Random();
    }

    public TypographyBubble getBubbleFromWord(String word) {
        ArrayList<Image> letterImages = new ArrayList<Image>();
        addEveryLetterToImageList(word, letterImages);

        TypographyBubble typographyBubble = new TypographyBubble(word,letterImages);

        return typographyBubble;
    }

    private void addEveryLetterToImageList(String word, ArrayList<Image> letterImages) {

        String subLetter = "";
        int counter = 0;

        while (counter < word.length()) {

            subLetter = word.substring(counter,counter+1).toUpperCase();
            if (this.letterImgHashMap.allLetterImagesMap.containsKey(subLetter)) {
                ArrayList<Image> imageList = this.letterImgHashMap.allLetterImagesMap.get(subLetter);
                int randomSlot = random.nextInt(imageList.size());
                Image imgToAdd = imageList.get(randomSlot);
                letterImages.add(imgToAdd);
            }
            counter++;
        }
    }

    public void setLettersLoaded(boolean loaded) {
        this.lettersLoaded = loaded;
    }

    public boolean getLettersLoaded() {
        return this.lettersLoaded;
    }
}
