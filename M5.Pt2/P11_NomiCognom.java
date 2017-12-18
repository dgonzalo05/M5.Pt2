import java.io.*;

/**
 * Programa que demana 3 strings i els torna amb la inicial en majúscula i la resta en minúscules
 **/
import java.util.*;
public class P11_NomiCognom {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nom,text;
    text = "";
    System.out.print("Escriu el teu nom complet ");
    nom = reader.readLine();
	int con = 0;
	for (int i = 0; i < nom.length(); i++){
		if (i == 0 || nom.charAt(i-1) == ' '){
			text += nom.toUpperCase().charAt(i);
		}
		else{
			text += nom.toLowerCase().charAt(i);
		}
	}
	System.out.print(text);
	}
}

