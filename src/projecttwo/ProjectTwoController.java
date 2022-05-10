package projecttwo;

import appentry.TurtleTower;

public class ProjectTwoController {

    private TurtleTower turtleTower;

    public ProjectTwoController(TurtleTower turtleTower) {
        this.turtleTower = turtleTower;
        loadProjectTwo();
    }

    /**
     * You will start off lesson two working in ProjectTwoIntroWork, working alongside me as I coded ProjectTwoIntro
     * after completing ProjectTwoIntroWork, you will work on GreekCalculatorWork whilst I code in GreekCalculatorTeacher
     * GreekCalculator solved is the fully completed calculator model which both you the student and I the teacher can reference
     * as we work through this material. For
     */
    private void loadProjectTwo() {
       // this.turtleTower.getChildren().add(new ProjectTwoIntro());
        this.turtleTower.getChildren().add(new ProjectTwoIntroWork());
        //this.turtleTower.getChildren().add(new GreekCalculatorTeacher());
        //this.turtleTower.getChildren().add(new GreekCalculatorWork());

        //this.turtleTower.getChildren().add(new GreekCalculatorSolved());

    }


}
