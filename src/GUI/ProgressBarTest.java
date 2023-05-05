package GUI;

import javax.swing.*;
import java.awt.*;

public class ProgressBarTest {

    private JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);

    private JFrame progressBarFrame = new JFrame("Progress Bar Test");
    private JLabel celebrationLabel = new JLabel();
    private ImageIcon celebrateImage = new ImageIcon(
            "C:\\Users\\Programista\\IdeaProjects\\JavaTraining\\src\\GUI\\img\\celebration.png"
    );

    public ProgressBarTest(){

        //----------------progress bar params------------------
        progressBar.setBounds(40, 20, 400, 50);
        progressBar.setStringPainted(true);

        //----------------label params------------------------
        celebrationLabel.setBounds(100, 75, 300, 300);
        celebrationLabel.setVisible(false);
        celebrationLabel.setIcon(celebrateImage);
        celebrationLabel.setText("Congratulations!");
        celebrationLabel.setFont(new Font("Comic Sans", Font.PLAIN, 20 ));
        celebrationLabel.setHorizontalTextPosition(JLabel.CENTER);
        celebrationLabel.setVerticalTextPosition(JLabel.BOTTOM);
        celebrationLabel.setVerticalAlignment(JLabel.CENTER);
        celebrationLabel.setHorizontalAlignment(JLabel.CENTER);


        //---------------frame parameters---------------------
        progressBarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progressBarFrame.setSize(500, 500);
        progressBarFrame.setLayout(null);
        progressBarFrame.add(celebrationLabel);
        progressBarFrame.add(progressBar);
        progressBarFrame.setResizable(false);
        progressBarFrame.setVisible(true);

        if(fill()) {
            celebrationLabel.setVisible(true);
            progressBar.setString("Done! :)");
        }
    }

    //-------------fill the progress bar-----------
    public boolean fill(){
        while(progressBar.getValue() < 100){
            progressBar.setValue(progressBar.getValue() + 1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return false;
            }
        }
        return true;
    }

}
