package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Senha {
  private static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
  private static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String numericos = "0123456789";
  private static final String caracteres = "!@#$%&*()_+-=[]|,./?><";

  public String Gerar(
    int tamanho,
    boolean minusculos,
    boolean maiusculos,
    boolean numeros,
    boolean simbolos
  ) {
    if (tamanho <= 0) {
      return "";
    }

    StringBuilder senha = new StringBuilder(tamanho);
    Random indiceAleatorio = new Random(System.nanoTime());

    List<String> listaCaracteres = new ArrayList<String>(4);
    if (simbolos) {
      listaCaracteres.add(caracteres);
    }
    if (minusculos) {
      listaCaracteres.add(lowercase);
    }
    if (numeros) {
      listaCaracteres.add(numericos);
    }
    if (maiusculos) {
      listaCaracteres.add(uppercase);
    }

    for (int i = 0; i < tamanho; i++) {
      String categoriaDeChar = listaCaracteres.get(
        indiceAleatorio.nextInt(listaCaracteres.size())
      );
      int posicao = indiceAleatorio.nextInt(categoriaDeChar.length());
      senha.append(categoriaDeChar.charAt(posicao));
    }
    return new String(senha);
  }
}
