import java.io.*;

/**
 * Calcula la quantitat d'euros escrita en pessetes
 **/
public class pesseta {
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String inputEuro;
	double euro;
	System.out.print("Introdueix una quantitat d'euros: ");
	inputEuro = reader.readLine();
	euro = Double.parseDouble(inputEuro);
	double pessetas;
	pessetas = euro * 166.386;
    System.out.println(inputEuro + " euros son: " + pessetas + "pts.");
  }
}
