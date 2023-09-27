package utils;

public class Calculos {

      public static void main(String[] args) {

      }

      public static float aplicacaoDesconto(float a, float b) {
            return a - (a * (b / 100));
      }

      public static float aplicacaoAcrescimo(float a, float b) {
            return a + (a * (b / 100));
      }

      public static float xRepresentaY(float a, float b) {
            return (a * b) / 100;
      }

      public static float yRepresentaX(float a, float b) {
            return (a * 100) / b;
      }

      public static float descontoPago(float a, float b) {
            return ((a - b) / a) * 100;
      }

      public static float delta(float a, float b) {
            return ((a - b) / b) * 100;
      }

      public static float original(float a, float b) {
            return (a * 100 / (100 - b));
      }

      public static float regraDeTres(float a, float b, float c) {
            return ((c * b) / a);
      }



}