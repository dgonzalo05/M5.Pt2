import java.io.*;

/**
 * Calcula el total de diners guanyats a partir del producte i la quantitat venuda introduïda
 **/
public class BEGUDA {
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String inputCola;
	String inputPcola;
	String inputTaronja;
	String inputPtaronja;
	String inputLlimona;
	String inputPllimona;
	int cola;
	int pcola;
	int taronja;
	int ptaronja;
	int llimona;
	int pllimona;
	int totalcola;
	int totaltaronja;
	int totalllimona;
	System.out.print("Introdueix la quantitat de COLA venuda: ");
	inputCola = reader.readLine();
	cola = Integer.parseInt(inputCola);
		System.out.print("Introdueix el preu per COLA: ");
	inputPcola = reader.readLine();
	pcola = Integer.parseInt(inputPcola);
	System.out.print("Introdueix la quantitat de TARONJA venuda: ");
	inputTaronja = reader.readLine();
	taronja = Integer.parseInt(inputTaronja);
		System.out.print("Introdueix el preu per TARONJA: ");
	inputPtaronja = reader.readLine();
	ptaronja = Integer.parseInt(inputPtaronja);
		System.out.print("Introdueix la quantitat de LLIMONA venuda: ");
	inputLlimona = reader.readLine();
	llimona = Integer.parseInt(inputLlimona);
		System.out.print("Introdueix el preu per LLIMONA: ");
	inputPllimona = reader.readLine();
	pllimona = Integer.parseInt(inputPllimona);
	totalcola = cola * pcola;
	totaltaronja = taronja * ptaronja;
	totalllimona = llimona * pllimona;
    System.out.println("Producte    Vendes    Preu    Total");
	System.out.println("Cola"+"		"+cola+"   	"+pcola+"   	"+totalcola);
	System.out.println("Taronja"+"		"+taronja+"   	"+ptaronja+"   	"+totaltaronja);
	System.out.println("Llimona"+"   	"+llimona+"   	"+pllimona+"   	"+totalllimona);
  }
}
