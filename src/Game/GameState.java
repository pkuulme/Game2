package Game;


import Objects.Player;

import java.awt.*;

/**
 * Created by Peeter on 29-Nov-16.*/


public abstract class GameState {
    protected CurrentGameState cgs;
    public static double xOffset;
    public static double yOffset;
    public GameState(CurrentGameState cgs){
        this.cgs = cgs;

        xOffset = 0;
        yOffset = 0;
        init();
    }
    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);

}
