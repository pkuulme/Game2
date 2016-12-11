package Game;

import java.awt.*;
import java.awt.event.KeyEvent;

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

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,600,600);

        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,49));
        g.drawString("You did it!", 170,200);
        g.drawString("You got out of the maze", 30, 300);
        g.setFont(new Font("Arial",Font.BOLD,24));
        g.drawString("Press enter to try again", 180, 470);
        g.drawString("Press Esc to exit", 210, 500);
    }


    public void keyPressed(int k) {
        if (k == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
        if (k == KeyEvent.VK_ENTER) {
            cgs.states.push(new Level1(cgs));
        }

    }

    public void keyReleased(int k) {

    }
}
