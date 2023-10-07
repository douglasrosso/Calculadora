package components;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import utils.Senha;

public class GeradorSenha extends JPanel {

  private JPanel _painel;
  private JCheckBox _geradorMaiusculo;
  private JCheckBox _geradorMinusculo;
  private JCheckBox _geradorNumero;
  private JCheckBox _geradorSimbolo;
  private JLabel _tamanhoGerador;
  private JTextField _txfGerador;
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
    _painel.setBounds(305, 305, 297, 210);

    _geradorMaiusculo = new JCheckBox("Maiúsculas");
    _geradorMaiusculo.setBounds(10, 20, 90, 25);
    _painel.add(_geradorMaiusculo);

    _geradorMinusculo = new JCheckBox("Minúculas");
    _geradorMinusculo.setBounds(120, 20, 90, 25);
    _painel.add(_geradorMinusculo);

    _geradorNumero = new JCheckBox("Números");
    _geradorNumero.setBounds(10, 45, 90, 25);
    _painel.add(_geradorNumero);

    _geradorSimbolo = new JCheckBox("Símbolos");
    _geradorSimbolo.setBounds(120, 45, 90, 25);
    _painel.add(_geradorSimbolo);

    _tamanhoGerador = new JLabel("Tamanho");
    _tamanhoGerador.setBounds(15, 70, 200, 25);
    _painel.add(_tamanhoGerador);

    _txfGerador = new JTextField();
    _txfGerador.setBounds(20, 100, 260, 25);
    _painel.add(_txfGerador);

    _txfResultadoGerador = new JTextField();
    _txfResultadoGerador.setBackground(new java.awt.Color(134, 235, 154));
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

        String resultado = senha.Gerar(Integer.parseInt(_txfGerador.getText()),
            _minusculas, _maiusculas, _numeros,
            _simbolos);
        _txfResultadoGerador.setText("" + resultado);

      }
    });
    _btnCalcular.setBounds(100, 125, 90, 25);
    _painel.add(_btnCalcular);
  }

  public JPanel getPainel() {
    return this._painel;
  }
}
