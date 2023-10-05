package Factories;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBuilder extends JButton {

  private JButton _button;

  public ButtonBuilder(String titulo, int x, int y, AbstractAction acao) {
    _button = new JButton(acao);

    _button.setBounds(x, y, 100, 25);
  }

  public void Build(JPanel panel) {
    panel.add(_button);
  }
}
