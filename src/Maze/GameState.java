package Maze;

import java.awt.*;

/**
 * Created by Peeter on 29-Nov-16.
 */
public abstract class GameState {
    protected GameStateManager gsm;
    public GameState(GameStateManager gsm){
        this.gsm = gsm;
        init();
    }
    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);

}
