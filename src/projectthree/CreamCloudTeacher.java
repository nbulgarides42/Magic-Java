package projectthree;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.util.Duration;
import utility.JavaSquire;
import utility.Settings;
import utility.physicality.Draggable;

import java.util.ArrayList;
import java.util.Random;


public class CreamCloudTeacher extends Pane {

    private ArrayList<Image> creamImageList;
    private Random random;
    private TilePane randomCreamPane;
    private int yOffset;
    private int xOffset;

    public CreamCloudTeacher(double scale, int yOffset, int xOffset) {
        this.setScaleX(scale);
        this.setScaleY(scale);
        this.yOffset = yOffset;
        this.xOffset = xOffset;

        this.setTranslateY(yOffset);
        this.setTranslateX(xOffset);
        Draggable.Nature makeMeDrag = new Draggable.Nature(this);

        this.random = new Random();
        initializeCollections();
        loadCreamImages();
        loadCreamPane();
        addMotionToCloud();
    }


    private void addMotionToCloud() {

        TranslateTransition cloudMotion = new TranslateTransition();
        cloudMotion.setFromX(xOffset);
        cloudMotion.setToX(Settings.getScreenWidth()+200);
        cloudMotion.setNode(this);
        cloudMotion.setDuration(Duration.millis(10000));
        cloudMotion.setCycleCount(Animation.INDEFINITE);
        cloudMotion.play();

        cloudMotion.setOnFinished(e -> {
            this.setTranslateX(xOffset);
        });

    }

    private void loadCreamPane() {

        this.randomCreamPane = new TilePane();
        this.randomCreamPane.setPrefColumns(8);
        this.randomCreamPane.setHgap(-100);
        this.randomCreamPane.setVgap(-100);

        int counter = 0;
        while (counter < 40) {

            Image creamImage = this.creamImageList.get(random.nextInt(this.creamImageList.size()));
            ImageView creamView = new ImageView(creamImage);
            JavaSquire.resizeImage(creamView,256,256);
            this.randomCreamPane.getChildren().add(creamView);
            counter++;
        }
        this.getChildren().add(this.randomCreamPane);
        ImageView cloudCrop = new ImageView(new Image("/assets/projectthree/cream/cloudOutlineSolid.png"));
        JavaSquire.resizeImage(cloudCrop, 1024,1024);
        this.randomCreamPane.setClip(cloudCrop);

        ImageView cloudOutline = new ImageView(new Image("/assets/projectthree/cream/cloudOutline.png"));
        JavaSquire.resizeImage(cloudOutline,1024,1024);
        this.getChildren().add(cloudOutline);
    }


    private void initializeCollections() {
        this.creamImageList = new ArrayList<Image>();
    }

    private void loadCreamImages() {
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream1.png"));
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream2.png"));
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream3.png"));
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream4.png"));
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream5.png"));
        this.creamImageList.add(new Image("/assets/projectthree/cream/cream6.png"));
    }

}
