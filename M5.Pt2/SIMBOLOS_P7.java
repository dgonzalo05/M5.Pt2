import java.io.*;
 
/**
 * Introdueix una tecla qualsevol i et diu si la tecla es un número o no i si no ho representa, demana que s'introdueixi altre cop.
 **/
public class SIMBOLOS_P7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputSim;
    boolean validator = true;
    System.out.print("Introdueix un símbol: ");
    inputSim = reader.readLine();
    while (validator){
		if (inputSim.equals("1") || inputSim.equals("2") || inputSim.equals ("3") || inputSim.equals ("4") || inputSim.equals ("5") || inputSim.equals ("6") || inputSim.equals ("7") || inputSim.equals ("8") || inputSim.equals ("9") || inputSim.equals ("0")){
        System.out.println("La tecla que has introduït representa un número");
        validator = false;
        }
        else{
		System.out.print("No has escrit un número, torna a probar: ");
		inputSim = reader.readLine();
		}
	}
}
}

