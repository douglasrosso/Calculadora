package components;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Desconto1 extends JPanel {
  private JPanel _painel;

  public Desconto1() {
    JPanel painel = new JPanel();
    painel.setBorder(BorderFactory.createTitledBorder("Aplicar desconto em % para o valor"));
    painel.setLayout(null);
    painel.setBounds(5, 5, 1253, 660);
    _painel = painel;

  }

  public JPanel getPainel() {
    return this._painel;
  }
}
