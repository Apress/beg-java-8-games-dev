package invincibagel;
import javafx.scene.image.Image;
public abstract class Hero extends Actor {
    protected double vX, vY, lifeSpan, damage, offsetX, offsetY;
    protected float boundScale, boundRot, friction, gravity, bounce;
    public Hero(String SVGdata, double xLocation, double yLocation, Image... spriteCels) {
        super(SVGdata, xLocation, yLocation, spriteCels);
        lifeSpan = 1000;
        vX = vY = 1;
    }
    @Override public abstract void update();
    public boolean collide(Actor object) {
        return false;
    }
    public void relocateActor(double x, double y) {
        spriteFrame.relocate(x,y);
    }
    public double getvX() {
        return vX;
    }
    public void setvX(double vX) {
        this.vX = vX;
    }
    public double getvY() {
        return vY;
    }
    public void setvY(double vY) {
        this.vY = vY;
    }
    public double getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    public double getDamage() {
        return damage;
    }
    public void setDamage(double damage) {
        this.damage = damage;
    }
    public double getOffsetX() {
        return offsetX;
    }
    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }
    public double getOffsetY() {
        return offsetY;
    }
    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }
    public float getBoundScale() {
        return boundScale;
    }
    public void setBoundScale(float boundScale) {
        this.boundScale = boundScale;
    }
    public float getBoundRot() {
        return boundRot;
    }
    public void setBoundRot(float boundRot) {
        this.boundRot = boundRot;
    }
    public float getFriction() {
        return friction;
    }
    public void setFriction(float friction) {
        this.friction = friction;
    }
    public float getGravity() {
        return gravity;
    }
    public void setGravity(float gravity) {
        this.gravity = gravity;
    }
    public float getBounce() {
        return bounce;
    }
    public void setBounce(float bounce) {
        this.bounce = bounce;
    }
}