package GUI;

import javax.swing.*;
import java.awt.*;

public class BrdLayout {

    JPanel panelNorth = new JPanel();
    JPanel panelSouth = new JPanel();
    JPanel panelWest = new JPanel();
    JPanel panelEast = new JPanel();
    JPanel panelCenter = new JPanel();
    JPanel panelInsideNorth = new JPanel();
    JPanel panelInsideSouth = new JPanel();
    JPanel panelInsideWest = new JPanel();
    JPanel panelInsideEast = new JPanel();
    JPanel panelInsideCenter = new JPanel();
    JFrame frame = new JFrame();


    BrdLayout() {
        //panels parameters
        panelNorth.setBackground(Color.RED);
        panelSouth.setBackground(Color.BLUE);
        panelWest.setBackground(Color.GREEN);
        panelEast.setBackground(Color.BLACK);
        panelCenter.setBackground(Color.GRAY);

        panelNorth.setPreferredSize(new Dimension(100, 100));
        panelSouth.setPreferredSize(new Dimension(100, 100));
        panelWest.setPreferredSize(new Dimension(100, 100));
        panelEast.setPreferredSize(new Dimension(100, 100));
        panelCenter.setPreferredSize(new Dimension(100, 100));

        panelCenter.setLayout(new GridLayout(3, 3));

        //panels inside panel
        panelInsideNorth.setBackground(Color.RED);
        panelInsideSouth.setBackground(Color.BLUE);
        panelInsideWest.setBackground(Color.GREEN);
        panelInsideEast.setBackground(Color.BLACK);
        panelInsideCenter.setBackground(Color.GRAY);


        panelInsideNorth.setPreferredSize(new Dimension(20, 20));
        panelInsideSouth.setPreferredSize(new Dimension(20, 20));
        panelInsideWest.setPreferredSize(new Dimension(20, 20));
        panelInsideEast.setPreferredSize(new Dimension(20, 20));
        panelInsideCenter.setPreferredSize(new Dimension(20, 20));

        //place small panels inside center panel
        panelCenter.add(panelInsideNorth);
        panelCenter.add(panelInsideSouth);
        panelCenter.add(panelInsideWest);
        panelCenter.add(panelInsideEast);
        panelCenter.add(panelInsideCenter);


        //frame parameters
        frame.setDefaultCloseOperation(new JFrame().EXIT_ON_CLOSE);
        frame.setTitle("BorderLayoutManager");
        frame.setLayout(new BorderLayout(10, 10));

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelCenter, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

    }
}
