import java.io.*;

/**
 * Programa que demana una nota final entre 0 i 10 i retorna les notes introduïdes separades per comes en ordre, després canvia les notes inferiors a 5 a 5 i calcula altre cop la mitja, pitjor i millor **/
import java.util.*;
public class P10_Aprovats {
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
				millor = nota [i];
			}
			mitja = mitja + nota[i];
        }
        mitja = mitja/alumn;
        for (i=0;i<alumn;i++){
            if (i+1==alumn){
            System.out.print(nota[i]);
        }
        else{
            System.out.print(nota[i]+", ");
        }
        }
        System.out.println("\nMitja: "+mitja);
        System.out.println("Millor: "+millor);
        System.out.println("Pitjor: "+pitjor);
        mitja = 0;
        pitjor = 11;
		millor = 0;
        for (i=0;i<alumn;i++){
			if (nota[i]<5){
				nota[i] =5;
			}
			if (i==alumn){
			System.out.print(nota[i]);
			}
			
			else{	
				System.out.print(nota[i]+", ");
			}
			if (nota[i] < pitjor){
				pitjor = nota[i];
			}
			else if(nota[i] > millor){
				millor = nota [i];	
			}
				mitja = mitja + nota[i];
			}
			mitja = mitja/alumn;
			System.out.println("\nMitja: "+mitja);
			System.out.println("Millor: "+millor);
			System.out.println("Pitjor: "+pitjor);
	}
    else{
        System.out.println("No hi pots introduïr més de 50 alumnes. ");
        }
       }
} 
