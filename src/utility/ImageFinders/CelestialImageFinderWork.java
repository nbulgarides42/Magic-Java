package utility.ImageFinders;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import utility.JavaSquire;
import utility.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class CelestialImageFinderWork implements Runnable {

    private TextureImageFinder textureImageFinder;
    public enum StarTrailEnum {
        FUSCHIA, GOLD, IRIDESCENT, ORANGE, RAINBOW
    }

    private HashMap<StarTrailEnum, Image> starTrailMap;
    private ArrayList<Image> starTrailList;
    private ArrayList<Image> starShapeList;
    private Random random;

    public CelestialImageFinderWork(){
        this.random = new Random();
        initializeCollections();
    }

    private void initializeCollections() {
        this.starTrailMap = new HashMap<StarTrailEnum, Image>();
        this.starShapeList  = new ArrayList<Image>();
        this.starTrailList = new ArrayList<Image>();
    }


    @Override
    public void run() {
        loadStarTrailMap();
        loadStarShapes();
    }

    private void loadStarShapes() {
        this.starShapeList.add(new Image("/assets/shapes/stars/star1.png"));
        this.starShapeList.add(new Image("/assets/shapes/stars/star2.png"));
        this.starShapeList.add(new Image("/assets/shapes/stars/star3.png"));
        this.starShapeList.add(new Image("/assets/shapes/stars/star4.png"));
        this.starShapeList.add(new Image("/assets/shapes/stars/star5.png"));
    }

    private void loadStarTrailMap() {
        this.starTrailMap.put(StarTrailEnum.FUSCHIA, new Image("/assets/celestial/starTrailFuschia.png"));
        this.starTrailMap.put(StarTrailEnum.GOLD, new Image("/assets/celestial/starTrailGoldIntricate.png"));
        this.starTrailMap.put(StarTrailEnum.IRIDESCENT, new Image("/assets/celestial/starTrailIridescent.png"));
        this.starTrailMap.put(StarTrailEnum.ORANGE, new Image("/assets/celestial/starTrailOrange.png"));
        this.starTrailMap.put(StarTrailEnum.RAINBOW, new Image("/assets/celestial/starTrailRainbow.png"));

        this.starTrailList.add(this.starTrailMap.get(StarTrailEnum.FUSCHIA));
        this.starTrailList.add(this.starTrailMap.get(StarTrailEnum.GOLD));
        this.starTrailList.add(this.starTrailMap.get(StarTrailEnum.IRIDESCENT));
        this.starTrailList.add(this.starTrailMap.get(StarTrailEnum.ORANGE));
        this.starTrailList.add(this.starTrailMap.get(StarTrailEnum.RAINBOW));
    }

    public ImageView getRandomViewComposite(TextureImageFinder textureImageFinder) {
        this.textureImageFinder = textureImageFinder;
        Image starClipImage = getRandomStarShape();
        ImageView starViewClip = new ImageView(starClipImage);
        int randomSize = random.nextInt(150) + 25;
        JavaSquire.resizeImage(starViewClip,randomSize,randomSize);

        int randomTexture = random.nextInt(this.textureImageFinder.allGemstoneImages.size());
        Image gemstone = this.textureImageFinder.allGemstoneImages.get(randomTexture);
        ImageView gemstoneView = new ImageView(gemstone);
        JavaSquire.resizeImage(gemstoneView,randomSize,randomSize);
        gemstoneView.setClip(starViewClip);

        gemstoneView.setLayoutX(this.random.nextInt(Settings.getScreenWidth()));
        gemstoneView.setLayoutY(this.random.nextInt(Settings.getScreenHeight()));

        return gemstoneView;
    }


    private Image getRandomStarShape(){
        int random = this.random.nextInt(this.starShapeList.size());
        Image starImage = this.starShapeList.get(random);

        return starImage;
    }



}
