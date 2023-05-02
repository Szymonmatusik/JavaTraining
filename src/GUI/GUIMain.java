package GUI;

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
         */

        String iconPath = "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\icon.jpg";
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(iconPath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        JLabel label1 = new JLabel();
        label1.setText("Hello how are you?");
        label1.setIcon(imageIcon);
        label1.setBounds(0, 0, 250, 100);
        label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setFont(new Font("MV Boli", Font.PLAIN, 10)); //set font of text


        JPanel redPanel = new MyJPanel(Color.RED,0, 0,250 , 250 );
        redPanel.setLayout(null);

        JPanel bluePanel = new MyJPanel(Color.BLUE, redPanel.getX() + redPanel.getWidth(), 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new MyJPanel(Color.GREEN, (redPanel.getWidth()+bluePanel.getWidth())/4,
                                                            redPanel.getHeight(), 250, 250);
        greenPanel.setLayout(null);

        //redPanel.setLayout(new BorderLayout());

        //Buttons
        ImageIcon buttonIcon = new ImageIcon(new ImageIcon("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\poop.png")
                                                            .getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
        JButton button = new JButton();
        button.setLayout(null);
        button.setBounds(75, 100,
                        100, 50);
        button.setText("Click here!");
        button.setIcon(buttonIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFocusable(false);




        MyFrame frame = new MyFrame(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        redPanel.add(label1);
        greenPanel.add(button);
        //frame.pack();
        frame.setVisible(true);
        //frame.pack();

    }
}
