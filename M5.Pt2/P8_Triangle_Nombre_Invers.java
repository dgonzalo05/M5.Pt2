import java.io.*;

/**
 * Programa que demana un nombre positiu més gran que 0 i mostra línia a línia del número introduït al 1 fent un triangle invers.
 **/
import java.util.*;
public class P8_Triangle_Nombre_Invers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputvalor;
    int valor,i,o;
    System.out.print("Introdueix un número: ");
    inputvalor = reader.readLine();
    valor = Integer.parseInt(inputvalor);
    System.out.println();
    for (i=valor;i>0;i--){
        for (o=1;o<=i;o++){
            if (o == i){
            System.out.println(o);
        }
        else{
            System.out.print(o+",");
        }
    }
  }
 }
}


