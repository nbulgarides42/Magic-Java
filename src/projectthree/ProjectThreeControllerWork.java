package projectthree;

import appentry.TurtleTower;
import javafx.scene.image.ImageView;
import utility.ImageFinders.CelestialImageFinderWork;
import utility.ImageFinders.TextureImageFinder;

public class ProjectThreeControllerWork {

    private TurtleTower turtleTower;
    private ProjectThreeWork projectThreeWork;
    private CelestialImageFinderWork celestialImageFinderWork;
    private boolean celestialThreadFinished = false;
    private TextureImageFinder textureImageFinder;
    public ProjectThreeControllerWork(TurtleTower turtleTower) {
        this.turtleTower = turtleTower;
        runProjectThree();
    }

    private void runProjectThree() {
        this.projectThreeWork = new ProjectThreeWork();
        this.turtleTower.getChildren().add(projectThreeWork);
    }



}
