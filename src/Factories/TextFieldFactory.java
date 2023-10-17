package Factories;

import javax.swing.JTextField;


public class TextFieldFactory extends JTextField {

  private JTextField _textField;

  public TextFieldFactory(int x, int y, int largura, int altura) {
    _textField = new JTextField();
    _textField.setBackground(new java.awt.Color(50, 100, 255));
    _textField.setBounds(x, y, largura, altura);
  }

  public JTextField GetComponent() {
    return this._textField;
  };

}

  
