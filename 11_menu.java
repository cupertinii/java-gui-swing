import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500, 500);

    // Menu Bar contains Menu contains MenuItem

    JMenuBar myMenuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem item_new, item_save, item_saveas, item_exit;

    item_new = new JMenuItem("New");
    item_save = new JMenuItem("Save");
    item_saveas = new JMenuItem("Save As");
    item_exit = new JMenuItem("Exit");

    menu.add(item_new);
    menu.add(item_save);
    menu.add(item_saveas);
    menu.add(item_exit);

    myMenuBar.add(menu);

    frame.setJMenuBar(myMenuBar);
    frame.setLayout(null);
    frame.setVisible(true);
  }

}
