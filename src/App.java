import components.Pagina;
import components.RegraD3;

import javax.swing.JPanel;

import components.Amostragem1;
import components.Amostragem2;
import components.Desconto1;
import components.Desconto2;
import components.Diferenca;
import components.GeradorSenha;
import components.Incrementar;
import components.Original;

public class App {
  public static void main(String[] args) throws Exception {
    Pagina pagina = new Pagina();

    JPanel painelDesconto = new Desconto1().getPainel();
    JPanel painelDesconto2 = new Desconto2().getPainel();
    JPanel painelIncrementar = new Incrementar().getPainel();
    JPanel painelAmostragem1 = new Amostragem1().getPainel();
    JPanel painelAmostragem2 = new Amostragem2().getPainel();
    JPanel painelDiferenca = new Diferenca().getPainel();
    JPanel painelOriginal = new Original().getPainel();

    // Deixar para depois
    JPanel painelRegraD3 = new RegraD3().getPainel();
    JPanel painelGeradorSenha = new GeradorSenha().getPainel();

    pagina.AddComponente(painelDesconto);
    pagina.AddComponente(painelDesconto2);
    pagina.AddComponente(painelIncrementar);
    pagina.AddComponente(painelAmostragem1);
    pagina.AddComponente(painelAmostragem2);
    pagina.AddComponente(painelDiferenca);
    pagina.AddComponente(painelOriginal);
    //pagina.AddComponente(painelGeradorSenha);
    //pagina.AddComponente(painelRegraD3);

    pagina.Mostrar();
  }
}
