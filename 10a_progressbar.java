import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    // https://docs.oracle.com/javase/7/docs/api/javax/swing/JSlider.html

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);
    // I had to comment following line out to get the slider
    // frame.setLayout(null);

    progressBarHorizontalExample(frame);
    progressBarVerticalExample(frame);

    frame.setLayout(null);
    frame.setVisible(true);
  }

  public static void progressBarHorizontalExample(JFrame frame) {
    // JSlider mySlider = new JSlider(JSlider.HORIZONTAL);
    int min = 0;
    int max = 100;
    int current_value = 20;
    JProgressBar myProgressBar = new JProgressBar(0, 100);

    myProgressBar.setLocation(20, 20);
    myProgressBar.setSize(200, 60);

    myProgressBar.setValue(44);

    frame.add(myProgressBar);
  }

  public static void progressBarVerticalExample(JFrame frame) {
    // JSlider mySlider = new JSlider(JSlider.HORIZONTAL);
    int min = 0;
    int max = 100;
    int current_value = 20;
    JProgressBar myProgressBar = new JProgressBar(SwingConstants.VERTICAL, 0, 100);

    myProgressBar.setLocation(20, 220);
    myProgressBar.setSize(60, 200);

    myProgressBar.setValue(44);

    frame.add(myProgressBar);
  }

}
