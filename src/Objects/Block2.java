package Objects;

import java.awt.*;

/**
 * Created by Peeter on 12-Dec-16.
 */
public class Block2 extends Rectangle{

    public static final int blockSizeX = 50;
    public static final int BlockSizeY = 50;

    public Block2(int x, int y){
        setBounds(x,y,blockSizeX,BlockSizeY);
    }
    public void tick(){

    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);
    }
}
