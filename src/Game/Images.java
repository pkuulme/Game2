package Game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Peeter on 02-Dec-16.
 */
public class Images {

    public static BufferedImage[] blocks;

    public  Images(){
        blocks = new BufferedImage[1];
        try {
            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Objects/block.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
