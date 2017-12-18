import java.io.*;

/**
 * Programa amb 1 martriu de 5x4 mostra una taula d'1s
 * **/
import java.util.*;
public class P11_Matriu{
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int ar1[][];
	int fil = 5;
	int col = 4;
	ar1 = new int[fil][col];
	for (int i = 0; i < fil; i++){
		for (int o = 0; o < col; o++){
			ar1[i][o] = 1;
			System.out.print(ar1[i][o]+"  ");
		}
		System.out.println();
	}
	
}
}
