import java.io.*;

/**
 * Programa que demana una paraula i dibuixa una piràmide
 **/
import java.util.*;
public class P11_Piramide {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Escriu una paraula: ");
    String text = reader.readLine();
    for (int j = 1; j <= text.length(); j++){
        String conc = "";
        for (int d = text.length(); d > j; d--){
            conc += "· ";
        }
        for (int p = 0; p < j; p++){
            conc += text.charAt(p)+",";
        }
        System.out.println(conc);
     }
    for (int i = 1; i <= text.length(); i++){
        String conc = "";
        for (int f = text.length(); f > i; f--){
            conc += "· ";
        }
        for (int o = i; o > 0; o++){
            conc += text.charAt(o)+",";
        }
        System.out.println(conc);
     }
    }
}

