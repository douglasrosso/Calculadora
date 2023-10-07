package Factories;

import javax.swing.JLabel;

public class LabelFactory extends JLabel {

  private JLabel _label;

  public LabelFactory(String titulo, int x, int y, int largura, int altura) {
    _label = new JLabel(titulo);
    _label.setBounds(x, y, largura, altura);
  }

  public JLabel GetComponent() {
    return this._label;
  }
}
