package GUI;

import AccessModifiersPackage2.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExampleFrame extends JFrame implements ActionListener {


    JRadioButton pizzaButton = new JRadioButton("pizza");
    JRadioButton hamburgerButton = new JRadioButton("hamburger");
    JRadioButton hotdogButton = new JRadioButton("hotdog");
    ButtonGroup group = new ButtonGroup();
    JButton submitButton = new JButton("Submit!");
    ArrayList<String> selectedFood = new ArrayList<>();
    String selection = "";
    ImageIcon hamburgerIcon, pizzaIcon, hotdogIcon;

    public ExampleFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //--------------icons----------------
        pizzaIcon = new ImageIcon(new ImageIcon(
                "C:\\Users\\Programista\\IdeaProjects\\JavaTraining\\src\\GUI\\img\\pizzaemoji.png")
                .getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)
        );
        hamburgerIcon = new ImageIcon(new ImageIcon(
                "C:\\Users\\Programista\\IdeaProjects\\JavaTraining\\src\\GUI\\img\\hamburgeremoji.png")
                .getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)
        );
        hotdogIcon = new ImageIcon(new ImageIcon(
                "C:\\Users\\Programista\\IdeaProjects\\JavaTraining\\src\\GUI\\img\\hotdogemoji.png")
                .getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)
        );


        /*group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

         */

        //--------------button parameters---------------
        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        submitButton.setFocusable(false);
        submitButton.addActionListener(this);


        //green border on selection
        pizzaButton.addActionListener(e -> {

            if (pizzaButton.isSelected()) {
                pizzaButton.setBorder(BorderFactory.createLineBorder(Color.green));
                pizzaButton.setBorderPainted(true);
            }
            else {
                pizzaButton.setBorderPainted(false);
            }
        });

        hamburgerButton.addActionListener(e -> {
            if (hamburgerButton.isSelected()) {
                hamburgerButton.setBorder(BorderFactory.createLineBorder(Color.green));
                hamburgerButton.setBorderPainted(true);
            }
            else
                hamburgerButton.setBorderPainted(false);
        });

        hotdogButton.addActionListener(e -> {
            if (hotdogButton.isSelected()) {
                hotdogButton.setBorder(BorderFactory.createLineBorder(Color.green));
                hotdogButton.setBorderPainted(true);
            }
            else
                hotdogButton.setBorderPainted(false);
        });

        //-----------add components to the frame---------
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.add(submitButton);

        //-----------frame parameters-----------------
        this.setTitle("Standard GUI for tests");
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //add food to the list on click
        selectedFood.clear();
        if (e.getSource()==submitButton){
            if (pizzaButton.isSelected()){
                selectedFood.add("pizza");
            }
            if (hamburgerButton.isSelected()){
                selectedFood.add("hamburger");
            }
            if (hotdogButton.isSelected()){
                selectedFood.add("hot-dog");
            }
            printFoodList(selectedFood);
        }
    }

    private void printFoodList(ArrayList<String> selectedFood) {
        //print which food was selected (if was)
        selection = "";

        if (selectedFood.size() == 0) {
            selection += "No food was selected!";
        }
        else {
            //write the list of selected foods
            selection += "You have selected: ";
            for (int i=0; i<selectedFood.size(); i++) {
                if (i < selectedFood.size() - 1) {
                    selection += selectedFood.get(i) + ", ";
                }
                else {
                    selection += selectedFood.get(i) + ".";
                }
            }
        }
        System.out.println(selection);
    }
}
