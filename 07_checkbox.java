import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400, 500);
    frame.setLayout(null);

    JLabel label = new JLabel("Select days");
    label.setBounds(100, 20, 200, 20);

    JLabel label_2 = new JLabel("");
    label_2.setBounds(100, 200, 200, 20);

    // 4 radio button options
    JCheckBox option_1, option_2, option_3, option_4, option_5;

    option_1 = new JCheckBox("Monday");
    option_1.setBounds(100, 50, 200, 30);
    option_2 = new JCheckBox("Tuesday");
    option_2.setBounds(100, 80, 200, 30);
    option_3 = new JCheckBox("Wednesday");
    option_3.setBounds(100, 110, 200, 30);
    option_4 = new JCheckBox("Thursday");
    option_4.setBounds(100, 140, 200, 30);
    option_5 = new JCheckBox("Friday");
    option_5.setBounds(100, 170, 200, 30);

    // Add all the components to application frame
    frame.add(label);
    frame.add(option_1);
    frame.add(option_2);
    frame.add(option_3);
    frame.add(option_4);
    frame.add(option_5);
    frame.add(label_2);

    frame.setVisible(true);
  }
}
