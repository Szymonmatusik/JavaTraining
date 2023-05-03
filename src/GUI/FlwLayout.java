package GUI;

import javax.swing.*;
import java.awt.*;

public class FlwLayout {
    //LayoutManager - defines the natural layout for components within the container

    //FlowLayout = places components in a row, sized at their preferred size. If the horizontal space in the container
    //is too small, the Flowlayout class uses the next available row

    int i=0;
    JPanel buttonPanel = new JPanel();
    JPanel labelPanel = new JPanel();
    JFrame mainFrame = new JFrame();

    JButton[] buttons = new JButton[9];

    JLabel label = new JLabel();
    JLabel footer = new JLabel();

    FlwLayout(){
        //--------------Button Panel definition-----------------;
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(new Color(166, 165, 158, 255));
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //--------------buttons definitions--------------
        int counter = 0;
        for(i=0; i<buttons.length; i++){
            buttons[i] = new JButton(String.valueOf(i+1));
            buttons[i].setHorizontalTextPosition(JButton.CENTER);
            buttons[i].setPreferredSize(new Dimension(40, 20));
            buttons[i].setFocusable(false);
            buttonPanel.add(buttons[i]);
        }

        //------------buttons addListenerAction------------
        buttons[0].addActionListener(e -> {
            label.setText("Button 1 pressed");
        });
        buttons[1].addActionListener(e -> {
            label.setText("Button 2 pressed");
        });
        buttons[2].addActionListener(e -> {
            label.setText("Button 3 pressed");
        });
        buttons[3].addActionListener(e -> {
            label.setText("Button 4 pressed");
        });
        buttons[4].addActionListener(e -> {
            label.setText("Button 5 pressed");
        });
        buttons[5].addActionListener(e -> {
            label.setText("Button 6 pressed");
        });
        buttons[6].addActionListener(e -> {
            label.setText("Button 7 pressed");
        });
        buttons[7].addActionListener(e -> {
            label.setText("Button 8 pressed");
        });
        buttons[8].addActionListener(e -> {
            label.setText("Button 9 pressed");
        });

        //----------------label to print button text--------------
        label.setText("No button was pressed recently!");
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(165, 165, 236));

        //----------------footer of the GUI--------------
        footer.setPreferredSize(new Dimension(10, 30));
        footer.setText("Made by Szymon");
        footer.setVerticalTextPosition(JLabel.CENTER);
        footer.setHorizontalTextPosition(JLabel.CENTER);
        footer.setVerticalAlignment(JLabel.CENTER);
        footer.setHorizontalAlignment(JLabel.CENTER);
        footer.setOpaque(true);
        footer.setBackground(Color.lightGray);
        footer.setBorder(BorderFactory.createLineBorder(Color.black));



        //-----------------labelPanel configuration---------------
        labelPanel.setLayout(new BorderLayout(200, 200));
        labelPanel.add(footer, BorderLayout.SOUTH);
        labelPanel.add(label, BorderLayout.CENTER);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("FlowLayout Manager Test");
        mainFrame.setSize(new Dimension(500, 500));
        mainFrame.add(labelPanel, BorderLayout.CENTER);
        mainFrame.add(buttonPanel, BorderLayout.NORTH);
        //mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
