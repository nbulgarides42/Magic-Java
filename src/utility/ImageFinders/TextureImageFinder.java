package utility.ImageFinders;


import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TextureImageFinder implements Runnable{

    private HashMap<GemstoneEnum, Image> gemstoneImageMap;
    public enum GemstoneEnum {
        AMMOLITE, AMMOLITE2, BLUEOPAL, BLUEOPAL2, CARNELIAN, CITRINE,
        DARKOPAL, DIAMOND, DIAMOND2, DIAMOND3, EMERALD, EMERALD2, GOLDBRUSHED,
        GOLDFOIL, LABRADORITE, LABRADORITE2, LAPISLAZULI, LARIMAR, OPAL, OPALBLUEGOLD, OPALGREEN,
        OPALORANGE, OPALRAINBOW, OPALRAINBOW2, ORANGEOPAL, PAINTEDRAINBOW, RAINBOWMETALLIC, OPALRAINBOW3,
        REALRUBY, RHODOCROSITE, RHODOLITE, TANZANITE, TANZANITE2
    }
    public ArrayList<Image> allGemstoneImages;
    public TextureImageFinder() {
        initializeCollections();
    }

    private void initializeCollections() {
        this.gemstoneImageMap = new HashMap<GemstoneEnum, Image>();
        this.allGemstoneImages = new ArrayList<Image>();
    }

    @Override
    public void run() {
        loadAllGemstones();
        addAllGemstonesToArrayList();
    }

    private void addAllGemstonesToArrayList() {

        Iterator iterator = this.gemstoneImageMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) iterator.next();
            Image gemstoneImage = (Image) mapElement.getValue();
            this.allGemstoneImages.add(gemstoneImage);
        }
    }

    private void loadAllGemstones() {
        this.gemstoneImageMap.put(GemstoneEnum.AMMOLITE, new Image("/assets/textures/gemstone/ammolite.png"));
        this.gemstoneImageMap.put(GemstoneEnum.AMMOLITE2, new Image("/assets/textures/gemstone/ammolite2.png"));
        this.gemstoneImageMap.put(GemstoneEnum.BLUEOPAL, new Image("/assets/textures/gemstone/blueOpal.png"));
        this.gemstoneImageMap.put(GemstoneEnum.BLUEOPAL2, new Image("/assets/textures/gemstone/blueOpal2.png"));
        this.gemstoneImageMap.put(GemstoneEnum.CARNELIAN, new Image("/assets/textures/gemstone/carnelian.png"));
        this.gemstoneImageMap.put(GemstoneEnum.CITRINE, new Image("/assets/textures/gemstone/citrine.png"));
        this.gemstoneImageMap.put(GemstoneEnum.DARKOPAL, new Image("/assets/textures/gemstone/darkOpal.png"));
        this.gemstoneImageMap.put(GemstoneEnum.DIAMOND, new Image("/assets/textures/gemstone/diamond.png"));
        this.gemstoneImageMap.put(GemstoneEnum.DIAMOND2, new Image("/assets/textures/gemstone/diamond2.png"));
        this.gemstoneImageMap.put(GemstoneEnum.DIAMOND3, new Image("/assets/textures/gemstone/diamond3.png"));
        this.gemstoneImageMap.put(GemstoneEnum.EMERALD, new Image("/assets/textures/gemstone/emerald.png"));
        this.gemstoneImageMap.put(GemstoneEnum.EMERALD2, new Image("/assets/textures/gemstone/emerald2.png"));
        this.gemstoneImageMap.put(GemstoneEnum.GOLDBRUSHED, new Image("/assets/textures/gemstone/goldBrushed.png"));
        this.gemstoneImageMap.put(GemstoneEnum.GOLDFOIL, new Image("/assets/textures/gemstone/goldFoil.png"));
        this.gemstoneImageMap.put(GemstoneEnum.LABRADORITE, new Image("/assets/textures/gemstone/labradorite.png"));
        this.gemstoneImageMap.put(GemstoneEnum.LAPISLAZULI, new Image("/assets/textures/gemstone/lapisLazuli.png"));
        this.gemstoneImageMap.put(GemstoneEnum.LARIMAR, new Image("/assets/textures/gemstone/larimar.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPAL, new Image("/assets/textures/gemstone/opal.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALBLUEGOLD, new Image("/assets/textures/gemstone/opalBlueGold.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALGREEN, new Image("/assets/textures/gemstone/opalGreen.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALORANGE, new Image("/assets/textures/gemstone/opalOrange.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALRAINBOW, new Image("/assets/textures/gemstone/opalRainbow.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALRAINBOW2, new Image("/assets/textures/gemstone/opalRainbow2.png"));
        this.gemstoneImageMap.put(GemstoneEnum.OPALRAINBOW3, new Image("/assets/textures/gemstone/opalRainbow3.png"));
        this.gemstoneImageMap.put(GemstoneEnum.ORANGEOPAL, new Image("/assets/textures/gemstone/orangeOpal.png"));
        this.gemstoneImageMap.put(GemstoneEnum.PAINTEDRAINBOW, new Image("/assets/textures/gemstone/paintedRainbow.jpg"));
        this.gemstoneImageMap.put(GemstoneEnum.RAINBOWMETALLIC, new Image("/assets/textures/gemstone/rainbowMetallic.jpg"));
        this.gemstoneImageMap.put(GemstoneEnum.REALRUBY, new Image("/assets/textures/gemstone/realRuby.png"));
        this.gemstoneImageMap.put(GemstoneEnum.RHODOCROSITE, new Image("/assets/textures/gemstone/rhodocrosite.png"));
        this.gemstoneImageMap.put(GemstoneEnum.RHODOLITE, new Image("/assets/textures/gemstone/rhodolite.png"));
        this.gemstoneImageMap.put(GemstoneEnum.TANZANITE, new Image("/assets/textures/gemstone/tanzanite.png"));
        this.gemstoneImageMap.put(GemstoneEnum.TANZANITE2, new Image("/assets/textures/gemstone/tanzanite2.png"));
    }

    public Image getGemstoneByEnum(GemstoneEnum gemEnum) {
        return this.gemstoneImageMap.get(gemEnum);
    }
}
