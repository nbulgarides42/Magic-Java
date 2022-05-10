package projecttwo;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import utility.ImageFinders.DigitImgFinder;

import java.util.ArrayList;

public class GreekCalculatorWork extends Pane {

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




}
