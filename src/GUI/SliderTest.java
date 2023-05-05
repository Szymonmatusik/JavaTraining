package GUI;

import javax.swing.*;
import java.awt.*;

public class SliderTest extends JFrame {

    //JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track

    private JFrame sliderFrame = new JFrame("Slider Demo Test");
    private JSlider temperatureSlider = new JSlider();
    private JLabel temperatureLabel = new JLabel("Current temperature: " + this.temperatureSlider.getValue() + " °C");
    private final int MAX_TEMP = 100;
    private final int MIN_TEMP = 0;
    SliderTest(){


        //------------slider parameters---------------
        temperatureSlider.setBounds(175, 15, 60, 200);
        temperatureSlider.setMinimum(MIN_TEMP);
        temperatureSlider.setMaximum(MAX_TEMP);
        temperatureSlider.setOrientation(JSlider.VERTICAL);
        temperatureSlider.setMajorTickSpacing(25);
        temperatureSlider.setMinorTickSpacing(10);
        temperatureSlider.setPaintTicks(true);
        temperatureSlider.setPaintTrack(true);
        temperatureSlider.setPaintLabels(true);
        temperatureSlider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        temperatureSlider.addChangeListener(e -> {
            temperatureLabel.setText("Current temperature: " + temperatureSlider.getValue() + " °C");
        });


        //-----------temperature label parameters---------
        temperatureLabel.setBounds(75, 240, 200, 50);
        temperatureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        temperatureLabel.setVerticalAlignment(SwingConstants.NORTH);
        temperatureLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        temperatureLabel.setVerticalTextPosition(SwingConstants.NORTH);




        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sliderFrame.setSize(400,400);
        sliderFrame.setLayout(null);
        sliderFrame.add(temperatureSlider);
        sliderFrame.add(temperatureLabel);
        sliderFrame.setResizable(false);
        sliderFrame.setVisible(true);
    }
}
