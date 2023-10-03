package components;

import Factories.ButtonBuilder;
import Factories.LabelTextFieldBuilder;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import utils.Calculos;

public class RegraD3 extends JPanel {

  private JPanel _painel;

  public RegraD3() {
    // painelregraD3 = new JPanel();
    // painelregraD3.setLayout(null);
    // painelregraD3.setBorder(BorderFactory.createTitledBorder("Regra de
    // Três"));
    // painelregraD3.setBounds(400, 330, 300, 150);

    // regra1 = new JLabel("a:");
    // regra1.setForeground(Color.red);
    // regra1.setBounds(10, 20, 20, 25);
    // painelregraD3.add(regra1);

    // txfRegra1 = new JTextField();
    // txfRegra1.setBackground(new java.awt.Color(245, 164, 164));
    // txfRegra1.setBounds(30, 20, 100, 25);
    // painelregraD3.add(txfRegra1);

    // regra2 = new JLabel("r1:");
    // regra2.setForeground(new java.awt.Color(168, 163, 9));
    // regra2.setBounds(160, 20, 20, 25);
    // painelregraD3.add(regra2);

    // txfRegra2 = new JTextField();
    // txfRegra2.setBackground(new java.awt.Color(252, 246, 146));
    // txfRegra2.setBounds(180, 20, 100, 25);
    // painelregraD3.add(txfRegra2);

    // regra5 = new JLabel("=");
    // regra5.setBounds(140, 20, 20, 25);
    // painelregraD3.add(regra5);

    // regra3 = new JLabel("b:");
    // regra3.setForeground(Color.blue);
    // regra3.setBounds(10, 45, 20, 25);
    // painelregraD3.add(regra3);

    // txfRegra3 = new JTextField();
    // txfRegra3.setBackground(new java.awt.Color(157, 227, 245));
    // txfRegra3.setBounds(30, 45, 100, 25);
    // painelregraD3.add(txfRegra3);

    // regra4 = new JLabel("r2:");

    // regra4.setBounds(160, 45, 20, 25);
    // painelregraD3.add(regra4);

    // txfRegra4 = new JTextField();
    // txfRegra4.setBackground(new java.awt.Color(134, 235, 154));
    // txfRegra4.setBounds(180, 45, 100, 25);
    // painelregraD3.add(txfRegra4);

    // regra6 = new JLabel("=");
    // regra6.setBounds(140, 45, 20, 25);
    // painelregraD3.add(regra6);

    // btnCalcular = new JButton(new AbstractAction("Calcular") {

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // float resultado =
    // calculos.regraD3(Float.parseFloat(txfRegra1.getText().toString()),
    // Float.parseFloat(txfRegra2.getText().toString()),
    // Float.parseFloat(txfRegra3.getText().toString()));
    // txfRegra4.setText("" + resultado);

    // }
    // });

    // btnCalcular.setBounds(100, 95, 100, 25);
    // painelregraD3.add(btnCalcular);

    // getContentPane().add(painelregraD3);
    _painel = new JPanel();
    _painel.setBorder(BorderFactory.createTitledBorder("Regra de três"));
    _painel.setLayout(null);
    _painel.setBounds(5, 155, 300, 150);

    LabelTextFieldBuilder labelTextFieldBuilder = new LabelTextFieldBuilder(
      "Valor original (a)",
      25,
      20
    );
    labelTextFieldBuilder.Build(_painel);

    LabelTextFieldBuilder labelTextField2Builder = new LabelTextFieldBuilder(
      "Valor c/ desconto (b)",
      25,
      50
    );
    labelTextField2Builder.Build(_painel);

    LabelTextFieldBuilder labelTextField3Builder = new LabelTextFieldBuilder(
      "% desconto",
      25,
      80
    );
    labelTextField3Builder.Build(_painel);

    AbstractAction action = new AbstractAction("Calcular") {
      @Override
      public void actionPerformed(ActionEvent e) {
        float resultado = Calculos.descontoPago(
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
