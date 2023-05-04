package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest extends JFrame implements ActionListener {

    JButton button;
    JTextField textFieldInput, textFieldOutput;
    String text = "";
    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();
    TextFieldTest(){
        //------------input area------------
        textFieldInput = new JTextField();
        textFieldInput.setPreferredSize(new Dimension(250, 40));

        button = new JButton("Submit");
        button.addActionListener(this);

        inputPanel.setBounds(0, 0, 500, 100);
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(textFieldInput);
        inputPanel.add(button);


        //------------output area-----------
        textFieldOutput = new JTextField();
        textFieldOutput.setPreferredSize(new Dimension(400, 100));
        textFieldOutput.setEditable(false);
        textFieldOutput.setBackground(Color.white);
        textFieldOutput.setBorder(BorderFactory.createLineBorder(Color.black));


        outputPanel.setBounds(0, 100, 500, 150);
        outputPanel.setLayout(new FlowLayout());

        outputPanel.add(textFieldOutput);





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(inputPanel);
        this.add(outputPanel);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button){
            this.text = this.textFieldInput.getText();
        }

        if (this.text != ""){
            this.textFieldOutput.setText(this.text);
        }

    }
}
