package GUI;

import AccessModifiersPackage2.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame {

    JButton button;
    MyFrame(JButton button){
        //JFrame = a GUI Window to add components to
        this.button = button;
        //lambda expression!!!
        this.button.addActionListener(e -> {
            System.out.println("Poop");
        });

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\icon.jpg");

        this.setTitle("This is my first GUI window"); //add title to the frame window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the application
        this.setResizable(true); //abandon to resize the application
        this.setIconImage(imageIcon.getImage()); //change icon of the frame
        //this.setSize(420, 420); //set size of the frame window
        //this.getContentPane().setBackground(new Color(50, 0,120)); //Change color of the background

        //this.setVisible(true); //set frame visibility

    }
}
