package typography;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class TypographyBubble {

    public String bubbleContentString;
    public ArrayList<Image> bubbleContentImages;

    public TypographyBubble(String word, ArrayList<Image> bubbleImg) {
        this.bubbleContentString = word;
        this.bubbleContentImages = bubbleImg;
    }
}
