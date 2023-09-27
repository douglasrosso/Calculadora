package Factories;

import javax.swing.JTextField;

public class TextFieldFactory extends JTextField {
    private JTextField _textfield;

    public TextFieldFactory(int x, int y, int width, int height) {
        _textfield = new JTextField();
        _textfield.setBackground(new java.awt.Color(245, 164, 164));
        _textfield.setBounds(x, y, width, height);
    }

    public JTextField GetComponent() {
        return this._textfield;
    }
}
