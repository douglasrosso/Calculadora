package components;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pagina extends JFrame {

  public Pagina() {
    setTitle("Calculadora");
    setResizable(false);
    setSize(1280, 720);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void AddComponente(JPanel component) {
    getContentPane().add(component);
  }

  public void Mostrar() {
    setVisible(true);
  }
}
