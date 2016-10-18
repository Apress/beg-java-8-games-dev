package invincibagel;
import javafx.animation.AnimationTimer;
public class GamePlayLoop extends AnimationTimer {
    protected InvinciBagel invinciBagel;
    public GamePlayLoop(InvinciBagel iBagel){
        invinciBagel = iBagel;
    }
    @Override
    public void handle(long now) {
        invinciBagel.iBagel.update();
        invinciBagel.iBeagle.update();
    }
    @Override
    public void start(){
        super.start();
    }
    @Override
    public void stop(){
        super.stop();
    }
}