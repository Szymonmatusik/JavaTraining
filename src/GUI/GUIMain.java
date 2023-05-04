package GUI;

import AccessModifiersPackage2.B;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIMain {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, image or both
        /*
        MyJLabel label1 = new MyJLabel("Hello, how are you?",
                                    "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\icon.jpg");
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.RIGHT);


        String iconPath = "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\icon.jpg";
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(iconPath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        JLabel label1 = new JLabel();
        label1.setText("Hello how are you?");
        label1.setIcon(imageIcon);
        label1.setBounds(0, 0, 250, 100);
        label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setFont(new Font("MV Boli", Font.PLAIN, 10)); //set font of text

         */
        new MyFrame();
        new BrdLayout();
        new FlwLayout();
        new GrdLayout();
        new JLayeredPaneTest();
    }
}
