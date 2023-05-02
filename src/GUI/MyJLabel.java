package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyJLabel extends JLabel {

    MyJLabel(String text, String path){

        ImageIcon image = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH));
        Border border = BorderFactory.createLineBorder(Color.GREEN);


        this.setText(text);
        this.setIcon(image);
        this.setHorizontalTextPosition(JLabel.CENTER);//set text left, center or right o=position of icon
        this.setVerticalTextPosition(JLabel.TOP);//set text TOP, CENTER OR BOTTOM
        this.setForeground(Color.GREEN); //set font color of text
        this.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
        this.setIconTextGap(10); //set gap between text and image
        this.setBackground(Color.BLACK); //set the color of background
        this.setOpaque(true); //display background color
        this.setBorder(border); //set border of the label
        this.setVerticalAlignment(JLabel.CENTER); //set vertical position of the whole label
        this.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of the whole label
        //this.setBounds(0, 0, 100, 100); //set bounds of the labels (possible only when layout manager is set to null)
    }
}
