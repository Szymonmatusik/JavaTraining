package GUI;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    MyJPanel(Color backgroundColor, int x, int y, int width, int height){
        this.setBackground(backgroundColor);
        this.setBounds(x, y, width, height);

    }

}
