package invincibagel;

import javafx.scene.image.Image;

public class Projectile extends Actor {

    public Projectile(String SVGdata, double xLocation, double yLocation, Image... spriteCels) {
        super(SVGdata, xLocation, yLocation, spriteCels);
        spriteFrame.setTranslateX(xLocation);
        spriteFrame.setTranslateY(yLocation);
        isFixed = false;
        isBonus = true;
        hasValu = true;
    }
    @Override
    public void update() {
        // Empty Method
    }
}
