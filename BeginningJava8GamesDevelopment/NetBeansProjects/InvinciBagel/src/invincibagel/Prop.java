package invincibagel;

import javafx.scene.image.Image;

public class Prop extends Actor {
    
    public Prop(String SVGdata, double xLocation, double yLocation, Image... spriteCels){
        super(SVGdata, xLocation, yLocation, spriteCels);
        spriteFrame.setTranslateX(xLocation);
        spriteFrame.setTranslateY(yLocation);
    }
    
    @Override
    public void update() {
        //empty method
    }
    
}
