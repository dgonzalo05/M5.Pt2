import java.io.*;

/**
 * Programa que demana un text i el torna en format morse
 **/
import java.util.*;
public class P11_Morse {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String text, resultat;
    char[] alfa = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', '0'};
    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----"};
    System.out.print("Escriu alguna cosa: ");
    text = reader.readLine();
    //int text2 = Integer.parseInt(text);
	resultat = "";
	for (int i = 0; i < text.length(); i++){
		for (int o = 0; o < alfa.length; o++){
			if (alfa[o] == (text.charAt(i))){
				resultat += morse[o]+" ";
			}	
		}
	}
	System.out.println(resultat);
}
}


