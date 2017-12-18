import java.io.*;

/**
 * Programa que demana una nota final entre 0 i 10 i retorna les notes introduïdes separades per comes en ordre invertit.
 **/
import java.util.*;
public class P10_Nota3 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputalumn;
    String inputnota;
    int alumn,nota[],i;
    System.out.print("Quants alumnes hi ha? ");
    inputalumn = reader.readLine();
    alumn = Integer.parseInt(inputalumn);
    if (alumn<=50){
		nota = new int[alumn];
		for (i=0;i<alumn;i++){
			System.out.print("Introdueix la seva nota: ");
			inputnota = reader.readLine();
			nota[i] = Integer.parseInt(inputnota);	
		}
		for (i=alumn-1;i>=0;i--){
			if (i-1==-1){
			System.out.print(nota[i]);
		}
		else{
			System.out.print(nota[i]+", ");
		}
		}
	}
	else{
		System.out.println("No hi pots introduïr més de 50 alumnes. ");
		}
	
 }
}

