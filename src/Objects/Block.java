package Objects;

import Game.GameState;

import java.awt.*;

/**
 * Created by Peeter on 30-Nov-16.
 */
public class Block extends Rectangle{

    public static final int blockSizeX = 100;
    public static final int BlockSizeY = 100;



    public Block(int x, int y){
        setBounds(x,y,blockSizeX,BlockSizeY);
    }


    public void tick(){

    }

    public void draw(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x - (int)GameState.xOffset,y - (int)GameState.yOffset,width,height);
    }
}
