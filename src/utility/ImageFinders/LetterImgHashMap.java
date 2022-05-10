package utility.ImageFinders;

import javafx.scene.image.Image;
import typography.TypographyFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterImgHashMap implements Runnable {
    public HashMap<String, ArrayList<Image>> allLetterImagesMap;
    private TypographyFactory typographyFactory;

    public LetterImgHashMap(TypographyFactory factory){
        this.allLetterImagesMap = new HashMap<String, ArrayList<Image>>();
        this.typographyFactory = factory;

    }
    private void loadAllLettersAndCharacters() {
        loadLetterA();
        loadLetterB();
        loadLetterC();
        loadLetterD();
        loadLetterE();
        loadLetterF();
        loadLetterG();
        loadLetterH();

        loadLetterI();
        loadLetterI();
        loadLetterJ();

        loadLetterK();
        loadLetterL();
        loadLetterM();
        loadLetterN();

        loadLetterO();
        loadLetterP();
        loadLetterQ();

        loadLetterR();
        loadLetterS();
        loadLetterT();
        loadLetterU();
        loadLetterV();

        loadLetterW();
        loadLetterX();
        loadLetterY();
        loadLetterZ();

        loadNumberZero();
        loadNumber1();
        loadNumber2();
        loadNumber3();
        loadNumber4();
        loadNumber5();
        loadNumber6();
        loadNumber7();
        loadNumber8();
        loadNumber9();


        loadCharacterPeriod();
        loadCharacterExclamation();
        loadCharacterQuestion();
        loadCharacterComma();
        loadSpace();
    }

    private void loadLetterA(){
        ArrayList<Image> listForA = new ArrayList<Image>();
        listForA.add(new Image("/assets/symbols/lettersSpecial/letterA.png"));
        listForA.add(new Image("/assets/symbols/lettersSpecial/letterA2.png"));
        listForA.add(new Image("/assets/symbols/lettersSpecial/letterA3.png"));
        listForA.add(new Image("/assets/symbols/lettersSpecial/letterAZoo.png"));


        this.allLetterImagesMap.put("A",listForA);
    }
    private void loadLetterB(){
        ArrayList<Image> listForB = new ArrayList<Image>();
        listForB.add(new Image("/assets/symbols/lettersSpecial/letterB.png"));
        listForB.add(new Image("/assets/symbols/lettersSpecial/letterB2.png"));
        this.allLetterImagesMap.put("B",listForB);
    }
    private void loadLetterC(){
        ArrayList<Image> listForC = new ArrayList<Image>();
        listForC.add(new Image("/assets/symbols/lettersSpecial/letterC.png"));
        listForC.add(new Image("/assets/symbols/lettersSpecial/letterC2.png"));
        listForC.add(new Image("/assets/symbols/lettersSpecial/letterC3.png"));
        this.allLetterImagesMap.put("C",listForC);
    }
    private void loadLetterD(){
        ArrayList<Image> listForD = new ArrayList<Image>();
        listForD.add(new Image("/assets/symbols/lettersSpecial/letterD.png"));
        listForD.add(new Image("/assets/symbols/lettersSpecial/letterD2.png"));
        listForD.add(new Image("/assets/symbols/lettersSpecial/letterD3.png"));
        this.allLetterImagesMap.put("D",listForD);
    }
    private void loadLetterE(){
        ArrayList<Image> listForE = new ArrayList<Image>();
        listForE.add(new Image("/assets/symbols/lettersSpecial/letterE.png"));
        listForE.add(new Image("/assets/symbols/lettersSpecial/letterE2.png"));
        listForE.add(new Image("/assets/symbols/lettersSpecial/letterE3.png"));
        listForE.add(new Image("/assets/symbols/lettersSpecial/letterE4.png"));

        this.allLetterImagesMap.put("E",listForE);
    }
    private void loadLetterF(){
        ArrayList<Image> listForF = new ArrayList<Image>();
        listForF.add(new Image("/assets/symbols/lettersSpecial/letterF.png"));
        this.allLetterImagesMap.put("F",listForF);
    }
    private void loadLetterG(){
        ArrayList<Image> listForG = new ArrayList<Image>();
        listForG.add(new Image("/assets/symbols/lettersSpecial/letterG.png"));
        listForG.add(new Image("/assets/symbols/lettersSpecial/letterG2.png"));
        listForG.add(new Image("/assets/symbols/lettersSpecial/letterG3.png"));

        this.allLetterImagesMap.put("G",listForG);
    }
    private void loadLetterH(){
        ArrayList<Image> listForH = new ArrayList<Image>();
        listForH.add(new Image("/assets/symbols/lettersSpecial/letterH.png"));
        listForH.add(new Image("/assets/symbols/lettersSpecial/letterH2.png"));
        listForH.add(new Image("/assets/symbols/lettersSpecial/letterH3.png"));
        listForH.add(new Image("/assets/symbols/lettersSpecial/letterH4.png"));

        this.allLetterImagesMap.put("H",listForH);
    }
    private void loadLetterI(){
        ArrayList<Image> listForI = new ArrayList<Image>();
        listForI.add(new Image("/assets/symbols/lettersSpecial/letterI.png"));
        listForI.add(new Image("/assets/symbols/lettersSpecial/letterI2.png"));
        listForI.add(new Image("/assets/symbols/lettersSpecial/letterI3.png"));


        this.allLetterImagesMap.put("I",listForI);
    }
    private void loadLetterJ(){
        ArrayList<Image> listForJ = new ArrayList<Image>();
        listForJ.add(new Image("/assets/symbols/lettersSpecial/letterJ.png"));
        listForJ.add(new Image("/assets/symbols/lettersSpecial/letterJ2.png"));

        this.allLetterImagesMap.put("J",listForJ);
    }
    private void loadLetterK(){
        ArrayList<Image> listForK = new ArrayList<Image>();
        listForK.add(new Image("/assets/symbols/lettersSpecial/letterK.png"));
        listForK.add(new Image("/assets/symbols/lettersSpecial/letterK2.png"));
        listForK.add(new Image("/assets/symbols/lettersSpecial/letterK3.png"));

        this.allLetterImagesMap.put("K",listForK);
    }
    private void loadLetterL(){
        ArrayList<Image> listForL = new ArrayList<Image>();
        listForL.add(new Image("/assets/symbols/lettersSpecial/letterL.png"));
        listForL.add(new Image("/assets/symbols/lettersSpecial/letterL2.png"));
        listForL.add(new Image("/assets/symbols/lettersSpecial/letterL3.png"));
        listForL.add(new Image("/assets/symbols/lettersSpecial/letterL4.png"));

        this.allLetterImagesMap.put("L",listForL);
    }
    private void loadLetterM(){
        ArrayList<Image> listForM = new ArrayList<Image>();
        listForM.add(new Image("/assets/symbols/lettersSpecial/letterM.png"));
        listForM.add(new Image("/assets/symbols/lettersSpecial/letterM2.png"));
        listForM.add(new Image("/assets/symbols/lettersSpecial/letterM3.png"));
        listForM.add(new Image("/assets/symbols/lettersSpecial/letterM4.png"));

        this.allLetterImagesMap.put("M",listForM);
    }
    private void loadLetterN(){
        ArrayList<Image> listForN = new ArrayList<Image>();
        listForN.add(new Image("/assets/symbols/lettersSpecial/letterN.png"));
        listForN.add(new Image("/assets/symbols/lettersSpecial/letterN2.png"));
        listForN.add(new Image("/assets/symbols/lettersSpecial/letterN3.png"));
        listForN.add(new Image("/assets/symbols/lettersSpecial/letterN4.png"));
        listForN.add(new Image("/assets/symbols/lettersSpecial/letterN5.png"));

        this.allLetterImagesMap.put("N",listForN);
    }
    private void loadLetterO(){
        ArrayList<Image> listForO = new ArrayList<Image>();
        listForO.add(new Image("/assets/symbols/lettersSpecial/letterO.png"));
        listForO.add(new Image("/assets/symbols/lettersSpecial/letterO2.png"));
        listForO.add(new Image("/assets/symbols/lettersSpecial/letterO3.png"));
        listForO.add(new Image("/assets/symbols/lettersSpecial/letterO4.png"));

        this.allLetterImagesMap.put("O",listForO);
    }
    private void loadLetterP(){
        ArrayList<Image> listForP = new ArrayList<Image>();
        listForP.add(new Image("/assets/symbols/lettersSpecial/letterP.png"));
        listForP.add(new Image("/assets/symbols/lettersSpecial/letterP2.png"));
        listForP.add(new Image("/assets/symbols/lettersSpecial/letterP3.png"));
        listForP.add(new Image("/assets/symbols/lettersSpecial/letterP4.png"));

        this.allLetterImagesMap.put("P",listForP);
    }
    private void loadLetterQ(){
        ArrayList<Image> listForQ = new ArrayList<Image>();
        listForQ.add(new Image("/assets/symbols/lettersSpecial/letterQ.png"));

        this.allLetterImagesMap.put("Q",listForQ);
    }
    private void loadLetterR(){
        ArrayList<Image> listForR = new ArrayList<Image>();
        listForR.add(new Image("/assets/symbols/lettersSpecial/letterR.png"));
        listForR.add(new Image("/assets/symbols/lettersSpecial/letterR2.png"));

        this.allLetterImagesMap.put("R",listForR);
    }
    private void loadLetterS(){
        ArrayList<Image> listForS = new ArrayList<Image>();
        listForS.add(new Image("/assets/symbols/lettersSpecial/letterS.png"));
        listForS.add(new Image("/assets/symbols/lettersSpecial/letterS2.png"));

        this.allLetterImagesMap.put("S",listForS);
    }
    private void loadLetterT(){
        ArrayList<Image> listForT = new ArrayList<Image>();
        listForT.add(new Image("/assets/symbols/lettersSpecial/letterT.png"));
        listForT.add(new Image("/assets/symbols/lettersSpecial/letterT2.png"));
        listForT.add(new Image("/assets/symbols/lettersSpecial/letterT3.png"));
        listForT.add(new Image("/assets/symbols/lettersSpecial/letterT4.png"));
        listForT.add(new Image("/assets/symbols/lettersSpecial/letterT5.png"));


        this.allLetterImagesMap.put("T",listForT);
    }
    private void loadLetterU(){
        ArrayList<Image> listForU = new ArrayList<Image>();
        listForU.add(new Image("/assets/symbols/lettersSpecial/letterU.png"));
        listForU.add(new Image("/assets/symbols/lettersSpecial/letterU2.png"));
        listForU.add(new Image("/assets/symbols/lettersSpecial/letterU3.png"));

        this.allLetterImagesMap.put("U",listForU);
    }
    private void loadLetterV(){
        ArrayList<Image> listForV = new ArrayList<Image>();
        listForV.add(new Image("/assets/symbols/lettersSpecial/letterV.png"));
        listForV.add(new Image("/assets/symbols/lettersSpecial/letterV2.png"));
        listForV.add(new Image("/assets/symbols/lettersSpecial/letterV3.png"));

        this.allLetterImagesMap.put("V",listForV);
    }
    private void loadLetterW(){
        ArrayList<Image> listForW = new ArrayList<Image>();
        listForW.add(new Image("/assets/symbols/lettersSpecial/letterW.png"));
        listForW.add(new Image("/assets/symbols/lettersSpecial/letterW2.png"));

        this.allLetterImagesMap.put("W",listForW);
    }
    private void loadLetterX(){
        ArrayList<Image> listForX = new ArrayList<Image>();
        listForX.add(new Image("/assets/symbols/lettersSpecial/letterX.png"));
        listForX.add(new Image("/assets/symbols/lettersSpecial/letterX2.png"));
        listForX.add(new Image("/assets/symbols/lettersSpecial/letterX3.png"));
        listForX.add(new Image("/assets/symbols/lettersSpecial/letterX4.png"));
        listForX.add(new Image("/assets/symbols/lettersSpecial/letterX5.png"));

        this.allLetterImagesMap.put("X",listForX);
    }
    private void loadLetterY(){
        ArrayList<Image> listForY = new ArrayList<Image>();
        listForY.add(new Image("/assets/symbols/lettersSpecial/letterY.png"));
        listForY.add(new Image("/assets/symbols/lettersSpecial/letterY2.png"));
        listForY.add(new Image("/assets/symbols/lettersSpecial/letterY3.png"));

        this.allLetterImagesMap.put("Y",listForY);
    }
    private void loadLetterZ(){
        ArrayList<Image> listForZ = new ArrayList<Image>();

        listForZ.add(new Image("/assets/symbols/lettersSpecial/letterZ.png"));
        listForZ.add(new Image("/assets/symbols/lettersSpecial/letterZ2.png"));
        this.allLetterImagesMap.put("Z",listForZ);
    }

    private void loadCharacterExclamation(){
        ArrayList<Image> exclamation = new ArrayList<Image>();
        exclamation.add(new Image("/assets/symbols/lettersSpecial/exclamationMark.png"));
        exclamation.add(new Image("/assets/symbols/lettersSpecial/exclamationMark2.png"));
        exclamation.add(new Image("/assets/symbols/lettersSpecial/exclamationHeart.png"));
        exclamation.add(new Image("/assets/symbols/lettersSpecial/comicExclamation.png"));
        this.allLetterImagesMap.put("!",exclamation);

    }
    private void loadCharacterPeriod(){
        ArrayList<Image> periods = new ArrayList<Image>();
        periods.add(new Image("/assets/symbols/lettersSpecial/periodShape.png"));
        this.allLetterImagesMap.put(".",periods);
    }
    private void loadCharacterQuestion(){
        ArrayList<Image> questions = new ArrayList<Image>();
        questions.add(new Image("/assets/symbols/lettersSpecial/question.png"));
        this.allLetterImagesMap.put("?",questions);
    }

    private void loadCharacterComma(){
        ArrayList<Image> comma = new ArrayList<Image>();
        comma.add(new Image("/assets/symbols/lettersSpecial/comma.png"));
        this.allLetterImagesMap.put(",",comma);
    }


    public void loadNumberZero(){
        ArrayList<Image> numberZeroList = new ArrayList<Image>();
        numberZeroList.add(new Image("/assets/symbols/lettersSpecial/number0.png"));
        this.allLetterImagesMap.put("0",numberZeroList);
    }
    public void loadNumber1(){
        ArrayList<Image> number1List = new ArrayList<Image>();
        number1List.add(new Image("/assets/symbols/lettersSpecial/number1.png"));
        this.allLetterImagesMap.put("1",number1List);
    }
    public void loadNumber2(){
        ArrayList<Image> number2List = new ArrayList<Image>();
        number2List.add(new Image("/assets/symbols/lettersSpecial/number2.png"));
        this.allLetterImagesMap.put("2",number2List);
    }
    public void loadNumber3(){
        ArrayList<Image> number3List = new ArrayList<Image>();
        number3List.add(new Image("/assets/symbols/lettersSpecial/number3.png"));
        this.allLetterImagesMap.put("3",number3List);
    }
    public void loadNumber4(){
        ArrayList<Image> number4List = new ArrayList<Image>();
        number4List.add(new Image("/assets/symbols/lettersSpecial/number4.png"));
        this.allLetterImagesMap.put("4",number4List);
    }
    public void loadNumber5(){
        ArrayList<Image> number5List = new ArrayList<Image>();
        number5List.add(new Image("/assets/symbols/lettersSpecial/number5.png"));
        this.allLetterImagesMap.put("5",number5List);
    }
    public void loadNumber6(){
        ArrayList<Image> number6List = new ArrayList<Image>();
        number6List.add(new Image("/assets/symbols/lettersSpecial/number6.png"));
        this.allLetterImagesMap.put("6",number6List);
    }
    public void loadNumber7(){
        ArrayList<Image> number7List = new ArrayList<Image>();
        number7List.add(new Image("/assets/symbols/lettersSpecial/number7.png"));
        this.allLetterImagesMap.put("7",number7List);
    }
    public void loadNumber8(){
        ArrayList<Image> number8List = new ArrayList<Image>();
        number8List.add(new Image("/assets/symbols/lettersSpecial/number8.png"));
        this.allLetterImagesMap.put("8",number8List);
    }
    public void loadNumber9() {
        ArrayList<Image> number9List = new ArrayList<Image>();
        number9List.add(new Image("/assets/symbols/lettersSpecial/number9.png"));
        this.allLetterImagesMap.put("9",number9List);
    }

    public void loadSpace(){
        ArrayList<Image> space = new ArrayList<Image>();
        space.add(new Image("/assets/symbols/lettersSpecial/blankSpace.png"));
        this.allLetterImagesMap.put(" ", space);
    }


    @Override
    public void run() {
        loadAllLettersAndCharacters();
        this.typographyFactory.setLettersLoaded(true);

    }
}
