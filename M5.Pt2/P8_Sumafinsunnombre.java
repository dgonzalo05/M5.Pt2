import java.io.*;

/**
 * Programa que demana un número i torna la suma de tots els números entre l'introduït i l'1.
 **/
import java.util.*;
public class P8_Sumafinsunnombre {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputvalor;
    int valor,rang,sum;
    sum = 0;
    System.out.print("Introdueix un número: ");
    inputvalor = reader.readLine();
    valor = Integer.parseInt(inputvalor);
	for (rang = 1;rang <= valor;rang++){
		sum = sum+rang;
	}
	System.out.println(sum);
}
}


