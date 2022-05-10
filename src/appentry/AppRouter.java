package appentry;

import hellonft.HelloNFTController;
import projectthree.ProjectThreeControllerTeacher;
import projectthree.ProjectThreeControllerWork;
import projecttwo.ProjectTwoController;

public class AppRouter {

    public enum AppSectionEnum {
        DEFAULT, HELLONFT, PROJECTTWO, PROJECTTHREE
    }

    /**
     * Section 1.4 - we discuss the AppSectionEnum and go over how we will switch the enum
     * to explore the different NFTs that we will  be creating in this lesson
     * Starts off as default, in Lesson 1 we switch appSectionEnum to HELLONFT from DEFAULT
     */
    private AppSectionEnum appSectionEnum = AppSectionEnum.HELLONFT;
    private TurtleTower turtleTower;


    public AppRouter(TurtleTower turtleTower){
        this.turtleTower = turtleTower;
        routeToAppSectionByEnum();
    }

    /**Section 1.42 - We examine the switch statement which will be used to load different NFTs
     * The switch statement below routes the app to display a specific NFT based off the appSectionEnum
     */
    private void routeToAppSectionByEnum() {


        switch (appSectionEnum) {
            case DEFAULT -> {
                System.out.println("Don't forget to switch the appSectionEnum out of default to HelloNFT or Onwards!");
                break;
                /**
                 * We look at HelloNFTController which contains everything we will be doing in our first Hello World
                 * NFT
                 */
            } case HELLONFT -> {
                HelloNFTController helloNFTController = new HelloNFTController(this.turtleTower);
                break;
            } case PROJECTTWO -> {
                ProjectTwoController projectTwoController = new ProjectTwoController(this.turtleTower);
                break;
            }  case PROJECTTHREE -> {
                //ProjectThreeControllerTeacher projectThreeController = new ProjectThreeControllerTeacher(this.turtleTower);
                ProjectThreeControllerWork projectThreeControllerWork = new ProjectThreeControllerWork(this.turtleTower);
                break;
            }
        }

    }
}
