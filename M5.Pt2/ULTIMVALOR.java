import java.io.*;

/**
 * Torna l'últim valor d'un nombre sencer
 **/
public class ULTIMVALOR {
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String inputValor;
	System.out.print("Introdueix un nombre sencer: ");
	inputValor = reader.readLine();
	int digit = inputValor.length();
	digit = digit-1;
	System.out.println("L'últim valor és: " + inputValor.charAt(digit));
  }
}
