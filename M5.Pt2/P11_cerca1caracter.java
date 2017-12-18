import java.io.*;

/**
 * Programa que demana una frase i després un caràcter, si el caràcter hi és a la frase mostra un missatge o altre
 **/
import java.util.*;
public class P11_cerca1caracter {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String st, result;
    System.out.print("Escriu alguna cosa: ");
    st = reader.readLine();
	System.out.print("Escriu un caràcter: ");
    char put = reader.readLine().charAt(0);
	int con = 0;
	result = "";
	while (con < st.length()){
		if (put == st.charAt(con)){
			result = "El caràcter '"+put+"' apareix a "+st;
			break;
		}
		else{
			result = "El caràcter '"+put+"' no apareix a "+st;
		}
		con++;
	}
	System.out.println(result);
}
}

