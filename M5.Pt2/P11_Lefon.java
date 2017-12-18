import java.io.*;

/**
 * Programa que demana una paraula i fa un dibuix
 **/
import java.util.*;
public class P11_Lefon {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String text, resultat;
    System.out.print("Escriu alguna cosa: ");
    text = reader.readLine();
    for (int i = text.length(); i > 0; i--){
		System.out.println(text);
	}
	for (int i = 0; i < text.length(); i++){
		System.out.println(text);
	}
}
}
