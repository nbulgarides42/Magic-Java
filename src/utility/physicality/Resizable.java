package utility.physicality;

import javafx.scene.Node;
import javafx.scene.input.ScrollEvent;

/*** NO NEED TO TOUCH - All this class does it add a zooming function to arbitrary node on mouse wheel
 * this will b e used as basis for later on camera polishes
 */

public class Resizable {

    public Resizable(Node anyNode) {
         anyNode.setOnScroll((ScrollEvent event) -> {
            // Adjust the zoom factor as per your requirement
            double zoomFactor = 1.05;
            double deltaY = event.getDeltaY();
            if (deltaY < 0){
                zoomFactor = 2.0 - zoomFactor;
            }
            anyNode.setScaleX(anyNode.getScaleX() * zoomFactor);
            anyNode.setScaleY(anyNode.getScaleY() * zoomFactor);
        });
    }



}
