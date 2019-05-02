package juegodeazar;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JonathanLizama
 */
public class Juego {

      ArrayList<Dado> partida = new ArrayList();
      Dado dado1 = new Dado();
      Dado dado2 = new Dado();

      public int lanzamientoDado1() {
            return dado1.lanzarDado();
      }

      public int lanzamientoDado2() {
            return dado2.lanzarDado();
      }

      public String resultado(int suma) {
            String respuesta;
            if (suma == 7) {
                  respuesta = "HAS GANADO!!!";
            } else {
                  respuesta = "HAS PERDIDO";
            }
            return respuesta;
      }

      public void menu() {
            boolean salir = false;
            int partidas;
            boolean validar = true;
            while (!salir) {
                  System.out.println("------------------------------------------------------------------------");
                  System.out.println("Bienvenido al juego de dados");
                  System.out.println("------------------------------------------------------------------------");

                  System.out.println("[1].-|Jugar| ");
                  System.out.println("[2].-|Mostrar Todos los juegos| ");
                  System.out.println("[3].-|SALIR| ");

                  System.out.println("Ingrese una opción porfavor");
                  int opcion = leerEntero();
                  switch (opcion) {
                        case 1: {
                              System.out.println("¿Cuantas partidas desea realizar?");
                              partidas = leerEntero();
                              validar = validarCantidadPartidas(partidas);
                              crearPartidaDados(validar, partidas);

                              break;
                        }
                        case 2: {
                              mostrarPartidasDados(validar);

                              break;
                        }
                        case 3: {
                              System.out.println("Has salido del juego de Dados!!!");
                              salir = true;
                              break;
                        }
                        default:
                              System.out.println("Ingrese una opción correcta...");
                              break;
                  }
            }

      }

      public int leerEntero() {

            Scanner leer = new Scanner(System.in);
            int num;
            try {
                  do {
                        System.out.println("");
                        num = leer.nextInt();
                  } while (num < 1);
                  return num;
            } catch (InputMismatchException e) {
                  System.out.println(e);
                  System.out.println("Ingrese un valor de acuerdo al tipo");
                  return -1;
            }
      }

      public boolean validarCantidadPartidas(int partidas) {
            return partidas > 0;
      }

      public void crearPartidaDados(boolean verificar, int partidas) {
            if (verificar = true) {
                  for (int i = 0; i < partidas; i++) {
                        int lanzamiento1 = lanzamientoDado1();
                        int lanzamiento2 = lanzamientoDado2();
                        int suma = lanzamiento1 + lanzamiento2;
                        String respuesta = resultado(suma);
                        partida.add(new Dado(lanzamiento1, lanzamiento2, suma, respuesta));
                  }
            }
      }

      public void mostrarPartidasDados(boolean verificar) {
            if (verificar == true) {
                  for (int i = 0; i < partida.size(); i++) {
                        System.out.println("PARTIDA N°" + (i + 1) + " : ");
                        System.out.println("" + partida.get(i).toString());
                  }
            }

      }

}
