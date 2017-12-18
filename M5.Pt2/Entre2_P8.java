import java.io.*;

/**
 * Programa que demana 2 números i escriu tots els números entre el primer i el segon.
 **/
import java.util.*;
public class Entre2_P8 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputun;
    String inputdos;
    int un,dos,rang;
    System.out.print("Introdueix el primer número: ");
    inputun = reader.readLine();
    un = Integer.parseInt(inputun);
    System.out.print("Introdueix el segon número: ");
    inputdos = reader.readLine();
    dos = Integer.parseInt(inputdos);
    if (un <= dos){
	for (rang = un; rang<=dos; rang++){
			System.out.println(rang);
		}
	}
	else if (un >= dos){
			for(rang = un; rang>=dos; rang--){
			System.out.println(rang);
    }
  }
}
}
