package Game;

import java.awt.*;

/**
 * Created by Peeter on 29-Nov-16.*/


public abstract class GameState {
    protected CurrentGameState cgs;
    public GameState(CurrentGameState cgs){
        this.cgs = cgs;
        init();
    }
    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);

}
