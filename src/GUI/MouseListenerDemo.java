package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame implements MouseListener {

    private JLabel emoji1 = new JLabel();
    private JLabel emoji2 = new JLabel();
    private JLabel emoji3 = new JLabel();
    private JLabel emoji4 = new JLabel();
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private ImageIcon icon4;
    private int mouseClicksCount = 1;

    MouseListenerDemo(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        icon1 = new ImageIcon(new ImageIcon(
                "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\emoji1.png")
                .getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));
        icon2 = new ImageIcon(new ImageIcon(
                "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\emoji2.png")
                .getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));
        icon3 = new ImageIcon(new ImageIcon(
                "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\emoji3.png")
                .getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));
        icon4 = new ImageIcon(new ImageIcon(
                "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\emoji4.png")
                .getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));

        emoji1.setIcon(icon1);
        emoji1.setBounds(0 ,0, this.getWidth(), this.getHeight());
        emoji1.setVisible(true);


        this.add(emoji1);
        emoji1.addMouseListener(this);
        this.setResizable(false);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseClicksCount++;
        if (mouseClicksCount == 5)
            mouseClicksCount=1;

        switch (mouseClicksCount) {
            case 1 -> {
                emoji1.setIcon(icon1);
            }
            case 2 -> {
                emoji1.setIcon(icon2);
            }
            case 3 -> {
                emoji1.setIcon(icon3);
            }
            case 4 -> {
                emoji1.setIcon(icon4);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
