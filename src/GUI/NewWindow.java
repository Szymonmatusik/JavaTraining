package GUI;

import javax.swing.*;
import java.awt.*;


public class NewWindow  {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, this is new window");

    JButton goBackButton = new JButton("Go back to main page");

    NewWindow(){
        //-----------------label parameters-------------
        label.setBounds(0,0, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        //-----------------button parameters------------
        goBackButton.setBounds(150, 220, 200, 40);
        goBackButton.setFocusable(false);
        goBackButton.setBorder(BorderFactory.createLineBorder(Color.black));
        goBackButton.addActionListener(e->{
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Window");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.add(label);
        frame.add(goBackButton);
        //frame.pack();
        frame.setVisible(true);


    }
}
