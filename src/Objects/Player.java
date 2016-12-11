package Objects;

import Game.CurrentGameState;
import Game.Finish;
import Main.Collision;
import Game.GameState;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Peeter on 29-Nov-16.
 */

public class Player extends GameState{



    @Override
    public void init() {

    }

    @Override
    public void tick() {

    }

    private boolean right = false;
    private boolean left = false;
    private boolean up = false;
    private boolean down = false;

    private double x,y;
    private int width,height;



    public  Player(CurrentGameState gsm, int width, int height){
        super(gsm);

        x = 0;
        y = 110;
        this.width = width;
        this.height = height;

    }
    public void tick(Block[] b){

        int iX = (int)x;
        int iY = (int)y;

        for (int i = 0; i < b.length ; i++) {

            //Right
            if (Collision.playerBlock(new Point(iX  + width +  1 ,iY +  2), b[i])
                    || Collision.playerBlock(new Point (iX + width +  1 , iY + height  - 1),b[i])){

               right = false;

            }
            //Left
             if (Collision.playerBlock(new Point(iX - 2  ,iY + 2 ), b[i])
                    || Collision.playerBlock(new Point (iX - 2  , iY + height - 2),b[i])){

                left = false;
            }
            //Up
              if (Collision.playerBlock(new Point(iX   - 1,iY - 2  ), b[i])
                    || Collision.playerBlock(new Point (iX  + width - 1, iY - 2  ),b[i])){

                up  = false;

            }
            //Down
            if (Collision.playerBlock(new Point(iX + 1,iY + height ), b[i])
                    || Collision.playerBlock(new Point (iX  + width - 1, iY + height),b[i])){

                  down = false;

            }
            if (iX == 0) {
                left = false;
            }
            if (iX == 570) {
                right = false;
                cgs.states.push(new Finish(cgs));



            }

        }
        if (right){
            iX = (int) x++;

        }
        if (left){
            iX = (int) x--;
        }
        if (up){
            iY = (int) y--;
        }

        if (down){
            iY = (int) y++;

        }


    }

    public void draw(Graphics g){
        g.setColor(Color.black);
        g.fillRect((int)x,(int)y,width,height);

    }
    public void keyPressed(int k){
        if (k == KeyEvent.VK_RIGHT) right = true;
        if (k == KeyEvent.VK_LEFT) left = true;
        if (k == KeyEvent.VK_UP) up = true;
        if (k == KeyEvent.VK_DOWN) down = true;

    }
    public void keyReleased(int k){
        if (k == KeyEvent.VK_RIGHT) right = false;
        if (k == KeyEvent.VK_LEFT) left = false;
        if (k == KeyEvent.VK_DOWN) down = false;
        if (k == KeyEvent.VK_UP) up = false;

    }
}
