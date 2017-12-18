import java.io.*;

/**
 * Programa que demana un nom i mostra el nom en majúscules
 **/
import java.util.*;
public class P11_NumA {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nom;
    int con = 0;
    System.out.print("Com et dius? ");
    nom = reader.readLine();
    for (int i = 0; i < nom.length(); i++){
		if (nom.charAt(i) == 'a'){
			con++;
		}
	}
    System.out.print("Hi ha "+con+" a");
}
}
