import java.io.*;

/**
 * Programa que demana una nota final entre 0 i 10 i retorna la nota mitja, mínima i màxima.
 **/
import java.util.*;
public class P9_Nota1 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputalumn;
    String inputnota;
    int alumn,nota[],i,pitjor,millor,mitja;
    mitja = 0;
    pitjor = 11;
    millor = 0;
    System.out.print("Quants alumnes hi ha? ");
    inputalumn = reader.readLine();
    alumn = Integer.parseInt(inputalumn);
    if (alumn<=50){
		nota = new int[alumn];
		for (i=0;i<alumn;i++){
			System.out.print("Introdueix la seva nota: ");
			inputnota = reader.readLine();
			nota[i] = Integer.parseInt(inputnota);
			if (nota[i] < pitjor){
				pitjor = nota[i];
				}
			else if(nota[i] > millor){
				millor = nota[i];
				}
	
			mitja = mitja + nota[i];
		}
		mitja = mitja/alumn;	
		System.out.println("La mitja és: "+mitja);
		System.out.println("La pitjor nota és: "+pitjor);
		System.out.println("La millor nota és: "+millor);
		}
	else{
		System.out.println("No hi pots introduïr més de 50 alumnes. ");
		}
 }
}
