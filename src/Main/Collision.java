package Main;

import Objects.Block;

import java.awt.*;

/**
 * Created by Peeter on 30-Nov-16.
 */
public class Collision {
    public static boolean playerBlock(Point p, Block b){
        return b.contains(p);
    }
}
