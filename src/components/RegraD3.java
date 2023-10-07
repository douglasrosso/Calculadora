package components;

import Factories.ButtonBuilder;
import Factories.LabelTextFieldBuilder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Calculos;

public class RegraD3 extends JPanel {

  private JPanel _painel;
  private JLabel _regra1;
  private JTextField _txfRegra1;
  private JLabel _regra2;
  private JTextField _txfRegra2;
  private JLabel _regra3;
  private JTextField _txfRegra3;
  private JLabel _regra4;
  private JTextField _txfRegra4;
  private JLabel _regra5;
  private JLabel _regra6;
  private JButton _btnCalcular;

  public RegraD3() {
    _painel = new JPanel();
    _painel.setBorder(BorderFactory.createTitledBorder("Regra de três"));
    _painel.setLayout(null);
    _painel.setBounds(5, 305, 350, 150);

    _regra1 = new JLabel("a:");
    _regra1.setForeground(Color.red);
    _regra1.setBounds(10, 20, 20, 25);
    _painel.add(_regra1);

    _txfRegra1 = new JTextField();
    _txfRegra1.setBackground(new java.awt.Color(245, 164, 164));
    _txfRegra1.setBounds(30, 20, 100, 25);
    _painel.add(_txfRegra1);

    _regra2 = new JLabel("r1:");
    _regra2.setForeground(new java.awt.Color(168, 163, 9));
    _regra2.setBounds(160, 20, 20, 25);
    _painel.add(_regra2);

    _txfRegra2 = new JTextField();
    _txfRegra2.setBackground(new java.awt.Color(252, 246, 146));
    _txfRegra2.setBounds(180, 20, 100, 25);
    _painel.add(_txfRegra2);

    _regra5 = new JLabel("=");
    _regra5.setBounds(140, 20, 20, 25);
    _painel.add(_regra5);

    _regra3 = new JLabel("b:");
    _regra3.setForeground(Color.blue);
    _regra3.setBounds(10, 45, 20, 25);
    _painel.add(_regra3);

    _txfRegra3 = new JTextField();
    _txfRegra3.setBackground(new java.awt.Color(157, 227, 245));
    _txfRegra3.setBounds(30, 45, 100, 25);
    _painel.add(_txfRegra3);

    _regra4 = new JLabel("r2:");

    _regra4.setBounds(160, 45, 20, 25);
    _painel.add(_regra4);

    _txfRegra4 = new JTextField();
    _txfRegra4.setBackground(new java.awt.Color(134, 235, 154));
    _txfRegra4.setBounds(180, 45, 100, 25);
    _painel.add(_txfRegra4);

    _regra6 = new JLabel("=");
    _regra6.setBounds(140, 45, 20, 25);
    _painel.add(_regra6);

    _btnCalcular = new JButton(new AbstractAction("Calcular") {
      Calculos calculos = new Calculos();

      @Override
      public void actionPerformed(ActionEvent e) {
        float resultado = calculos.RegraD3Calc(Float.parseFloat(_txfRegra1.getText().toString()),
            Float.parseFloat(_txfRegra2.getText().toString()),
            Float.parseFloat(_txfRegra3.getText().toString()));
        _txfRegra4.setText("" + resultado);

      }
    });

    _btnCalcular.setBounds(100, 95, 100, 25);
    _painel.add(_btnCalcular);

  }

  public JPanel getPainel() {
    return this._painel;
  }
}
