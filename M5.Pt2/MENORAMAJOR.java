import java.io.*;

/**
 * Introdueix 2 dades i mostra les dades de menor a major
 **/
public class MENORAMAJOR {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputNumA;
    String inputNumB;
    int numA;
    int numB;
    System.out.print("Introdueix el primer número: ");
    inputNumA = reader.readLine();
    numA = Integer.parseInt(inputNumA);
    System.out.print("Introdueix el segon número: ");
    inputNumB = reader.readLine();
    numB = Integer.parseInt(inputNumB);
    if (numA > numB){
		System.out.println(numB+" "+numA);
	}
	else{ 
		System.out.println(numA+" "+ numB);
	}
}
}
