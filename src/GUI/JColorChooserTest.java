package GUI;

import javax.swing.*;
import java.awt.*;

public class JColorChooserTest extends JFrame {
    //JColorChooser - A GUI mechanism that lets a user choose a color

    JLabel textLabel = new JLabel();
    JColorChooser colorChooser = new JColorChooser();
    Color fontColor = new Color(0 ,0 ,0 );
    JButton changeColorButton = new JButton("Change color");
    public JColorChooserTest(){

        //----------button parameters----------
        changeColorButton.setPreferredSize(new Dimension(100, 50));
        changeColorButton.setFocusable(false);
        changeColorButton.setBorder(BorderFactory.createLineBorder(Color.black));
        changeColorButton.addActionListener(e -> {
            fontColor = JColorChooser.showDialog(this, "Choose color of the font", Color.black);
            textLabel.setForeground(fontColor);
        });

        //---------text label parameters--------
        textLabel.setText("Text to be modified");
        textLabel.setFont(new Font("Comic Sans", Font.BOLD, 25));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500, 500));
        this.add(changeColorButton);
        this.add(textLabel);
        this.pack();
        this.setVisible(true);
    }


}
