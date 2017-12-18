import java.io.*;

/**
 * Programa que demana una nota final entre 0 i 10 i retorna les notes introduïdes separades per comes en ordre, també dona l'opció de cercar les notes que siguin iguals i et diu la quantitat de notes i la seva posició de la nota demanada
 * **/
import java.util.*;
public class P10_Nota8{
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputalumn;
    String inputnota;
    String inputvalor;
    int alumn,nota[],valor,pos[],notes,count;
    System.out.print("Quants alumnes hi ha? ");
    inputalumn = reader.readLine();
    alumn = Integer.parseInt(inputalumn);
    if (alumn<=50){
        nota = new int[50];
        for (int i=0;i<alumn;i++){
            System.out.print("Introdueix la seva nota: ");
            inputnota = reader.readLine();
            nota[i] = Integer.parseInt(inputnota);
        }
        for (int i=0;i<alumn;i++){
            if (i+1==alumn){
            System.out.println(nota[i]);
        }
			else{
				System.out.print(nota[i]+", ");
        }
        }
        System.out.println("");
        System.out.print("Quina nota vols cercar? ");
        inputvalor = reader.readLine();
        valor = Integer.parseInt(inputvalor);
        pos = new int[50];
        count = 0;
        for (int i=0; i<alumn; i++){
			if (nota[i] == valor){
				pos[count] = i;
				count++;
			}
		}
		if (count == 0){
			System.out.print("No hi ha cap nota amb el valor "+valor);
		}
		else{
			System.out.print("Hi ha "+count+" notes amb valor "+valor+" a les posicions ");
			for (int i=0;i<count;i++){
				System.out.print(pos[i]+", ");
			}	
		}
    }
    else{
        System.out.println("No hi pots introduïr més de 50 alumnes. ");
   }
} 
}
