package Factories;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelTextFieldBuilder {

  private JLabel _label;
  private JTextField _textfield;

  public LabelTextFieldBuilder(String titulo, int x, int y) {
    LabelFactory labelComponent = new LabelFactory(titulo, x, y, 120, 25);
    _label = labelComponent.GetComponent();
    _label.setForeground(new java.awt.Color(50, 100, 255));

    TextFieldFactory textfield = new TextFieldFactory(x + 120, y, 100, 25);
    _textfield = textfield.GetComponent();
    _textfield.setForeground(Color.white);
  }

  public JTextField GetTextField() {
    return this._textfield;
  }

  public void Build(JPanel panel) {
    panel.add(_label);
    panel.add(_textfield);
  }
}
