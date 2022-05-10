package projectthree;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import utility.ImageFinders.TextureImageFinder;

import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class ShimmerViewTeacher extends TimerTask {

    private ArrayList<ImageView> toggledViews;
    private ArrayList<Image> textureImages;
    private ImageView toggledView;
    private Random random;
    private boolean rotateMe;
    boolean pluralList = false;
    public ShimmerViewTeacher(ImageView toggledImage) {
        this.random = new Random();
        this.toggledView = toggledImage;
        this.textureImages = new ArrayList<Image>();
        addTextureImages();
    }
    public ShimmerViewTeacher(ImageView toggledImage, ArrayList<Image> shimmerImages) {
        this.random = new Random();
        this.toggledView = toggledImage;
        this.textureImages = shimmerImages;
    }

    public ShimmerViewTeacher(ImageView toggledImage, ArrayList<Image> shimmerImages, boolean rotateMe) {
        this.random = new Random();
        this.toggledView = toggledImage;
        this.textureImages = shimmerImages;
        this.rotateMe = rotateMe;

    }

    public ShimmerViewTeacher(ArrayList<ImageView> toggledImageViews, TextureImageFinder textureImageFinder, ArrayList<Image> shimmerImages) {
        this.random = new Random();
        this.pluralList = true;
        this.toggledViews = toggledImageViews;
        this.textureImages = shimmerImages;
    }

    private void addTextureImages() {
        this.textureImages.add(new Image("/assets/textures/gemstone/diamond.png"));
        this.textureImages.add(new Image("/assets/textures/gemstone/diamond2.png"));
        this.textureImages.add(new Image("/assets/textures/gemstone/diamond3.png"));

    }

    @Override
    public void run() {

        int randomInt = this.random.nextInt(this.textureImages.size());

        if (pluralList == false) {
            this.toggledView.setImage(this.textureImages.get(randomInt));

        } else if (pluralList == true) {
            int counter = 0;
            while (counter < this.toggledViews.size()) {
                this.toggledViews.get(counter).setImage(this.textureImages.get(this.random.nextInt(this.textureImages.size())));
                counter++;
            }
        }


        if (this.rotateMe == true) {
            double currentRotate = this.toggledView.getRotate();
            currentRotate+= 1.5;
            if (currentRotate >= 360) {
                currentRotate = 0;
            }
            this.toggledView.setRotate(currentRotate);
        }
    }
}
