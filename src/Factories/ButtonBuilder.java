package Factories;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class ButtonBuilder extends JButton {

  private JButton _button;

  public ButtonBuilder(String titulo, int x, int y, AbstractAction acao) {
    _button = new JButton(acao);
    _button.setText(titulo); 
    _button.setForeground(Color.white);
    _button.setBackground(new Color(50, 100, 255));
    _button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    _button.setBounds(x, y, 100, 25);
  }

  public void Build(JPanel panel) {
    panel.add(_button);
  }
}
