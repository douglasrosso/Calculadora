package factories;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBuilder extends JButton {

  private JButton _button;

  public ButtonBuilder(String titulo, int x, int y, AbstractAction action) {
    _button = new JButton(action);

    _button.setBounds(x, y, 100, 25);
  }

  public void Build(JPanel panel) {
    panel.add(_button);
  }
}
