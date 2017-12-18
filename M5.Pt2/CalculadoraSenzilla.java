import java.io.*;

/**
 * Calcula l'àrea d'un rectangle segons les variables que introdueixi l'usuari
 **/
public class CalculadoraSenzilla {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputa;
    String inputb;
    String inputc;
    float A,B;
    System.out.print("Introdueix el primer número: ");
    inputa = reader.readLine();
    A = Float.parseFloat(inputa);
    System.out.print("Introdueix l'operació: ");
    inputc = reader.readLine();
    System.out.print("Introdueix el segon número: ");
    inputb = reader.readLine();
    B = Float.parseFloat(inputb);
    if (inputc.equals("+")){
    System.out.println("El resultat de la suma és : "+(A+B));
  }
	if (inputc.equals("-")){
    System.out.println("El resultat de la resta és : "+(A-B));
  }
	if (inputc.equals("*")){
    System.out.println("El resultat de la multiplicació és : "+(A*B));
  }
	if (inputc.equals("/")){
    System.out.println("El resultat de la divisió és : "+(A/B));	}
  }
}
