package Factories;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class TextFieldFactory extends JTextField {

  private JTextField campoTexto;

  public TextFieldFactory(int x, int y, int largura, int altura) {
    campoTexto = new JTextField();
    campoTexto.setBackground(new java.awt.Color(245, 164, 164));
    campoTexto.setBounds(x, y, largura, altura);

    ((AbstractDocument) campoTexto.getDocument()).setDocumentFilter(
        new FiltroNumerico()
      );
  }

  public JTextField GetComponent() {
    return this.campoTexto;
  }

  private static class FiltroNumerico extends DocumentFilter {

    @Override
    public void insertString(
      DocumentFilter.FilterBypass fb,
      int offset,
      String texto,
      AttributeSet atributos
    ) throws BadLocationException {
      StringBuilder construtor = new StringBuilder(texto);
      for (int i = construtor.length() - 1; i >= 0; i--) {
        char c = construtor.charAt(i);
        if (!Character.isDigit(c)) {
          construtor.deleteCharAt(i);
        }
      }
      texto = construtor.toString();
      super.insertString(fb, offset, texto, atributos);
    }

    @Override
    public void replace(
      DocumentFilter.FilterBypass fb,
      int offset,
      int length,
      String texto,
      AttributeSet atributos
    ) throws BadLocationException {
      if (texto != null) {
        StringBuilder construtor = new StringBuilder(texto);
        for (int i = construtor.length() - 1; i >= 0; i--) {
          char c = construtor.charAt(i);
          if (!Character.isDigit(c)) {
            construtor.deleteCharAt(i);
          }
        }
        texto = construtor.toString();
      }
      super.replace(fb, offset, length, texto, atributos);
    }
  }
}
