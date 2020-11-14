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

    JMenu options_submenu = new JMenu("Options");
    JMenuItem item_change_color, item_change_size;
    item_change_color = new JMenuItem("Change Color");
    item_change_size = new JMenuItem("Change Size");

    menu.add(item_new);
    menu.add(item_save);
    menu.add(item_saveas);

    options_submenu.add(item_change_color);
    options_submenu.add(item_change_size);
    menu.add(options_submenu);

    menu.add(item_exit);
    myMenuBar.add(menu);


    frame.setJMenuBar(myMenuBar);
    frame.setLayout(null);
    frame.setVisible(true);
  }

}
