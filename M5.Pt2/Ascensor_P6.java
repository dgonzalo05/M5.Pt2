import java.io.*;

/**
 * Programa que fa un ascensor que puja i baixa pisos a partir de les dades introduïdes i si les dades son incorrectes surt un missatge de error
 **/
public class Ascensor_P6 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputPis;
    String inputLloc;
    int pis;
    int lloc;
    System.out.print("A quin pis ets?(0,1 o 2): ");
    inputLloc = reader.readLine();
    lloc = Integer.parseInt(inputLloc);
	System.out.print("Per pujar un pis posa +1, per pujar 2 pisos posa +2, per baixar un pis posa -1, i per baixar 2 pisos posa -2: ");
	inputPis = reader.readLine();
	pis = Integer.parseInt(inputPis);
	if (lloc > 3){
		System.out.println("No existeix el pis indicat");
	}
	else if (lloc < -1){
		System.out.println("No existeix el pis indicat");
	}
	else{
    switch (inputPis){
    case "+1":
		if (lloc +1<3){
		System.out.println("Has pujat al pis "+(lloc+1));
		} 
		break;
	case "+2":
		if (lloc +2<3){
		System.out.println("Has pujat al pis "+(lloc+2));
		} 
		break;
	case "-1":
		if (lloc -1>-1){
		System.out.println("Has baixat al pis "+(lloc-1));
		} 
		break;
	case "-2":
		if (lloc -2>-1){
		System.out.println("Has baixat al pis "+(lloc-2));
		} 
		break;
	default:
		System.out.println("No puc ajudar-te a accedir al pis indicat");
		break;
	}
	}  
  }
}
