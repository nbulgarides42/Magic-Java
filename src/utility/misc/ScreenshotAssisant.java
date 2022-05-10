package utility.misc;

import javafx.scene.image.Image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenshotAssisant {

    private Robot screenshotRobot;
    public ScreenshotAssisant() {

    }


    public Image takeFullScreenshot() throws AWTException {
        this.screenshotRobot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenFullImage = screenshotRobot.createScreenCapture(screenRect);

        //Image convertedImage = SwingFXUtils.toFXImage(screenFullImage,null);
        Image convertedImage = new Image("entities/beasts/lakeTerror.png");
        return convertedImage;
    }


}
