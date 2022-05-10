package hellonft;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import utility.ImageFinders.WorkshopSymbolFinder;
import utility.JavaSquire;
import utility.Settings;
import utility.physicality.Draggable;

public class HelloNFTTeacher extends Pane {

    private ImageView workshopView;
    private ImageView diamondView;
    private Image dancingSquidwardClip;
    private Image dancingFrogClip;

    public enum DancingImageEnum {
        SQUIDWARD, FROG
    }
    private DancingImageEnum currentDancer = DancingImageEnum.SQUIDWARD;

    public HelloNFTTeacher(){
        addBackdrop();
        addDancingDiamond();
        addShapeButton();
        addFunctionToButton();
    }

    private void addBackdrop() {

        Image backdropSpace2 = new Image("/assets/backdrops/space/spaceBlack.jpg");
        ImageView spaceView2 = new ImageView(backdropSpace2);
        spaceView2.setFitWidth(Settings.getScreenWidth());
        spaceView2.setPreserveRatio(true);
        this.getChildren().add(spaceView2);
        Image backdropValley = new Image("/assets/backdrops/surreal/skyValley4200.png");
        ImageView backdropViewValley = new ImageView(backdropValley);
        backdropViewValley.setFitWidth(Settings.getScreenWidth());
        backdropViewValley.setPreserveRatio(true);
        this.getChildren().add(backdropViewValley);
    }
    private void addDancingDiamond() {

        this.dancingFrogClip = new Image("/assets/hellonft/dancingFrog.gif");
        this.dancingSquidwardClip = new Image("/assets/hellonft/dancingSquidward.gif");

        Image diamondImage = new Image("/assets/hellonft/diamond.png");
        this.diamondView = new ImageView(diamondImage);
        diamondView.setFitWidth(1024);
        diamondView.setPreserveRatio(true);
        this.getChildren().add(diamondView);

        ImageView squidwardView = new ImageView(this.dancingSquidwardClip);
        squidwardView.setFitWidth(1024);
        squidwardView.setPreserveRatio(true);

        diamondView.setClip(squidwardView);

    }
    private void addShapeButton() {

        WorkshopSymbolFinder symbolFinder = new WorkshopSymbolFinder();
        Image workshopImg = symbolFinder.getSymbolByEnum(WorkshopSymbolFinder.WorkshopSymbolEnum.CONFIRM);
        this.workshopView = new ImageView(workshopImg);
        JavaSquire.resizeImage(workshopView,128,128);
        Draggable.Nature makeMeDrag = new Draggable.Nature(workshopView);
        this.getChildren().add(workshopView);

        workshopView.setLayoutX(Settings.getScreenWidth() * 0.75);
        workshopView.setLayoutY(Settings.getScreenHeight() * 0.5);


    }
    private void addFunctionToButton(){


        workshopView.setOnMouseClicked(event -> {

            if (currentDancer == DancingImageEnum.SQUIDWARD) {
                currentDancer = DancingImageEnum.FROG;
                ImageView frogView = new ImageView(this.dancingFrogClip);
                frogView.setFitWidth(1024);
                frogView.setPreserveRatio(true);
                this.diamondView.setClip(frogView);

            } else if (currentDancer == DancingImageEnum.FROG) {
                currentDancer = DancingImageEnum.SQUIDWARD;
                ImageView squidwardView = new ImageView(dancingSquidwardClip);
                squidwardView.setFitWidth(1024);
                squidwardView.setPreserveRatio(true);
                this.diamondView.setClip(squidwardView);

            }
        });
    }


}
