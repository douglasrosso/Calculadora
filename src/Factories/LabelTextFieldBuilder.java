package Factories;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelTextFieldBuilder {
    private JLabel _label;
    private JTextField _textfield;

    public LabelTextFieldBuilder(String label, int x, int y) {
        LabelFactory labelComponent = new LabelFactory(label, x, y, 120, 25);
        _label = labelComponent.GetComponent();

        TextFieldFactory textfield = new TextFieldFactory(x + 120, y, 100, 25);
        _textfield = textfield.GetComponent();
    }

    public JTextField GetTextField() {
        return this._textfield;
    }

    public void Build(JPanel panel) {
        panel.add(_label);
        panel.add(_textfield);
    }
}
