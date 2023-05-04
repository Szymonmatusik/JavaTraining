package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Open New Window");

    LaunchPage(){
        button.setFocusable(false);
        button.setBounds(150, 220, 200, 40);
        button.setBorder(BorderFactory.createLineBorder(Color.black));
        button.addActionListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Main Frame");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.add(button);
        //frame.pack();
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();

        }
    }
}
