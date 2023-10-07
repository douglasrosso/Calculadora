package components;

import Factories.ButtonBuilder;
import Factories.LabelTextFieldBuilder;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import utils.Calculos;

public class GeradorSenha extends JPanel {

  private JPanel _painel;

  public GeradorSenha() {
    // painelGeradorDeSenha = new JPanel();
    // painelGeradorDeSenha.setLayout(null);
    // painelGeradorDeSenha.setBorder(BorderFactory.createTitledBorder("Gerador de
    // senhas"));
    // painelGeradorDeSenha.setBounds(700, 330, 350, 200);

    // gerador1 = new JCheckBox("Maiúsculas");
    // gerador1.setBounds(10, 20, 90, 25);
    // painelGeradorDeSenha.add(gerador1);

    // gerador2 = new JCheckBox("Minúculas");
    // gerador2.setBounds(120, 20, 90, 25);
    // painelGeradorDeSenha.add(gerador2);

    // gerador3 = new JCheckBox("Números");
    // gerador3.setBounds(10, 45, 90, 25);
    // painelGeradorDeSenha.add(gerador3);

    // gerador4 = new JCheckBox("Símbolos");
    // gerador4.setBounds(120, 45, 90, 25);
    // painelGeradorDeSenha.add(gerador4);

    // gerador5 = new JLabel("Tamanho");
    // gerador5.setBounds(15, 70, 200, 25);
    // painelGeradorDeSenha.add(gerador5);

    // txfGerador = new JTextField();
    // txfGerador.setBounds(20, 100, 260, 25);
    // painelGeradorDeSenha.add(txfGerador);

    // txfResultadoGerador = new JTextField();
    // txfResultadoGerador.setBackground(new java.awt.Color(134, 235, 154));
    // txfResultadoGerador.setBounds(20, 170, 260, 25);
    // painelGeradorDeSenha.add(txfResultadoGerador);

    // btnCalcular = new JButton(new AbstractAction("Gerar") {

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // if (gerador1.isSelected()) {
    // maiusculas = true;
    // } else {
    // maiusculas = false;
    // }
    // if (gerador2.isSelected()) {
    // minusculas = true;
    // } else {
    // minusculas = false;
    // }
    // if (gerador3.isSelected()) {
    // numeros = true;
    // } else {
    // numeros = false;
    // }
    // if (gerador4.isSelected()) {
    // simbolos = true;
    // } else {
    // simbolos = false;
    // }

    // senha senha = new senha();

    // String resultado = senha.generate(Integer.parseInt(txfGerador.getText()),
    // minusculas, maiusculas, numeros,
    // simbolos);
    // txfResultadoGerador.setText("" + resultado);

    // }
    // });
    // btnCalcular.setBounds(100, 125, 90, 25);
    // painelGeradorDeSenha.add(btnCalcular);

    // getContentPane().add(painelGeradorDeSenha);

    _painel = new JPanel();
    _painel.setBorder(
      BorderFactory.createTitledBorder(
        "Valor era A e paguei B, qual foi o desconto%?"
      )
    );
    _painel.setLayout(null);
    _painel.setBounds(5, 155, 350, 150);

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
        float resultado = Calculos.Desconto2Calc(
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
