package Game;

import Main.GamePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Peeter on 02-Dec-16.
 */
public class About extends GameState {

    JLabel jl = new JLabel();

    public About(CurrentGameState gsm){
        super(gsm);
    }

    public void init() {

    }

    public void tick() {


    }

    public void draw(Graphics g) {
        g.setFont(new Font("Arial",Font.BOLD,42));
        g.setColor(new Color(200,200,250));
        g.drawString("Get through the maze", 50,200);
        g.drawString("before the time runs out", 50,300);



    }

    public void keyPressed(int k) {
        if (k == KeyEvent.VK_ESCAPE) {

            cgs.states.push(new Menu(cgs));
        }
    }

    public void keyReleased(int k) {

    }
}
