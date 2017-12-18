import java.io.*;

/**
 * Programa que demana una paraula i dibuixa una figura amb les lletres del final fins al principi i després les lletres del final s'esborren
 **/
import java.util.*;
public class P11_Telefon {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Escriu una paraula: ");
    String text = reader.readLine();
    for (int i = text.length(); i > 0; i--){
		String conc = "";
		for (int o = text.length()-1; o >= i; o--){
			conc = text.charAt(o)+conc;
		}
        System.out.println(conc);
        }
    for (int j = text.length(); j > 0; j--){
		String conc = "";
		for (int p = 0; p < j; p++){
			conc += text.charAt(p);
		}
        System.out.println(conc);
        }
    }
}
