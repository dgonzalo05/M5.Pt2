import java.io.*;

/**
 * Programa que fa un ascensor que puja i baixa pisos a partir de les dades introduïdes i si les dades son incorrectes surt un missatge de error i el programa no surt de l'ascensor fins que l'usuari introdueix finalment "x"
 **/
public class Ascensor_P7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputPis = "0";
    int lloc = 0;
	while(!inputPis.equals("x")){
	System.out.println("Et trobes al pis "+lloc);
	System.out.print("Per pujar un pis posa +1\nPer pujar 2 pisos posa +2 \nPer baixar un pis posa -1 \nPer baixar 2 pisos posa -2 \n'x' per sortir: ");	
	inputPis = reader.readLine();	
	if (lloc > 3){
		System.out.println("No existeix el pis indicat");
	}
	else if (lloc < -1){
		System.out.println("No existeix el pis indicat");
	}
	else{
    switch (inputPis){
    case "+1":
		for (int i=0; i < 2;i++){
			System.out.println("");
		}
		if (lloc +1<3){
			lloc += 1;
		System.out.println("Has pujat al pis "+lloc);
		} 
		break;
	case "+2":
		for (int i=0; i < 2;i++){
			System.out.println("");
		}	
		if (lloc +2<3){
			lloc += 2;
		System.out.println("Has pujat al pis "+lloc);
		} 
		break;
	case "-1":
		for (int i=0; i < 2;i++){
			System.out.println("");
		}
		if (lloc -1>-1){
			lloc += -1;
		System.out.println("Has baixat al pis "+lloc);
		} 
		break;
	case "-2":
		for (int i=0; i < 2;i++){
			System.out.println("");
		}
		if (lloc -2>-1){
			lloc += -2;
		System.out.println("Has baixat al pis "+lloc);
		} 
		break;
	case "x":
		for (int i=0; i < 2;i++){
			System.out.println("");
		}
		System.out.println("Adéu");
		break;
	default:
		for (int i=0; i < 2;i++){
			System.out.println("");
		}	
		System.out.println("No puc ajudar-te a accedir al pis indicat");
		break;
	}
	}  
	}
  }
}
