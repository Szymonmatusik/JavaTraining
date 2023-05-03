package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton buttonShowIcon, buttonHideIcon;
    JLabel label;
    JPanel redPanel, greenPanel, bluePanel;
    MyFrame(){
        //Frame icon
        ImageIcon frameIcon = new ImageIcon("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\icon.jpg");

        //Button icon
        ImageIcon buttonIcon = new ImageIcon(new ImageIcon ("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\poop.png")
                                            .getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));

        //Label icon
        ImageIcon labelIcon = new ImageIcon(new ImageIcon("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\funny.png")
                                                            .getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));


        //instances of frame elements
        buttonShowIcon = new JButton(buttonIcon);
        buttonHideIcon = new JButton(buttonIcon);
        label = new JLabel();
        redPanel = new JPanel();
        bluePanel = new JPanel();
        greenPanel = new JPanel();

        //redPanel parameters
        redPanel.setBackground(new Color(255, 0,0));
        redPanel.setLayout(null);
        redPanel.setBounds(0,0,250,250);

        //bluePanel parameters
        bluePanel.setBackground(new Color(0, 0,255));
        bluePanel.setLayout(null);
        bluePanel.setBounds(redPanel.getX() + redPanel.getWidth(),0, 250, 250);

        //greenPanel parameters
        greenPanel.setBackground(new Color(0, 255,0));
        greenPanel.setLayout(null);
        greenPanel.setBounds((redPanel.getWidth()+bluePanel.getWidth())/4, redPanel.getHeight(), 250, 250);

        //show icon button parameters
        buttonShowIcon.setBounds(12, 100,
                100, 50);
        buttonShowIcon.setText("Show label!");
        buttonShowIcon.setIcon(buttonIcon);
        buttonShowIcon.setHorizontalTextPosition(JButton.CENTER);
        buttonShowIcon.setFocusable(false);
        buttonShowIcon.setFont(new Font("Comic Sans", Font.BOLD, 10));
        buttonShowIcon.setForeground(new Color(255, 0,0 ));
        buttonShowIcon.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        //hide icon button parameters
        buttonHideIcon.setLayout(null);
        buttonHideIcon.setBounds(12+buttonShowIcon.getWidth() + 25, 100,
                100, 50);
        buttonHideIcon.setText("Hide label!");
        buttonHideIcon.setIcon(buttonIcon);
        buttonHideIcon.setHorizontalTextPosition(JButton.CENTER);
        buttonHideIcon.setFocusable(false);
        buttonHideIcon.setFont(new Font("Comic Sans", Font.BOLD, 10));
        buttonHideIcon.setForeground(new Color(255, 0,0 ));
        buttonHideIcon.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        //label parameters
        label.setIcon(labelIcon);
        label.setLayout(null);
        label.setBounds(100, 100, 200, 200);
        label.setVisible(false);

        //lambda expression!!! - print statement on button click
        buttonShowIcon.addActionListener(e -> {
            System.out.println("Poop");
            label.setVisible(true);
        });

        //lambda expression!!! - print statement on button click
        buttonHideIcon.addActionListener(e -> {
            System.out.println("Poop hidden");
            label.setVisible(false);
        });









        this.setTitle("This is my first GUI window"); //add title to the frame window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the application
        this.setResizable(true); //abandon to resize the application
        this.setIconImage(frameIcon.getImage()); //change icon of the frame
        this.setSize(750, 750);
        this.setLayout(null);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        greenPanel.add(buttonShowIcon);
        greenPanel.add(buttonHideIcon);
        greenPanel.add(label);
        this.setVisible(true);


    }
}
