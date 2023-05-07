package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame implements KeyListener {

    private ImageIcon rocketImage;
    private JLabel rocket = new JLabel();
    private int positionX = 250;
    private int positionY = 250;

    KeyListenerDemo(){

        rocketImage = new ImageIcon(new ImageIcon(
                "C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\GUI\\img\\rocket.png")
                .getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));

        rocket.setIcon(rocketImage);
        rocket.setBounds(this.positionX, this.positionY, 25, 25);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        this.add(rocket);
        this.addKeyListener(this);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped - invoked when the key is typed. Uses keyChar, char output
        switch(e.getKeyChar()){
            case 'w':
                if (rocket.getY() > 0)
                    rocket.setLocation(rocket.getX(), rocket.getY()-10);
                else
                    rocket.setLocation(rocket.getX(), 0);
                break;
            case 'a':
                if (rocket.getX() > 0)
                    rocket.setLocation(rocket.getX()-10, rocket.getY());
                else
                    rocket.setLocation(0, rocket.getY());
                break;
            case 's':
                if(rocket.getY() < this.getHeight()-60) {
                    rocket.setLocation(rocket.getX(), rocket.getY() + 10);
                    System.out.println(rocket.getY());
                }
                else
                    rocket.setLocation(rocket.getX(), this.getHeight()-60);
                break;
            case 'd':
                if(rocket.getX() < this.getWidth() - 40)
                    rocket.setLocation(rocket.getX()+10, rocket.getY());
                else
                    rocket.setLocation(this.getWidth()-40, rocket.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed - invoked when a physical key is pressed down. Uses keyCode, int output
        if(e.getKeyCode() == KeyEvent.VK_UP)
            rocket.setLocation(rocket.getX(), rocket.getY()-10);

        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            rocket.setLocation(rocket.getX(), rocket.getY()+10);

        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            rocket.setLocation(rocket.getX()+10, rocket.getY());

        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            rocket.setLocation(rocket.getX()-10, rocket.getY());



        //rocket.setBounds(this.positionX, this.positionY, 25, 25);


    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased - called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
