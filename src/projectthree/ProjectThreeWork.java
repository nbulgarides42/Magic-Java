package projectthree;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import utility.JavaSquire;
import utility.Settings;

public class ProjectThreeWork extends Pane {

    private ImageView castleView;
    private Pane mountainPane;
    public ProjectThreeWork(){
        addBackdrop();
        addMountainValley();
        addCastleBackdrop();
        addCreamCloud();
    }

    private void addBackdrop() {
        ImageView backdropView = new ImageView(new Image("/assets/projectthree/black1.jpg"));
        JavaSquire.resizeImage(backdropView, Settings.getScreenWidth(), Settings.getScreenHeight());
        this.getChildren().add(backdropView);
    }
    private void addMountainValley() {

        ImageView mountainValley = new ImageView(new Image("/assets/projectthree/backdropSkyMountains.png"));
        mountainValley.setFitWidth(Settings.getScreenWidth());
        mountainValley.setPreserveRatio(true);
        this.mountainPane = new Pane();
        this.mountainPane.getChildren().add(mountainValley);
        this.getChildren().add(this.mountainPane);


    }
    private void addCastleBackdrop() {
        this.castleView = new ImageView(new Image("/assets/projectthree/castle4K.png"));
        this.castleView.setFitWidth(600);
        this.castleView.setPreserveRatio(true);
        this.castleView.setLayoutX((Settings.getScreenWidth() / 2)-(castleView.getFitWidth() /2));
        this.castleView.setLayoutY((Settings.getScreenHeight() / 2));
        this.getChildren().add(this.castleView);
    }



    private void addCreamCloud() {
    }

}
