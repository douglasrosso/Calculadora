package utils;

public class Calculos {
  public static float xRepresentaY(float primeiroNumero, float segundoNumero) {
    return (primeiroNumero * segundoNumero) / 100;
  }

  public static float yRepresentaX(float primeiroNumero, float segundoNumero) {
    return (primeiroNumero * 100) / segundoNumero;
  }

  public static float aplicaDesconto(
    float primeiroNumero,
    float segundoNumero
  ) {
    return primeiroNumero - (primeiroNumero * (segundoNumero / 100));
  }

  public static float original(float primeiroNumero, float segundoNumero) {
    return (primeiroNumero * 100 / (100 - segundoNumero));
  }

  public static float aplicaAcrescimo(
    float primeiroNumero,
    float segundoNumero
  ) {
    return primeiroNumero + (primeiroNumero * (segundoNumero / 100));
  }

  public static float variacaoDelta(float primeiroNumero, float segundoNumero) {
    return ((primeiroNumero - segundoNumero) / segundoNumero) * 100;
  }

  public static float regraD3(
    float primeiroNumero,
    float segundoNumero,
    float c
  ) {
    return ((c * segundoNumero) / primeiroNumero);
  }

  public static float descontoPago(float primeiroNumero, float segundoNumero) {
    return ((primeiroNumero - segundoNumero) / primeiroNumero) * 100;
  }
}
