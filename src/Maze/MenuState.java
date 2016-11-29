package Maze;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Peeter on 29-Nov-16.
 */
public class MenuState extends GameState{

    private String[] options = {"Start","Help","Quit"};
    private int currentSelection = 0;

    public MenuState(GameStateManager gsm){
        super(gsm);
    }

    public void init() {

    }

    public void tick() {

    }

    public void draw(Graphics g) {

        g.setColor(new Color(20,10,70));
        g.fillRect(0,0,GamePanel.WIDTH,GamePanel.HEIGHT);
        for (int i = 0; i <options.length; i++) {
            if (i == currentSelection){
                g.setColor(Color.green);
            }else{
                g.setColor(Color.white);
            }
            g.setFont(new Font("Arial",Font.BOLD,72));
            g.drawString(options[i], GamePanel.WIDTH/2 - 75,150 + i*150);
        }

    }

    public void keyPressed(int k) {
        if (k == KeyEvent.VK_DOWN) {
            currentSelection++;
            if (currentSelection > options.length) {
                currentSelection = 0;
            }
        } else if (k == KeyEvent.VK_UP) {
            currentSelection--;
            if (currentSelection < 0) {
                currentSelection = -1;
            }
        }
        if (k == KeyEvent.VK_ENTER) {
            if (currentSelection == 0) {


            } else if (currentSelection == 1) {

            }else if (currentSelection == 2) {
                System.exit(0);
            }
        }
    }


    public void keyReleased(int k) {

    }

}
