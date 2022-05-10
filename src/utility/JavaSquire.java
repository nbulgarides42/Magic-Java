package utility;

import javafx.scene.image.ImageView;

public class JavaSquire {


    public static void resizeImage(ImageView resizeMe, int width, int height) {
        resizeMe.setFitHeight(height);
        resizeMe.setFitWidth(width);
    }

}
