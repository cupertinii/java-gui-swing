import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    // https://docs.oracle.com/javase/7/docs/api/javax/swing/JSlider.html

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);
    // I had to comment following line out to get the slider
    // frame.setLayout(null);

    frame.setLayout(null);
    frame.setVisible(true);

    progressBarHorizontalExample(frame);
  }

  public static void progressBarHorizontalExample(JFrame frame) {
    // JSlider mySlider = new JSlider(JSlider.HORIZONTAL);
    int min = 0;
    int max = 100;
    int current_value = 0;
    JProgressBar myProgressBar = new JProgressBar(0, 100);

    myProgressBar.setLocation(20, 20);
    myProgressBar.setSize(200, 60);

    myProgressBar.setValue(44);

    frame.add(myProgressBar);

    // Call the function to increment the progress bar...
    startProgress(myProgressBar);
  }

  public static void startProgress(JProgressBar myProgressBar) {
    int i = 0;
    while (i <= 100) {
      // Set the Progress bar value
      myProgressBar.setValue(i + 10);

      // Wait for a half a second
      Wait(500);
      // Increment the count by 10. This will increase the progress bar by 10
      i += 10;
    }
  }

  public static void Wait(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    }
    catch(InterruptedException ex) {
      System.out.println("Error"+ ex);
    }
  }

}
