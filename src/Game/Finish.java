package Game;

import java.awt.*;

/**
 * Created by Peeter on 05-Dec-16.
 */
public class Finish extends GameState {

    public Finish(CurrentGameState gsm){
        super(gsm);

    }

    public void init() {

    }

    public void tick() {

    }

    public void draw(Graphics g) {

        g.setColor(Color.GRAY);
        g.fillRect(0,0,600,600);

        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,49));
        g.drawString("You did it!", 170,200);
        g.drawString("You got out of the maze", 30, 300);
    }


    public void keyPressed(int k) {

    }

    public void keyReleased(int k) {

    }
}
