import java.io.*;
/**
 * Programa que calcula el descompte en quantitat i percentatge d'un valor del producte original i pagat
 **/
public class Descompte_P6 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputOriginal;
    String inputPagat;
    int original, pagat;
    float descompte, percentatge;
    System.out.print("Introdueix el preu original: ");
    inputOriginal = reader.readLine();
    original = Integer.parseInt(inputOriginal);
    System.out.print("Introdueix el preu pagat: ");
    inputPagat = reader.readLine();
    pagat = Integer.parseInt(inputPagat);
    if (original > pagat){
		descompte = original - pagat;
		percentatge = (descompte / original) * 100;
		System.out.println("T'han descomptat "+descompte+"€"+"\nEl percentatge del descompte és "+(int)percentatge+"%");
	}
	else{ 
		System.out.println("T'han pres el pel");
	}
}
}
