import java.io.*;

/**
 * Programa que demana un string. Després et mostra el nombre caràcters i les vocals que hi ha
 **/
import java.util.*;
public class P11_numcharivocal {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nom;
    int vocal = 0;
    int con = 0;
    System.out.print("Com et dius? ");
    nom = reader.readLine();
    for (int i = 0; i < nom.length(); i++){
        if (nom.charAt(i) == 'a' || nom.charAt(i) == 'e' || nom.charAt(i) == 'i' || nom.charAt(i) == 'o' || nom.charAt(i) == 'u' ){
            vocal++;
        }
    }
    System.out.print("Hi ha "+nom.length()+" caràcters i "+vocal+" vocals");
}
}
