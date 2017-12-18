import java.io.*;

/**
 * Programa que demana un nombre positiu més gran que 0 i dibuixa línia a línia un "*" fent un triangle.
 **/
import java.util.*;
public class P8_Asterisc {
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

