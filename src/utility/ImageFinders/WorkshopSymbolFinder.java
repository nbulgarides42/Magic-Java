package utility.ImageFinders;

import javafx.scene.image.Image;

import java.util.HashMap;

public class WorkshopSymbolFinder {

    public enum WorkshopSymbolEnum {
        VISIBILITY, CONFIRM, SWAP
    }

    /**
     * HashMaps are very useful for storing things that you want to draw on with specificity, especially powerful with enums.
     The structure of this SymbolFinder class is efficient because no image is loaded unless called on specifically, thus minimizing
     initial load times. Once an image has been loaded once, it is stored in the 'workshopImageMap' and can be re-used without needing to load
     additional times
     */
    private HashMap<WorkshopSymbolEnum, String> workshopResourceMap;
    private HashMap<WorkshopSymbolEnum, Image> workshopImageMap;
    public WorkshopSymbolFinder(){
        initializeCollections();
        loadResourceMap();
    }

    private void loadResourceMap() {
        this.workshopResourceMap.put(WorkshopSymbolEnum.VISIBILITY,"/assets/symbols/utility/workshopVisibility.png");
        this.workshopResourceMap.put(WorkshopSymbolEnum.CONFIRM, "/assets/symbols/utility/workshopConfirm.png");
        this.workshopResourceMap.put(WorkshopSymbolEnum.SWAP, "/assets/symbols/utility/workshopSwap.png");
    }

    private void initializeCollections() {
        this.workshopResourceMap = new HashMap<WorkshopSymbolEnum, String>();
        this.workshopImageMap = new HashMap<WorkshopSymbolEnum,Image>();
    }


    /*
    Note how this code checks to see if the image map already contains the symbol image, and if not, then 1) retrieve the symbol resource string
    from the pre-filled resource string map, and then 2) load that newly generated image and store it into the image map
     */
    public Image getSymbolByEnum(WorkshopSymbolEnum symbolEnum) {

        Image placeholder = null;

        if (this.workshopImageMap.containsKey(symbolEnum)) {
            placeholder = this.workshopImageMap.get(symbolEnum);
        } else {
            this.workshopImageMap.put(symbolEnum,new Image(this.workshopResourceMap.get(symbolEnum)));
            placeholder = this.workshopImageMap.get(symbolEnum);
        }

        return placeholder;
    }
}
