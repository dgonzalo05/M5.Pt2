import java.io.*;

/**
 * Programa que calcula el factorial d'un nombre sencer introduït per l'usuari.
 **/
import java.util.*;
public class P8_Factorial {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputvalor;
    int valor,rang,mult;
    rang =1;
    mult = 1;
    System.out.print("Introdueix un número: ");
    inputvalor = reader.readLine();
    valor = Integer.parseInt(inputvalor);
    while (rang <= valor){
        mult = mult*rang;
        rang++;
        }
        System.out.println(mult);
    }
}
