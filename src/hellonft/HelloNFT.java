package hellonft;

import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import utility.ImageFinders.WorkshopSymbolFinder;
import utility.JavaSquire;
import utility.Settings;

public class HelloNFT extends Pane {

    private ImageView backdropView;
    private HelloNFTController nftController;
    private WorkshopSymbolFinder workshopSymbolFinder;
    private String backdropAddress = "/assets/backdrops/space/backdropMilky.jpg";
    private TextArea textArea;

    /**
     * Note 1.7 we see that HelloNFT extends pane, so it is a page added to the screen
     *
     */
    public HelloNFT(HelloNFTController nftController){
        this.nftController = nftController;
        this.workshopSymbolFinder = nftController.workshopSymbolFinder;
        loadBackdrop();
        addTextArea();
    }

    /**
     * 1.71 - We see that the backdrop added uses the backdropAddress from above and
     * we use the JavaSquire.ResizeImage to set it to the width and height of the screen
     * then it is added to the pane
     */
    private void loadBackdrop() {
            this.backdropView = new ImageView(new Image(backdropAddress));
            JavaSquire.resizeImage(this.backdropView, Settings.getScreenWidth(),Settings.getScreenHeight());
            this.getChildren().add(this.backdropView);
    }

    /** 1.72 - You can mostly ignore this for now, the core idea is that we add
     * a text area to take user input.
     * Uses height of 100 and width of 400 and offsets by half of each dimension to center on screen
     * Use of ID helloText to pull from CSS sheet
     */
    private void addTextArea() {
        HBox hbox = new HBox();
        this.textArea = new TextArea();
        this.textArea.setWrapText(true);
        this.textArea.setId("helloText");
        hbox.getChildren().add(this.textArea);
        this.getChildren().add(hbox);
        hbox.setLayoutX((Settings.getScreenWidth() / 2)-200);
        hbox.setLayoutY((Settings.getScreenHeight()/2)-50);
        hbox.setAlignment(Pos.CENTER);

        ImageView confirmView = new ImageView(this.workshopSymbolFinder.getSymbolByEnum(WorkshopSymbolFinder.WorkshopSymbolEnum.CONFIRM));
        JavaSquire.resizeImage(confirmView,150,150);
        hbox.getChildren().add(confirmView);
        addGenerateTextFunction(confirmView);

    }

    private void addGenerateTextFunction(ImageView confirmView) {
        confirmView.setOnMouseClicked(e -> {

            if (this.nftController.typographyFactory.getLettersLoaded() == true) {
                this.nftController.displayTextFromTextArea(this.textArea.getText());

            }
        });
    }



}
