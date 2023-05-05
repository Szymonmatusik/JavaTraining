package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JComboBoxTest extends JFrame {

    //JComboBox = GUI component that combines a button or editable field and a drop-down list, we can only reference data types, not primitive

    String[] animals = {"Dog", "Cat", "Bird"};
    JComboBox comboBox = new JComboBox(animals);

    public JComboBoxTest(){


        comboBox.setEditable(true); //makes combobox editable
        System.out.println(comboBox.getItemCount()); //how many items in combo box
        comboBox.addItem("Horse"); //add new Item to combobox
        comboBox.insertItemAt("Cow", comboBox.getItemCount());
        System.out.println(comboBox.getItemCount()); //how many items in combo box
        comboBox.setSelectedIndex(0); //always select certain index when starting
        comboBox.removeItem("Cow");
        comboBox.removeItemAt(0);
        comboBox.removeAllItems(); //remove all items


        comboBox.addActionListener(e -> {
            System.out.println(String.valueOf(comboBox.getSelectedIndex()) + comboBox.getSelectedItem());

        });

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("New Window");
       this.setLayout(new FlowLayout());
       this.setSize(500, 500);
       this.add(comboBox);
       this.pack();
       this.setVisible(true);
   }
}
