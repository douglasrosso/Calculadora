package Factories;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class TextFieldFactory extends JTextField {

  private JTextField _textField;

  public TextFieldFactory(int x, int y, int largura, int altura) {
    _textField = new JTextField();
    _textField.setBackground(new java.awt.Color(50, 100, 255));
    _textField.setBounds(x, y, largura, altura);
    ((AbstractDocument) _textField.getDocument()).setDocumentFilter(
        new FiltroNumerico()
      );
  }

  public JTextField GetComponent() {
    return this._textField;
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
      int tamanho,
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
      super.replace(fb, offset, tamanho, texto, atributos);
    }
  }
}
