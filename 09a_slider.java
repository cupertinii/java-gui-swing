import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    // https://docs.oracle.com/javase/7/docs/api/javax/swing/JSlider.html

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);
    // I had to comment following line out to get the slider
    // frame.setLayout(null);

    horizontalSlider(frame);
    verticalSlider(frame);

    frame.setLayout(null);
    frame.setVisible(true);
  }

  public static void horizontalSlider(JFrame frame) {
    // JSlider mySlider = new JSlider(JSlider.HORIZONTAL);
    int min = 0;
    int max = 100;
    int current_value = 20;
    JSlider mySlider = new JSlider(JSlider.HORIZONTAL, min, max, current_value);

    mySlider.setLocation(20, 20);
    mySlider.setSize(200, 60);

    mySlider.setFocusable(true);
    mySlider.setSnapToTicks(true);
    mySlider.setPaintTrack(true);
    mySlider.setPaintTicks(true);
    mySlider.setPaintLabels(true);

    mySlider.setMinorTickSpacing(5);
    mySlider.setMajorTickSpacing(25);

    frame.add(mySlider);
  }

  public static void verticalSlider(JFrame frame) {
    // JSlider mySlider = new JSlider(JSlider.HORIZONTAL);
    int min = 0;
    int max = 100;
    int current_value = 20;
    JSlider mySlider = new JSlider(JSlider.VERTICAL, min, max, current_value);

    mySlider.setLocation(20, 100);
    mySlider.setSize(60, 200);

    mySlider.setFocusable(true);
    mySlider.setSnapToTicks(true);
    mySlider.setPaintTrack(true);
    mySlider.setPaintTicks(true);
    mySlider.setPaintLabels(true);

    mySlider.setMinorTickSpacing(1);
    mySlider.setMajorTickSpacing(10);

    frame.add(mySlider);
  }
}
