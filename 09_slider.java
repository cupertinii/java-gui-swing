import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400, 500);
    // I had to comment following line out to get the slider
    // frame.setLayout(null);

    JSlider mySlider = new JSlider(JSlider.HORIZONTAL);

    // Add all the components to application frame
    frame.add(mySlider);

    frame.setVisible(true);
  }
}
