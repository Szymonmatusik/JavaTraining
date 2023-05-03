package GUI;

import javax.swing.*;
import java.awt.*;

public class GrdLayout {
    //GridLayout = places component in a grid of cells. Each component takes all the available space within its cell,
    //and each cell is the same size


    GrdLayout(){
        //------------Create frame---------
        JFrame frame = new JFrame();
        frame.setTitle("Grid Layout Manager Training");
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 10, 10));


        //---------Add 9 buttons------------
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}
