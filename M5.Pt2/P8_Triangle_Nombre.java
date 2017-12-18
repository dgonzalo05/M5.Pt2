import java.io.*;

/**
 * Programa que demana un nombre positiu més gran que 0 i mostra línia a línia els número introduït a l’1 fent un triangle.
 **/
import java.util.*;
public class P8_Triangle_Nombre {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputvalor;
    int valor,i,o;
    System.out.print("Introdueix un número: ");
    inputvalor = reader.readLine();
    valor = Integer.parseInt(inputvalor);
    System.out.println();
    for (i=1;i<=valor;i++){
        for (o=0;o<i;o++){
            if (o==(i-1)){
                System.out.println(i-o);
            }
            else{
            System.out.print(i-o+",");
    }
    }
  }
 }
}
