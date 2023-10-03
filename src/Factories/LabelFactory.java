package Factories;

import java.awt.Color;
import javax.swing.JLabel;

public class LabelFactory extends JLabel {

  private JLabel _label;

  public LabelFactory(String label, int x, int y, int largura, int altura) {
    _label = new JLabel(label);
    _label.setForeground(Color.red);
    _label.setBounds(x, y, largura, altura);
  }

  public JLabel GetComponent() {
    return this._label;
  }
}
