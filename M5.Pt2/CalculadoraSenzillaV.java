import java.io.*;

/**
 * Calcula l’operació que l’usuari introdueixi +, -, * o / i mostra el resultat amb switch
 **/
public class CalculadoraSenzillaV {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputa;
    String inputb;
    String inputc;
    float A,B;
    System.out.print("Introdueix el primer número: ");
    inputa = reader.readLine();
    A = Float.parseFloat(inputa);
    System.out.print("Introdueix l'operació(+, -, *, /): ");
    inputc = reader.readLine();
    System.out.print("Introdueix el segon número: ");
    inputb = reader.readLine();
    B = Float.parseFloat(inputb);
    switch (inputc){
    case "+": System.out.println("El resultat de la suma és : "+(A+B)); break;
    case "-": System.out.println("El resultat de la resta és : "+(A-B)); break;
    case "*": System.out.println("El resultat de la multiplicació és : "+(A*B)); break;
    case "/": System.out.println("El resultat de la divisió és : "+(A/B)); break;
	}   
  }
}
