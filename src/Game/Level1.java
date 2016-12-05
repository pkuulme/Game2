package Game;

import Objects.Block;
import Objects.Player;

import java.awt.*;

/**
 * Created by Peeter on 29-Nov-16.
 */
public class Level1 extends GameState {

    public Player player;

    public static Block[] b;

    public Level1(CurrentGameState gsm){

        super(gsm);
    }

    public void init() {
        player = new Player(cgs,30,30);

        b = new Block[34];
        b[0] = new Block(0,0);
        b[1] = new Block(0,160);
        b[2] = new Block(100,0);
        b[3] = new Block(200,0);
        b[4] = new Block(300,0);
        b[5] = new Block(400,0);
        b[6] = new Block(500,0);
        b[7] = new Block(100,160);
        b[8] = new Block(100,140);
        b[9] = new Block(250,20);
        b[10] = new Block(200,160);
        b[11] = new Block(300,160);
        b[12] = new Block(350,160);
        b[13] = new Block(500,100);
        b[14] = new Block(500,200);
        b[15] = new Block(500,230);
        b[16] = new Block(500,330);
        b[17] = new Block(400,330);
        b[18] = new Block(300,330);
        b[19] = new Block(200,330);
        b[20] = new Block(0,230);
        b[21] = new Block(0,330);
        b[22] = new Block(0,430);
        b[23] = new Block(0,530);
        b[24] = new Block(100,500);
        b[25] = new Block(200,500);
        b[26] = new Block(300,500);
        b[27] = new Block(400,500);
        b[28] = new Block(500,500);
        b[29] = new Block(180,310);
        b[30] = new Block(350,190);
        b[31] = new Block(50,430);
        b[32] = new Block(200,350);
        b[33] = new Block(400,470);

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
    }

    public void keyPressed(int k) {
        player.keyPressed(k);
    }


    public void keyReleased(int k) {
        player.keyReleased(k);
    }

}
