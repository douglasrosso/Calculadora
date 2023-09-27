package components;

import factories.ButtonBuilder;
import factories.LabelTextFieldBuilder;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import utils.Calculos;

public class Diferenca extends JPanel {

  private JPanel _painel;

  public Diferenca() {
    _painel = new JPanel();
    _painel.setBorder(
      BorderFactory.createTitledBorder(
        "Variação Delta (%) - diferença % entre valores"
      )
    );
    _painel.setLayout(null);
    _painel.setBounds(305, 155, 300, 150);

    LabelTextFieldBuilder labelTextFieldBuilder = new LabelTextFieldBuilder(
      "Valor inicial (a)",
      25,
      20
    );
    labelTextFieldBuilder.Build(_painel);

    LabelTextFieldBuilder labelTextField2Builder = new LabelTextFieldBuilder(
      "Valor final (b)",
      25,
      50
    );
    labelTextField2Builder.Build(_painel);

    LabelTextFieldBuilder labelTextField3Builder = new LabelTextFieldBuilder(
      "Diferença %",
      25,
      80
    );
    labelTextField3Builder.Build(_painel);

    AbstractAction action = new AbstractAction("Calcular") {
      @Override
      public void actionPerformed(ActionEvent e) {
        float resultado = Calculos.delta(
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
