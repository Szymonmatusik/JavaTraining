package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxTest extends JFrame implements ActionListener {

    //JCheckBox = A GUI Component that can be selected or deselected

    JFrame frame = new JFrame("Checkbox Test Frame");
    JCheckBox checkBox = new JCheckBox("This is my first checkbox");
    JButton submitButton = new JButton("Submit!");

    JCheckBoxTest(){

        checkBox.setFocusable(false);

        submitButton.setPreferredSize(new Dimension(150, 40));
        submitButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setTitle("Main Frame");
        frame.add(checkBox);
        frame.add(submitButton);
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton){
            if (checkBox.isSelected()){
                System.out.println("Checkbox is filled!");
            }
            else if (!checkBox.isSelected()){
                System.out.println("Checkbox is not filled!");
            }
        }
    }
}
