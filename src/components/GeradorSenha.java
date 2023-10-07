package components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import utils.Senha;

public class GeradorSenha extends JPanel {
  private JPanel _painel;
  private JCheckBox _geradorMaiusculo;
  private JCheckBox _geradorMinusculo;
  private JCheckBox _geradorNumero;
  private JCheckBox _geradorSimbolo;
  private JLabel _lblTamanho;
  private JSpinner _txfTamanho;
  private JTextField _txfResultadoGerador;
  private JButton _btnCalcular;
  private boolean _maiusculas;
  private boolean _minusculas;
  private boolean _numeros;
  private boolean _simbolos;

  public GeradorSenha() {
    _painel = new JPanel();
    _painel.setBorder(
        BorderFactory.createTitledBorder(
            "Gerador de senha"));
    _painel.setLayout(null);
    _painel.setBounds(955, 155, 300, 210);
    _painel.setBounds(5, 305, 300, 210);

    _geradorMaiusculo = new JCheckBox("Maiúsculas");
    _geradorMaiusculo.setForeground(new java.awt.Color(50, 100, 255));
    _geradorMaiusculo.setBounds(10, 20, 90, 25);
    _painel.add(_geradorMaiusculo);

    _geradorMinusculo = new JCheckBox("Minúculas");
    _geradorMinusculo.setForeground(new java.awt.Color(50, 100, 255));
    _geradorMinusculo.setBounds(120, 20, 90, 25);
    _painel.add(_geradorMinusculo);

    _geradorNumero = new JCheckBox("Números");
    _geradorNumero.setForeground(new java.awt.Color(50, 100, 255));
    _geradorNumero.setBounds(10, 45, 90, 25);
    _painel.add(_geradorNumero);

    _geradorSimbolo = new JCheckBox("Símbolos");
    _geradorSimbolo.setForeground(new java.awt.Color(50, 100, 255));
    _geradorSimbolo.setBounds(120, 45, 90, 25);
    _painel.add(_geradorSimbolo);

    _lblTamanho = new JLabel("Tamanho");
    _lblTamanho.setForeground(new java.awt.Color(50, 100, 255));
    _lblTamanho.setBounds(30, 100, 200, 25);
    _painel.add(_lblTamanho);

    _txfTamanho = new JSpinner();
    _txfTamanho.setBounds(100, 100, 90, 25);
    _txfTamanho.setForeground(Color.white);
    _txfTamanho.setBackground(new Color(50, 100, 255));
    _painel.add(_txfTamanho);

    _txfResultadoGerador = new JTextField();
    _txfResultadoGerador.setForeground(Color.white);
    _txfResultadoGerador.setBackground(new Color(50, 100, 255));
    _txfResultadoGerador.setBounds(20, 170, 260, 25);
    _painel.add(_txfResultadoGerador);

    _btnCalcular = new JButton(new AbstractAction("Gerar") {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (_geradorMaiusculo.isSelected()) {
          _maiusculas = true;
        } else {
          _maiusculas = false;
        }
        if (_geradorMinusculo.isSelected()) {
          _minusculas = true;
        } else {
          _minusculas = false;
        }
        if (_geradorNumero.isSelected()) {
          _numeros = true;
        } else {
          _numeros = false;
        }
        if (_geradorSimbolo.isSelected()) {
          _simbolos = true;
        } else {
          _simbolos = false;
        }

        Senha senha = new Senha();

        String resultado = senha.Gerar((Integer) _txfTamanho.getValue(),
            _minusculas, _maiusculas, _numeros,
            _simbolos);
        _txfResultadoGerador.setText("" + resultado);

      }
    });
    _btnCalcular.setForeground(Color.white);
    _btnCalcular.setBackground(new Color(50, 100, 255));
    _btnCalcular.setBounds(100, 135, 90, 25);
    _painel.add(_btnCalcular);
  }

  public JPanel getPainel() {
    return this._painel;
  }
}
