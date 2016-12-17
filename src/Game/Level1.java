package Game;

import Objects.Block;
import Objects.Block2;
import Objects.Player;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Peeter on 29-Nov-16.
 */
public class Level1 extends GameState {

    public Player player;
    public int time = 2300;
    public int timer;
    public int counter;

    public static Block[] b;

    public Level1(CurrentGameState gsm){

        super(gsm);
    }

    public void init() {
        player = new Player(cgs,30,30);


        b = new Block[34];
        b[0] = new Block(0,0, 100, 100);
        b[1] = new Block(0,160, 100, 100);
        b[2] = new Block(100,0, 100, 100);
        b[3] = new Block(200,0, 100, 100);
        b[4] = new Block(300,0, 100, 100);
        b[5] = new Block(400,0, 100, 100);
        b[6] = new Block(500,0, 100, 100);
        b[7] = new Block(100,160, 100, 100);
        b[8] = new Block(100,140, 100, 100);
        b[9] = new Block(250,20, 100, 100);
        b[10] = new Block(200,160, 100, 100);
        b[11] = new Block(300,160, 100, 100);
        b[12] = new Block(360,160, 100, 100);
        b[13] = new Block(500,100, 100, 100);
        b[14] = new Block(500,200, 100, 100);
        b[15] = new Block(500,230, 100, 100);
        b[16] = new Block(500,330, 100, 100);
        b[17] = new Block(400,330, 100, 100);
        b[18] = new Block(300,330, 100, 100);
        b[19] = new Block(200,330, 100, 100);
        b[20] = new Block(0,230, 100, 100);
        b[21] = new Block(0,330, 100, 100);
        b[22] = new Block(0,430, 100, 100);
        b[23] = new Block(0,530, 100, 100);
        b[24] = new Block(100,500, 100, 100);
        b[25] = new Block(200,500, 100, 100);
        b[26] = new Block(300,500, 100, 100);
        b[27] = new Block(400,500, 100, 100);
        b[28] = new Block(500,500, 100, 100);
        b[29] = new Block(190,310, 100, 100);
        b[30] = new Block(350,190, 100, 100);
        b[31] = new Block(50,430, 100, 100);
        b[32] = new Block(200,350, 100, 100);
        b[33] = new Block(400,470, 100, 100);


    }

    public void tick() {
        for (int i = 0; i < b.length; i++) {
            b[i].tick();

        }


        player.tick(b);

    }

    public void draw(Graphics g) {
        player.draw(g);

        for (int i = 0; i < b.length; i++) {
            b[i].draw(g);
        }

        timer = (time - 2);
        counter = timer / 10;


        g.setColor(Color.darkGray);
        g.fillRect(10,10,230,40);
        g.setColor(Color.blue);
        g.fillRect(10,10,counter,40);
        g.setColor(Color.WHITE);
        g.drawRect(10,10,230,40);
        timer = (time -=0.1);


        if (timer == 0) {
            cgs.states.push(new TimeOut(cgs));
        }
    }


    public void keyPressed(int k) {
        player.keyPressed(k);
        if (k == KeyEvent.VK_ESCAPE){
            cgs.states.push(new Menu(cgs));
        }
    }


    public void keyReleased(int k) {
        player.keyReleased(k);
    }

}
