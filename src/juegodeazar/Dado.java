package juegodeazar;

import java.util.Random;

/**
 *
 * @author JonathanLizama
 */
public class Dado {

      private int caraSuperiorDado1;
      private int caraSuperiorDado2;
      private int sumaCaras;
      private String resultado;

      public Dado() {
      }

      public Dado(int caraSuperior1, int caraSuperior2, int sumaCaras, String resultado) {
            this.caraSuperiorDado1 = caraSuperior1;
            this.caraSuperiorDado2 = caraSuperior2;
            this.sumaCaras = sumaCaras;
            this.resultado = resultado;
      }

      public int lanzarDado() {
            Random azar = new Random();
            return azar.nextInt(6) + 1;
      }

      @Override
      public String toString() {
            return "Lanzamiento 1: " + this.caraSuperiorDado1 + "\n"
                    + "Lanzamiento 2: " + this.caraSuperiorDado2 + "\n"
                    + "Suma: " + this.sumaCaras + "\n"
                    + "Resultado: " + this.resultado + "\n";
      }


}
