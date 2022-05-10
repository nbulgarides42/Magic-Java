package projecttwo;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import utility.ImageFinders.DigitImgFinder;
import utility.JavaSquire;
import utility.Settings;
import utility.physicality.Draggable;

import java.util.ArrayList;
import java.util.Arrays;

public class GreekCalculatorSolved extends Pane {

    private DigitImgFinder digitImgFinder;
    private BorderPane calculatorBorderPane;
    private VBox calculatorHeader;
    private ArrayList<RadioButton> operationList;
    private ArrayList<TextField> numberTextFields;
    private ArrayList<Image> operationImageList;
    private ImageView activeOperationView;
    private int selectedTextArea = 0;
    private int activeOperationInt = 0;
    private TilePane calculatorTilePane;

    public GreekCalculatorSolved(){
        this.digitImgFinder = new DigitImgFinder();
        addBackdrop();
        formCalculatorBase();
        formCalculatorTop();
        formCalculatorCenter();
    }
   private void addBackdrop() {
        Image backdropImage = new Image("/assets/backdrops/textures/backgroundMythical1920.png");
        ImageView backdropView = new ImageView(backdropImage);
        JavaSquire.resizeImage(backdropView, Settings.getScreenWidth(),Settings.getScreenHeight());
        this.getChildren().add(backdropView);
    }

    private void formCalculatorBase() {
        this.calculatorBorderPane = new BorderPane();
        Image columnClassic = new Image("/assets/projecttwo/columnClassic.png");

        ImageView leftColumn = new ImageView(columnClassic);
        ImageView rightColumn = new ImageView(columnClassic);

        leftColumn.setFitHeight(800);
        leftColumn.setPreserveRatio(true);
        leftColumn.setTranslateY(-25);

        rightColumn.setFitHeight(800);
        rightColumn.setPreserveRatio(true);
        rightColumn.setScaleX(-1);
        rightColumn.setTranslateY(-25);

        this.calculatorBorderPane.setLeft(leftColumn);
        this.calculatorBorderPane.setRight(rightColumn);
        this.calculatorBorderPane.setId("greekGrid");

        this.getChildren().add(this.calculatorBorderPane);
        Draggable.Nature makeMeDrag = new Draggable.Nature(this.calculatorBorderPane);
    }

    private void formCalculatorTop() {
        Image header = new Image("/assets/projecttwo/greekRoof.png");
        ImageView headerView = new ImageView(header);
        headerView.setFitWidth(1000);
        headerView.setPreserveRatio(true);
        this.calculatorHeader = new VBox();
        this.calculatorHeader.setAlignment(Pos.CENTER);
        this.calculatorHeader.getChildren().add(headerView);
        this.calculatorBorderPane.setTop(this.calculatorHeader);
    }


    private void formCalculatorCenter() {
        VBox calculatorCenterHolder = new VBox();
        calculatorCenterHolder.setId("calculatorCenterHolder");
        calculatorCenterHolder.getChildren().add(formTextAreasPanel());
        calculatorCenterHolder.getChildren().add(formOperationPanel());
        calculatorCenterHolder.getChildren().add(formNumberGrid());
        this.calculatorBorderPane.setCenter(calculatorCenterHolder);
    }

    private HBox formTextAreasPanel() {
        HBox textAreaPanel = new HBox();
        textAreaPanel.setAlignment(Pos.CENTER);
        textAreaPanel.setSpacing(30);
        this.numberTextFields = new ArrayList<TextField>();
        this.numberTextFields.add(new TextField());
        this.numberTextFields.get(0).setOnMouseClicked(e -> {
            this.selectedTextArea = 0;
        });
        this.numberTextFields.add(new TextField());
        this.numberTextFields.get(1).setOnMouseClicked(e -> {
            this.selectedTextArea = 1;
        });
        this.numberTextFields.add(new TextField());
        int counter = 0;
        while (counter < this.numberTextFields.size()) {
            this.numberTextFields.get(counter).setPrefWidth(100);
            counter++;
        }

        this.activeOperationView = new ImageView(new Image("/assets/projecttwo/subtractionIcon.png"));
        this.activeOperationView.setFitWidth(50);
        this.activeOperationView.setPreserveRatio(true);

        textAreaPanel.getChildren().add(this.numberTextFields.get(0));
        textAreaPanel.getChildren().add(this.activeOperationView);
        textAreaPanel.getChildren().add(this.numberTextFields.get(1));

        this.numberTextFields.get(2).setEditable(false);
        textAreaPanel.getChildren().add(this.numberTextFields.get(2));


        return textAreaPanel;
    }

