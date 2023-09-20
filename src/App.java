import components.Pagina;

import javax.swing.JPanel;

import components.Desconto1;

public class App {
  public static void main(String[] args) throws Exception {
    Pagina pagina = new Pagina();

    JPanel painelDesconto = new Desconto1().getPainel();
    pagina.AddComponente(painelDesconto);
    pagina.Mostrar();
  }
}
