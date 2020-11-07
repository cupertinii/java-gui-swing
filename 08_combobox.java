import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400, 500);
    frame.setLayout(null);

    JLabel label = new JLabel("Select a weekday");
    label.setBounds(100, 20, 200, 20);

    // Create array with all the options
    String days[] = { "Monday", "Teusday", "Wednesday", "Thursday", "Friday" };

    // Pass the array to ComboBox constructor
    JComboBox cmbDays = new JComboBox(days);
    cmbDays.setBounds(100, 50, 200, 20);

    // This is how I can set the default entry
    cmbDays.setSelectedItem( "Friday" );
    System.out.println("Currently selected item is " + cmbDays.getSelectedIndex());

    // Adding action listener
    cmbDays.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        String message = "Selected : " + cmbDays.getItemAt( cmbDays.getSelectedIndex() );
        System.out.println(message);
      }
    });

    // Add all the components to application frame
    frame.add(label);
    frame.add(cmbDays);

    frame.setVisible(true);
  }
}
