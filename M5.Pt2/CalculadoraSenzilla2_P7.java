import java.io.*;

/**
 * Calcula l’operació que l’usuari introdueixi +, -, * o / i mostra el resultat amb switch, validació, i consulta si es vol fer un altre operació
 **/
public class CalculadoraSenzilla2_P7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputa;
    String inputb;
    String inputc;
    float A,B;
    String si;
do {
    System.out.print("Introdueix el primer número: ");
    inputa = reader.readLine();
    A = Float.parseFloat(inputa);
    System.out.print("Introdueix l'operació(+, -, *, /): ");
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
            switch (inputc){
				case "+": System.out.println("El resultat de la suma és : "+(A+B)); break;
				case "-": System.out.println("El resultat de la resta és : "+(A-B)); break;
				case "*": System.out.println("El resultat de la multiplicació és : "+(A*B)); break;
				case "/": 
					if (B == 0){
						System.out.println("Error, no pots fer una divisió entre 0");
						}
					else{
						System.out.println("El resultat de la divisió és : "+(A/B)); break;
						}
				}

			System.out.println("Vols fer un altre operació? (S/N)");
			si = reader.readLine();
    }
    while (si.equals("S") || si.equals("s") || si.equals("Si") || si.equals("si") || si.equals("SI"));
}
}

