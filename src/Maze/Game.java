package Maze;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Peeter on 29-Nov-16.
 */
public class Game {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game by Peep Kuulme C11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(new GamePanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
