package utils;

public class Calculos {

  public static float Amostragem1Calc(
    float primeiroNumero,
    float segundoNumero
  ) {
    return (primeiroNumero * segundoNumero) / 100;
  }

  public static float Amostragem2Calc(
    float primeiroNumero,
    float segundoNumero
  ) {
    return (segundoNumero * 100) / primeiroNumero;
  }

  public static float Desconto1Calc(float primeiroNumero, float segundoNumero) {
    return primeiroNumero - (primeiroNumero * (segundoNumero / 100));
  }

  public static float OriginalCalc(float primeiroNumero, float segundoNumero) {
    return (primeiroNumero * 100 / (100 - segundoNumero));
  }

  public static float IncrementarCalc(
    float primeiroNumero,
    float segundoNumero
  ) {
    return primeiroNumero + (primeiroNumero * (segundoNumero / 100));
  }

  public static float DiferencaCalc(float primeiroNumero, float segundoNumero) {
    return ((segundoNumero - primeiroNumero) / primeiroNumero) * 100;
  }

  public static float RegraD3Calc(
    float primeiroNumero,
    float segundoNumero,
    float terceiroNumero
  ) {
    return ((terceiroNumero * segundoNumero) / primeiroNumero);
  }

  public static float Desconto2Calc(float primeiroNumero, float segundoNumero) {
    return ((primeiroNumero - segundoNumero) / primeiroNumero) * 100;
  }
}
