import java.io.*;

/**
 * Programa que al introduïr el nom, l'edat, i l'any actual et diu quan vas nàixer, quants anys vas tenir a cada any fins ara, i es despedeix.
 **/
import java.util.*;
public class P8_AnysiAnys {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nom,inputany,inputedat;
    int any,i,edat;
    System.out.print("Com et dius? ");
    nom = reader.readLine();
    System.out.print("Quants anys tens? ");
    inputedat = reader.readLine();
    edat = Integer.parseInt(inputedat);
    System.out.print("Quin any és? ");
    inputany = reader.readLine();
    any = Integer.parseInt(inputany);
    for (i = 0;i<edat;i++){
		if (i==0){
		any = any - edat;
		System.out.println("El "+any+" va nàixer");
		}
		else {
			any++;
			System.out.println("El "+any+" tenia "+i+" anys");
		}
    }
    System.out.println("Adéu "+nom);
}
}


