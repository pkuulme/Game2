package Game;
import java.awt.*;
import java.util.Stack;

/**
 * Created by Peeter on 29-Nov-16.
 */
public class CurrentGameState {
    public Stack<GameState> states;

    public CurrentGameState(){
        states = new Stack<>();
        states.push(new Menu(this));
    }
    public void tick(){
        states.peek().tick();
    }
    public void draw(Graphics g){
        states.peek().draw(g);
    }
    public void keyPressed(int k ){
        states.peek().keyPressed(k);
    }
    public void keyReleased(int k){
        states.peek().keyReleased(k);
    }
}