    private HBox formOperationPanel() {
        HBox operationPanel = new HBox();
        operationPanel.setAlignment(Pos.CENTER);
        ToggleGroup toggleGroup = new ToggleGroup();
        ArrayList<VBox> columnList = new ArrayList<VBox>();
        this.operationImageList = new ArrayList<Image>();
        operationImageList.add(new Image("/assets/projecttwo/subtractionIcon.png"));
        operationImageList.add(new Image("/assets/projecttwo/additionIcon.png"));
        operationImageList.add(new Image("/assets/projecttwo/multiplicationIcon.png"));
        operationImageList.add(new Image("/assets/projecttwo/divisionIcon.png"));

        RadioButton subtractionButton = new RadioButton();
        subtractionButton.setSelected(true);

        RadioButton additionButton = new RadioButton();
        RadioButton multiplicationButton = new RadioButton();
        RadioButton divisionButton = new RadioButton();
        this.operationList = new ArrayList(Arrays.asList(subtractionButton,additionButton,multiplicationButton,divisionButton));
        int counter = 0;
        Image iconImage = null;

        while (counter < this.operationList.size()) {
            this.operationList.get(counter).setToggleGroup(toggleGroup);
            int finalCounter = counter;
            this.operationList.get(counter).setOnMouseClicked(e -> {
                processOperationClicked(finalCounter);
            });
            VBox radioVBox = new VBox();
            iconImage = operationImageList.get(counter);
            ImageView operationView = new ImageView(iconImage);
            operationView.setFitHeight(100);
            operationView.setPreserveRatio(true);
            radioVBox.getChildren().add(operationView);
            radioVBox.getChildren().add(this.operationList.get(counter));
            operationPanel.getChildren().add(radioVBox);
            counter++;
        }

        return operationPanel;
    }

    private void processOperationClicked(int numberValue) {
        this.activeOperationInt = numberValue;
        this.activeOperationView.setImage(this.operationImageList.get(this.activeOperationInt));
    }

    private TilePane formNumberGrid(){
        this.calculatorTilePane = new TilePane();
        this.calculatorTilePane.setVgap(20);
        this.calculatorTilePane.setHgap(20);
        this.calculatorTilePane.setPrefColumns(5);
        DigitImgFinder.DigitColorEnum colorEnum = DigitImgFinder.DigitColorEnum.RED;
        int counter = 0;
        while (counter <= 9) {

            Image digitImage = this.digitImgFinder.getDigitImageByColorAndInt(colorEnum,counter);
            ImageView digitView = new ImageView(digitImage);
            int finalCounter = counter;
            digitView.setOnMouseClicked(e -> {
                processDigitClicked(finalCounter);
            });
            digitView.setFitHeight(120);
            digitView.setPreserveRatio(true);
            this.calculatorTilePane .getChildren().add(digitView);

            counter++;
        }

        this.calculatorTilePane.getChildren().add(formPeriodButton());
        this.calculatorTilePane.getChildren().add(formEqualsButton());
        this.calculatorTilePane.getChildren().add(formClearButton());


        return this.calculatorTilePane ;
    }

    private void processDigitClicked(int finalCounter) {
        String numberText = this.numberTextFields.get(this.selectedTextArea).getText();
        numberText += finalCounter;
        this.numberTextFields.get(this.selectedTextArea).setText(numberText);
    }

    private ImageView formPeriodButton(){
        Image periodImage = new Image("/assets/projecttwo/periodIcon.png");
        ImageView periodView = new ImageView(periodImage);
        periodView.setFitHeight(40);
        periodView.setPreserveRatio(true);
        periodView.setOnMouseClicked(e -> {
            periodClicked();
        });
        return periodView;
    }

    private void periodClicked() {
        String numberText = this.numberTextFields.get(this.selectedTextArea).getText();
        numberText += ".";
        this.numberTextFields.get(this.selectedTextArea).setText(numberText);
    }

    private ImageView formEqualsButton(){
        Image equalsImage = new Image("/assets/projecttwo/equalsIcon.png");
        ImageView equalsView = new ImageView(equalsImage);
        equalsView.setFitHeight(125);
        equalsView.setPreserveRatio(true);
        equalsView.setOnMouseClicked(e -> {
            processCompositeOperation();
        });
        return equalsView;
    }

    private ImageView formClearButton(){
        Image clearIconImage = new Image("/assets/projecttwo/clearIcon.png");
        ImageView clearView = new ImageView(clearIconImage);
        clearView.setFitHeight(125);
        clearView.setPreserveRatio(true);
        clearView.setOnMouseClicked(e -> {
            this.numberTextFields.get(0).setText("");
            this.numberTextFields.get(1).setText("");
            this.numberTextFields.get(2).setText("");
        });
        return clearView;
    }

    private void processCompositeOperation() {
        double finalAnswer = 0;
        double textDouble1 = Double.parseDouble(this.numberTextFields.get(0).getText());
        double textDouble2 = Double.parseDouble(this.numberTextFields.get(1).getText());
        switch (activeOperationInt) {
            case 0 -> finalAnswer = textDouble1 - textDouble2;
            case 1 -> finalAnswer = textDouble1 + textDouble2;
            case 2 -> finalAnswer = textDouble1 * textDouble2;
            case 3 -> finalAnswer = textDouble1 / textDouble2;
        }
        this.numberTextFields.get(2).setText(String.valueOf(finalAnswer));
    }


}
