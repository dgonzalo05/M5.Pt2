import java.io.*;

/**
 * Programa amb 1 martriu de 5x4 mostra una taula sumant de l'1 fins al 20
 * **/
import java.util.*;
public class P11_Matriu2{
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int ar1[][];
	int fil = 5;
	int col = 4;
	int sum = 1;
	ar1 = new int[fil][col];
		for (int i = 0; i < fil; i++){
			for (int o = 0; o < col; o++){
				ar1[i][o] = sum++;
				System.out.print(ar1[i][o]+"  ");
			}
			System.out.println();
		}
}
}
