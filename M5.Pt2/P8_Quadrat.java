import java.io.*;

/**
 * Programa que demana un enter positiu més gran que 0 i dibuixa un quadrat amb els nombres fins del 1 fins el valor de l'entrada.
 **/
import java.util.*;
public class P8_Quadrat {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputvalor;
    int valor,i,o;
    System.out.print("Introdueix un número: ");
    inputvalor = reader.readLine();
    valor = Integer.parseInt(inputvalor);
	for (i=0;i<valor;i++){		
	System.out.println();
		for (o=1;o<=valor;o++){
		System.out.print(o+" ");
	}
	}
 }
}
