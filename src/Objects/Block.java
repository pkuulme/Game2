package Objects;

import Game.GameState;

import java.awt.*;

/**
 * Created by Peeter on 30-Nov-16.
 */
public class Block extends Rectangle{

        public Block(int x, int y, int blockSizeX, int blockSizeY){
            setBounds(x,y,blockSizeX,blockSizeY);
        }


    public void tick(){

    }

    public void draw(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x,y,width,height);
    }
}
