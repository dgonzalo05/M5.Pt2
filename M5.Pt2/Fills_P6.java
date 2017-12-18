import java.io.*;
/**
 * Demana un nombre de fills i respon amb una frase diferent segons el nombre de fills
**/
public class Fills_P6 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputFill;
    int fill;
      System.out.print("Escriu el nombre de fills que tens: ");
      inputFill = reader.readLine();
      fill = Integer.parseInt(inputFill);
        if (fill < 0){
            System.out.println("Error, no pots tenir menys de 0 fills!");
            }
        else if(fill == 0){
            System.out.println("Tot el que t'has estalviat en bolquers!");
        }
        else if(fill == 1){
            System.out.println("Compte de no mimar-lo massa!");
        }
        else if(fill > 1 && fill < 5){
            System.out.println("No t'avoreixes a casa eh?");
        }
        else if(fill > 4){           
        System.out.println("Tu sí que fas país!");
    }
}
}
