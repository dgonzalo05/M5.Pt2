import java.io.*;

/**
 * Calcula l’operació que l’usuari introdueixi +, -, * o / i mostra el resultat. També valida si els operands hi són ben escrits o no.
 **/
public class CalculadoraSenzilla_P7 {
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
    boolean validator = true;
    while (validator){
		if (inputc.equals("+") || inputc.equals("-") || inputc.equals("*") || inputc.equals("/")){
			validator = false;
		}
		else{
			System.out.println("Has introduït malament. escriu a l'operand (*+,-,* o /): " );
			inputc = reader.readLine();
			}
	}
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
			System.out.println("El resultat de la divisió és : "+(A/B));
			}
	}
}
