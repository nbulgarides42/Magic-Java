package appentry;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class TurtleTower extends Pane {

    private ImageView backdropView;

    public TurtleTower(String resourceAddress, int width, int height) {
        Image image = new Image(resourceAddress);
        this.backdropView = new ImageView(image);
        this.backdropView.setFitWidth(width);
        this.backdropView.setFitHeight(height);
        this.getChildren().add(this.backdropView);
        addShakespeare();
        addTheatreBackground();
    }

    private void addShakespeare() {
        Image shakespeare = new Image("/assets/hellonft/shakespeare.png");
        ImageView shakespeareView = new ImageView(shakespeare);
        shakespeareView.setFitWidth(500);
        shakespeareView.setPreserveRatio(true);
        this.getChildren().add(shakespeareView);
        shakespeareView.setLayoutY(500);
        shakespeareView.setLayoutX(800);
    }

    private void addTheatreBackground() {
        Image theater = new Image("/assets/backdrops/indoors/backdropClub.png");
        ImageView theaterView = new ImageView(theater);
        theaterView.setFitWidth(1920);
        theaterView.setPreserveRatio(true);
        this.getChildren().add(theaterView);
    }
}
