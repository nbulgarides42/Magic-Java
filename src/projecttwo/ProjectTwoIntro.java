package projecttwo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import utility.ImageFinders.WorkshopSymbolFinder;
import utility.JavaSquire;
import utility.Settings;
import utility.physicality.Draggable;

public class ProjectTwoIntro extends Pane {

    private enum LeftRightSwapEnum {
        LEFTSWAP, RIGHTSWAP
    }
    private LeftRightSwapEnum currentSwapState = LeftRightSwapEnum.RIGHTSWAP;
    private WorkshopSymbolFinder workshopSymbolFinder;
    private BorderPane demoBorderPane;
    private VBox flowerVBox1;
    private VBox flowerVBox2;
    public ProjectTwoIntro(){
        addBackdrop();
        addDemoBorderPane();
        addExampleBorderPane();
        addRightColumn();
        addLeftColumn();
        addCenter();
        addTopHBox();
        addBottomButton();
    }

    private void addBottomButton() {

        StackPane pancakeStack = new StackPane();

        Image silverFoil = new Image("/assets/projecttwo/SilverFoil.png");
        Image goldFoil = new Image("/assets/projecttwo/GoldenFoil.png");
        ImageView silverView = new ImageView(silverFoil);
        silverView.setFitHeight(150);
        silverView.setPreserveRatio(true);
        ImageView goldView = new ImageView(goldFoil);
        goldView.setFitHeight(75);
        goldView.setPreserveRatio(true);

        pancakeStack.getChildren().addAll(silverView,goldView);
        this.demoBorderPane.setBottom(pancakeStack);

        this.workshopSymbolFinder = new WorkshopSymbolFinder();

        Image swapImage = this.workshopSymbolFinder.getSymbolByEnum(WorkshopSymbolFinder.WorkshopSymbolEnum.SWAP);
        ImageView swapView = new ImageView(swapImage);
        JavaSquire.resizeImage(swapView,50,50);
        pancakeStack.getChildren().add(swapView);

        swapView.setOnMouseClicked(event -> {
            this.demoBorderPane.getChildren().remove(flowerVBox1);
            this.demoBorderPane.getChildren().remove(flowerVBox2);
            switch (currentSwapState) {

                case RIGHTSWAP -> {
                    currentSwapState = LeftRightSwapEnum.LEFTSWAP;
                    this.demoBorderPane.setLeft(this.flowerVBox1);
                    this.demoBorderPane.setRight(this.flowerVBox2);

                } case LEFTSWAP -> {
                    currentSwapState = LeftRightSwapEnum.RIGHTSWAP;
                    this.demoBorderPane.setLeft(this.flowerVBox2);
                    this.demoBorderPane.setRight(this.flowerVBox1);
                }

            }


        });


    }

    private void addTopHBox() {
        HBox topHBox = new HBox();
        Image flower1 = new Image("/assets/projecttwo/flowers/flowerYellow2.png");
        Image flower2 = new Image("/assets/projecttwo/flowers/flowerYellow3.png");
        ImageView flower1View = new ImageView(flower1);
        ImageView flower2View = new ImageView(flower2);
        flower1View.setFitHeight(200);
        flower1View.setPreserveRatio(true);
        flower2View.setFitHeight(200);
        flower2View.setPreserveRatio(true);
        Label flowerLabel = new Label("Flower Shop");
        flowerLabel.setId("flowerLabel");

        topHBox.getChildren().addAll(flower1View,flowerLabel,flower2View);
        topHBox.setAlignment(Pos.CENTER);
        this.demoBorderPane.setTop(topHBox);




    }

    private void addCenter() {
        Image centerVaseImage = new Image("/assets/projecttwo/rainbowVase.png");
        ImageView vaseView = new ImageView(centerVaseImage);
        vaseView.setFitHeight(700);
        vaseView.setPreserveRatio(true);
        this.demoBorderPane.setCenter(vaseView);
    }

    private void addRightColumn() {
        VBox rightVBox = new VBox();
        Image flower1 = new Image("/assets/projecttwo/flowers/flowerPink.png");
        Image flower2 = new Image("/assets/projecttwo/flowers/flowerPinkWhite.png");
        Image flower3 = new Image("/assets/projecttwo/flowers/flowerPurple.png");

        ImageView view1 = new ImageView(flower1);
        JavaSquire.resizeImage(view1,200,200);
        ImageView view2 = new ImageView(flower2);
        JavaSquire.resizeImage(view2,200,200);

        ImageView view3 = new ImageView(flower3);
        JavaSquire.resizeImage(view3,200,200);

        rightVBox.getChildren().addAll(view1,view2,view3);
        this.flowerVBox1 = rightVBox;
        this.demoBorderPane.setRight(rightVBox);
    }

    private void addLeftColumn() {
        VBox leftVBox = new VBox();
        Image flower1 = new Image("/assets/projecttwo/flowers/flowerRed.png");
        Image flower2 = new Image("/assets/projecttwo/flowers/flowerRed2.png");
        Image flower3 = new Image("/assets/projecttwo/flowers/flowerYellow1.png");

        ImageView view1 = new ImageView(flower1);
        JavaSquire.resizeImage(view1,200,200);

        ImageView view2 = new ImageView(flower2);
        JavaSquire.resizeImage(view2,200,200);

        ImageView view3 = new ImageView(flower3);
        JavaSquire.resizeImage(view3,200,200);

        leftVBox.getChildren().addAll(view1,view2,view3);
        this.demoBorderPane.setLeft(leftVBox);
        this.flowerVBox2 = leftVBox;
    }

    private void addExampleBorderPane() {
        this.demoBorderPane = new BorderPane();
        this.getChildren().add(this.demoBorderPane);
        Draggable.Nature makeMeDrag = new Draggable.Nature(this.demoBorderPane);




    }

    private void addDemoBorderPane() {
        Image borderPane = new Image("/assets/projecttwo/borderPaneExample.png");
        ImageView borderView = new ImageView(borderPane);
        this.getChildren().add(borderView);
        Draggable.Nature makeMeDrag = new Draggable.Nature(borderView);

    }

    private void addBackdrop() {
        Image backdropImage = new Image("/assets/backdrops/textures/backdropFlowers3840.png");
        ImageView backdropView = new ImageView(backdropImage);
        JavaSquire.resizeImage(backdropView, Settings.getScreenWidth(),Settings.getScreenHeight());
        this.getChildren().add(backdropView);
    }
}
