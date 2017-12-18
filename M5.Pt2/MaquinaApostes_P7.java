import java.io.*;

/**
 * Programa que simula una màquina d'apostes amb variables random i si hi ha una combinació surt un missatge o no.
 **/
import java.util.*;
public class MaquinaApostes_P7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputMov = "0";
    String inputS;
    //int mov,
    int n1, n2, n3, av;
    Random rand = new Random();
    n1 = rand.nextInt(9);
    n2 = rand.nextInt(9);
    n3 = rand.nextInt(9);
    av = rand.nextInt(5);
    System.out.println("Hola! Vols jugar amb mi?(S per continuar)");
    inputS = reader.readLine();
    if (inputS.equals("S") || inputS.equals("s")){    
    }
    else{
        inputMov = "x";
    }
    for (int i=0; i < 20;i++){
        System.out.println("");
    }    
    while(!inputMov.equals("x")){
        System.out.print("\nTens "+av+" moviments");
        System.out.print("\n \n \n \n|"+n1+"|"+n2+"|"+n3+"|\n \n \n");
        System.out.print("\nPer canviar el primer, posa 1 \nPer canviar el segon, posa 2 \nPer canviar el tercer, posa 3 \n'x' per sortir: ");    
        inputMov = reader.readLine();
    /*mov = Integer.parseInt(inputMov);    
    if (mov > 3){
        System.out.println("No funciona");
    }
    else if (mov < 0){
        System.out.println("No funciona");
    }
    else{*/
    if (av==0){
        for (int i=0; i < 20;i++){
            System.out.println("");
        }
        System.out.print("No et queden més moviments!");
    }
    else{
    switch (inputMov){
    case "1":
        for (int i=0; i < 20;i++){
            System.out.println("");
        }
        if (inputMov.equals("1")){
            n1 = rand.nextInt(9);
            av = av-1;
        }
        break;
    case "2":
        for (int i=0; i < 20;i++){
            System.out.println("");
        }
        if (inputMov.equals("2")){
            n2 = rand.nextInt(9);
            av = av-1;
        }
        break;
    case "3":
        for (int i=0; i < 20;i++){
            System.out.println("");
        }
        if (inputMov.equals("3")){
            n3 = rand.nextInt(9);
            av = av-1;
        }
        break;
    case "x":
        for (int i=0; i < 20;i++){
            System.out.println("");
        }
        System.out.println("Adéu");
        break;
    default:
        System.out.println("Aquesta opció no es vàlida");
    }
        if (n1 == n2 && n1 == n3){
        System.out.print("HAS GUANYAT 250€!!!");
    }
    else if (n1 == n2 || n2 == n3){
        System.out.print("HAS GUANYAT 20€!!");
    }
    else if (n1 == 7 || n3 == 7){
        System.out.print("HAS GUANYAT 1€!");
    }
    }
    }
  }
}
