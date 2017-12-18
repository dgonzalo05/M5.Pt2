import java.io.*;

/**
 * Programa amb 3 arrays que demana a l'usuari 2 enters i torna la suma dels arrays [1] i [2] d'1 en 1 fins a 10 vegades, i l'array [3] fa la suma 10 vegades de cada suma dels arrays [1] i [2]
 * **/
import java.util.*;
public class P10_3Arrays{
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputenter1;
    String inputenter2;
    int ar1[],ar2[],ar3[];
    ar1 = new int[10];
    ar2 = new int[10];
    ar3 = new int[10];
    boolean con;
    do {
    System.out.print("Introdueix el primer enter: ");
    inputenter1 = reader.readLine();
    con = CheckString.toNum(inputenter1);
    } while(!con);
    ar1[0] = Integer.parseInt(inputenter1);
    do {
    System.out.print("Introdueix el segon enter: ");
    inputenter2 = reader.readLine();
    con = CheckString.toNum(inputenter2);
    } while(!con);
    ar2[0] = Integer.parseInt(inputenter2);
    System.out.print("[1] ");
    for (int i = 0; i < 10; i++){
        if (i != 0){
            ar1[i] = ar1[i - 1] + 1;
        }
        System.out.print(ar1[i]+", ");
    }
    System.out.println();
    System.out.print("[2] ");
    for (int i = 0; i < 10; i++){
        if (i != 0){
            ar2[i] = ar2[i - 1] + 1;
        }
        System.out.print(ar2[i]+", ");
    }
    System.out.println();
    System.out.print("[3] ");
    for (int i = 0; i < 10; i++){
            ar3[i] = ar1[i] + ar2[i];
        System.out.print(ar3[i]+", ");
    }
}
}


