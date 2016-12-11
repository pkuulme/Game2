package Game;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Peeter on 09-Dec-16.
 */
public class TimeOut extends GameState {

    public TimeOut(CurrentGameState gsm) {
        super(gsm);
    }

    @Override
    public void init() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 600, 600);

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 49));
        g.drawString("You ran out of time", 100, 200);
        g.setFont(new Font("Arial",Font.BOLD,24));
        g.drawString("Press enter to try again", 180, 470);
        g.drawString("Press Esc to exit", 210, 500);


    }

    @Override
    public void keyPressed(int k) {
        if (k == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
        if (k == KeyEvent.VK_ENTER) {
            cgs.states.push(new Level1(cgs));
        }

    }

    public void keyReleased ( int k){
    }
}