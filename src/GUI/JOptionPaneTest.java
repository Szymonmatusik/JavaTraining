package GUI;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneTest {

    JLabel warningLabel;

    JOptionPaneTest(){

        ImageIcon warningIcon = new ImageIcon(new ImageIcon("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\warning.png")
                                .getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        warningLabel = new JLabel(warningIcon);
        warningLabel.setBounds(0,0, 10, 10);

       /* JOptionPane.showMessageDialog(warningLabel, "Error!", "test", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(warningLabel, "Error!", "test", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(warningLabel, "Error!", "test", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(warningLabel, "Error!", "test", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(warningLabel, "Error!", "test", JOptionPane.PLAIN_MESSAGE);
        */

        int option = JOptionPane.showConfirmDialog(null, "Confirm dialog","ConfirmDialog", JOptionPane.YES_NO_CANCEL_OPTION);

        if (option==0){
            System.out.println("Yes");
        }
        else if (option==1){
            System.out.println("No");
        }
        else if (option==2){
            System.out.println("Cancel");
        }

        String name = JOptionPane.showInputDialog("What is your name?");
        String[] responses = {"No, you're awesome", "thank you", "blush"};

        JOptionPane.showOptionDialog(
                null,
                "Hello, what is your name?", "This is title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.ERROR_MESSAGE,
                warningIcon,
                responses,
                0);
    }
}
