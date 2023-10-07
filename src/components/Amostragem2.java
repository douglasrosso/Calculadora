package components;

import Factories.ButtonBuilder;
import Factories.LabelTextFieldBuilder;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import utils.Calculos;

public class Amostragem2 extends JPanel {

  private JPanel _painel;

  public Amostragem2() {
    _painel = new JPanel();
    _painel.setBorder(
      BorderFactory.createTitledBorder(
        "Amostragem 2 - Quanto X representa de Y"
      )
    );
    _painel.setLayout(null);
    _painel.setBounds(955, 5, 300, 150);

    LabelTextFieldBuilder labelTextFieldBuilder = new LabelTextFieldBuilder(
      "Total (a)",
      25,
      20
    );
    labelTextFieldBuilder.Build(_painel);

    LabelTextFieldBuilder labelTextField2Builder = new LabelTextFieldBuilder(
      "Porcentagem (b)",
      25,
      50
    );
    labelTextField2Builder.Build(_painel);

    LabelTextFieldBuilder labelTextField3Builder = new LabelTextFieldBuilder(
      "Corresponde a %",
      25,
      80
    );
    labelTextField3Builder.Build(_painel);

    AbstractAction action = new AbstractAction("Calcular") {
      @Override
      public void actionPerformed(ActionEvent e) {
        float resultado = Calculos.Amostragem2Calc(
          Float.parseFloat(
            labelTextFieldBuilder.GetTextField().getText().toString()
          ),
          Float.parseFloat(
            labelTextField2Builder.GetTextField().getText().toString()
          )
        );
        labelTextField3Builder.GetTextField().setText("" + resultado);
      }
    };

    ButtonBuilder buttonBuilder = new ButtonBuilder(
      "Calcular",
      145,
      115,
      action
    );

    buttonBuilder.Build(_painel);
  }

  public JPanel getPainel() {
    return this._painel;
  }
}
