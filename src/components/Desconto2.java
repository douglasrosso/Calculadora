package components;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Factories.ButtonBuilder;
import Factories.LabelTextFieldBuilder;
import utils.Calculos;

public class Desconto2 extends JPanel {
  private JPanel _painel;

  public Desconto2() {
    _painel = new JPanel();
    _painel.setBorder(BorderFactory.createTitledBorder("Valor era A e paguei B, qual foi o desconto%?"));
    _painel.setLayout(null);
    _painel.setBounds(5, 155, 300, 150);

    LabelTextFieldBuilder labelTextFieldBuilder = new LabelTextFieldBuilder("Valor original (a)", 25, 20);
    labelTextFieldBuilder.Build(_painel);

    LabelTextFieldBuilder labelTextField2Builder = new LabelTextFieldBuilder("Valor c/ desconto (b)", 25, 50);
    labelTextField2Builder.Build(_painel);

    LabelTextFieldBuilder labelTextField3Builder = new LabelTextFieldBuilder("% desconto", 25, 80);
    labelTextField3Builder.Build(_painel);

    AbstractAction action = new AbstractAction("Calcular") {

      @Override
      public void actionPerformed(ActionEvent e) {
        float resultado = Calculos.descontoPago(
            Float.parseFloat(labelTextFieldBuilder.GetTextField().getText().toString()),
            Float.parseFloat(labelTextField2Builder.GetTextField().getText().toString()));
        labelTextField3Builder.GetTextField().setText("" + resultado);
      }
    };

    ButtonBuilder buttonBuilder = new ButtonBuilder(
        "Calcular",
        145,
        115,
        action);

    buttonBuilder.Build(_painel);
  }

  public JPanel getPainel() {
    return this._painel;
  }
}
