import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    // 1. Create application frame
    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setVisible(true);

    // 2. Add a button with its title and set its position and size
    JToggleButton btn = new JToggleButton("Enabled");
    btn.setBounds(200, 200, 100, 50);

    // 3. Add function to handle click event
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
        if( btn.isSelected() == true) {
          btn.setText("Disabled");
        } else {
          btn.setText("Enabled");
        }
      }
    });

    // 4. Finally , add btn to Frame
    frame.add(btn);
  }
}
