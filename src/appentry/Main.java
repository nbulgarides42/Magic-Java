package appentry;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import utility.Settings;

public class Main extends Application {

    private int screenWidth = Settings.getScreenWidth();
    private int screenHeight = Settings.getScreenHeight();
    private TurtleTower turtleTower;
    private String startingBackdrop = "/assets/backdrops/textures/backgroundPapyrus1920.png";


    /**
     *Note section 0, we explore what a stage is, and the relationship between the stage, the scene and the root
     * node, note that every node added to the screen is the child of the node it was added to.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Magic Java");

        /**
         * Note section 1.1, we discuss TurtleTower and note how the image address startingBackdrop is passed in
         * as an initial view
         */
        this.turtleTower = new TurtleTower(startingBackdrop,screenWidth,screenHeight);
        Scene exampleName = new Scene(this.turtleTower,screenWidth,screenHeight);

        /**
         * Note section 1.2 - we discuss how CSS or Cascading Style sheets is added to the program
         * but we will not be using this just yet
         */
        exampleName.getStylesheets().add("/style/style.css");
        primaryStage.setScene(exampleName);

        /**
         * Note section 1.3 - we discuss the AppRouter object that we create with the method below
         */
        routeAppToAppSection();
        primaryStage.show();

    }

    private void routeAppToAppSection() {
        AppRouter appRouter = new AppRouter(this.turtleTower);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
