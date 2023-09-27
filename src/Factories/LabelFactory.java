package Factories;

import javax.swing.JLabel;
import java.awt.Color;

public class LabelFactory extends JLabel {
    private JLabel _label;

    public LabelFactory(String text, int x, int y, int width, int height) {
        _label = new JLabel(text);
        _label.setForeground(Color.red);
        _label.setBounds(x, y, width, height);
    }

    public JLabel GetComponent() {
        return this._label;
    }
}
