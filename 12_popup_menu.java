import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);

    // Popup Menu
    JPopupMenu myPopupMenu = new JPopupMenu("File");

    // Standard way to add Menu Items
    JMenuItem item_new, item_save, item_saveas, item_exit;
    item_new = new JMenuItem("New");
    item_save = new JMenuItem("Save");
    item_saveas = new JMenuItem("Save As");
    item_exit = new JMenuItem("Exit");

    myPopupMenu.add(item_new);
    myPopupMenu.add(item_save);
    myPopupMenu.add(item_saveas);
    myPopupMenu.add(item_exit);

    // adding a mouse listner to show popup menu
    frame.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        System.out.println("Showing Popup Menu in frame at (" + e.getX() + ", " + e.getY() + ")" );
        myPopupMenu.show(frame , e.getX(), e.getY());
      }
    });

    frame.add(myPopupMenu);
    frame.setLayout(null);
    frame.setVisible(true);
  }

}
