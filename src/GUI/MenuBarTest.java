package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MenuBarTest extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu viewMenu = new JMenu("View");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem saveItem = new JMenuItem("Save..");
    JMenuItem saveAsItem = new JMenuItem("Save as..");
    JMenuItem settingsItem = new JMenuItem("Settings");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem resizeItem = new JMenuItem("Resize");
    JMenuItem fullScreenItem = new JMenuItem("Full Screen");
    JMenuItem minimizeItem = new JMenuItem("Minimize");
    JMenuItem helpItem = new JMenuItem("Help");
    JMenuItem aboutItem = new JMenuItem("About");

    JFileChooser fileChooser = new JFileChooser();
    File file;




    MenuBarTest(){

        /* First tab of the menu bar */

        //---------------file menu parameters--------------
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.getAccessibleContext().setAccessibleDescription(
                "This menu allows to edit file"
        );

        //---------------Save button parameters-------------
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        saveItem.getAccessibleContext().setAccessibleDescription("This should save a file");
        saveItem.addActionListener(e -> {
            System.out.println("Saved");
        });
        fileMenu.add(saveItem);

        //---------------Save as button parameters-------------
        saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK+ InputEvent.SHIFT_DOWN_MASK));
        saveAsItem.getAccessibleContext().setAccessibleDescription("This should save as new file");
        saveAsItem.addActionListener(e -> {
                    if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                        try {
                            FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile());
                            fileWriter.write("This is my test.");
                            fileWriter.flush();
                        }
                        catch (IOException ex) {
                            JOptionPane.showMessageDialog(this, "Saving not successful");
                        }
                    }
                });
        fileMenu.add(saveAsItem);


        //---------------Settings button parameters-------------
        settingsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
        settingsItem.getAccessibleContext().setAccessibleDescription("This should open settings window");
        settingsItem.addActionListener(e -> {
            System.out.println("Settings Opened");
        });
        fileMenu.add(settingsItem);


        fileMenu.addSeparator();

        //---------------OpenItem button parameters-------------
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        openItem.getAccessibleContext().setAccessibleDescription("This should open settings window");
        openItem.addActionListener(e -> {
            int returnValue = fileChooser.showOpenDialog(this);

            if(returnValue == JFileChooser.APPROVE_OPTION){
                file = fileChooser.getSelectedFile();
                System.out.println("Opening " + file.getName());
            }
            else{
                System.out.println("Opening was not successful.");
            }
        });
        fileMenu.add(openItem);


        /* Second tab of the menu bar */

        //---------------view tab parameters--------------
        viewMenu.setMnemonic(KeyEvent.VK_V);
        viewMenu.getAccessibleContext().setAccessibleDescription(
                "This menu allows to edit view of the file"
        );

        //---------------resize button parameters-------------
        resizeItem.getAccessibleContext().setAccessibleDescription("This should resize a file");
        resizeItem.addActionListener(e -> {
            System.out.println("Resized");
        });
        viewMenu.add(resizeItem);

        //---------------full screen button parameters-------------
        fullScreenItem.getAccessibleContext().setAccessibleDescription("This should make a file fullscreen");
        fullScreenItem.addActionListener(e -> {
            System.out.println("File is in full screen");
        });
        viewMenu.add(fullScreenItem);


        //---------------minimize button parameters-------------
        minimizeItem.getAccessibleContext().setAccessibleDescription("This should open settings window");
        minimizeItem.addActionListener(e -> {
            System.out.println("Minimized");
        });
        viewMenu.add(minimizeItem);

        //---------------third tab of the menu bar-------------
        helpMenu.setMnemonic(KeyEvent.VK_H);
        helpMenu.getAccessibleContext().setAccessibleDescription(
                "This menu allows to open help"
        );

        //---------------help button parameters-------------
        helpItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
        helpItem.getAccessibleContext().setAccessibleDescription("This should open help");
        helpItem.addActionListener(e -> {
            System.out.println("Help opened");
        });
        helpMenu.add(helpItem);

        //---------------about button parameters-------------
        aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_DOWN_MASK));
        aboutItem.getAccessibleContext().setAccessibleDescription("This should open about");
        aboutItem.addActionListener(e -> {
            System.out.println("About opened");
        });
        helpMenu.add(aboutItem);


        //--------------Add menus to menu bar------------
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu Bar Test Frame");
        this.setPreferredSize(new Dimension(500, 500));
        this.setJMenuBar(menuBar);
        this.pack();
        this.setVisible(true);
    }
}
