import java.io.*;

/**
 * Programa que crea un array y mostra els 100 primers números PARELLS i indica la seva posició dintre de l'array.
 **/
import java.util.*;
public class P10_Array {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int array[],i,o;
    array = new int[100];
    o = 0;
    for (i=0;i<100;i++){
		array[i] = o;
		o+=2;
		System.out.println(array[i]);
	}
 }
}
