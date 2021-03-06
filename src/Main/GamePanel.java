package Main;

import Game.CurrentGameState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Created by Peeter on 29-Nov-16.
 */
public class GamePanel extends JPanel implements Runnable, KeyListener{

    public static  int WIDTH = 600;
    public static  int HEIGHT = 600;

    private Thread thread;
    private Boolean isRunning = false;

    private int FPS = 60;
    private long targetTime = 400/FPS;

    private CurrentGameState csm;



    public GamePanel(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));

        addKeyListener(this);
        setFocusable(true);

        Start();
    }
    private void Start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();

    }

    public void run(){
        long start, elapsed, wait;

        csm = new CurrentGameState();

        while (isRunning){
            start = System.nanoTime();

            tick();
            repaint();


            elapsed = System.nanoTime() - start;
            wait = targetTime - elapsed / 1000000;


            if (wait <= 0){
                wait = 5;
            }
            try {
                Thread.sleep(wait);
            }catch (Exception e){
                e.printStackTrace();

            }
        }

    }
    public void tick(){
        csm.tick();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.darkGray);
        g.fillRect(0,0,WIDTH,HEIGHT);
        csm.draw(g);

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        csm.keyPressed(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
        csm.keyReleased(e.getKeyCode());
    }
}
