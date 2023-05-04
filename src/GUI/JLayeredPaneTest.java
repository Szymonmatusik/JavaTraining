package GUI;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneTest {
    //JLayeredPane = Swing container that provides a third dimension for positioning components ex. depth, Z-index

    JLayeredPane jLayeredPane = new JLayeredPane();
    JFrame frame = new JFrame("JLayeredPane");

    JLabel labelRed = new JLabel();
    JLabel labelBlue = new JLabel();
    JLabel labelGreen = new JLabel();

    JLayeredPaneTest(){

        //create jLayerPane
        jLayeredPane.setBounds(0, 0, 500, 500);

        //labels parameters
        labelBlue.setBounds(100, 100, 100, 100);
        labelRed.setBounds(labelBlue.getWidth()/2, labelBlue.getHeight()/2, 100, 100);
        labelGreen.setBounds(100+labelRed.getWidth()/2, 100+labelRed.getHeight()/2, 100, 100);

        labelBlue.setBackground(Color.BLUE);
        labelBlue.setOpaque(true);
        labelRed.setBackground(Color.RED);
        labelRed.setOpaque(true);
        labelGreen.setBackground(Color.GREEN);
        labelGreen.setOpaque(true);

        //add labels to the jLayer
        jLayeredPane.add(labelBlue, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.add(labelRed, Integer.valueOf(1));
        jLayeredPane.add(labelGreen, JLayeredPane.DRAG_LAYER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.add(jLayeredPane);
        frame.setVisible(true);

    }


}
