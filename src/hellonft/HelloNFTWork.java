package hellonft;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import utility.ImageFinders.WorkshopSymbolFinder;
import utility.JavaSquire;
import utility.Settings;

public class HelloNFTWork extends Pane {

    private ImageView workshopView;
    private ImageView diamondView;
    private Image dancingSquidwardClip;
    private Image dancingFrogClip;
    private Image diamondImage;

    private HelloNFTTeacher.DancingImageEnum currentDancer = HelloNFTTeacher.DancingImageEnum.SQUIDWARD;

    public HelloNFTWork(){
        addBackdrop();
        addDancingDiamond();
        addShapeButton();
        addFunctionToButton();
    }

    //Work to complete 1.1
    private void addBackdrop() {

    }
    //Work to complete 1.2
    private void addDancingDiamond() {

    }

    //Work to complete 1.3
    private void addShapeButton() {

    }

    //Work to complete 1.4
    private void addFunctionToButton() {

    }
}
