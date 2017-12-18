import java.io.*;
/**
 * Programa que calcula el temps introduït DD - MM - AAA - HH - MnMn - SS, transcorregut en un segon
 **/
public class Segon_P6 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputDia;
    String inputMes;
    String inputAny;
    String inputHora;
    String inputMinut;
    String inputSegon;
    int dia,mes,any,hora,minut,segon;
      System.out.print("Introdueix dia : ");
      inputDia = reader.readLine();
      dia = Integer.parseInt(inputDia);
	  System.out.print("Introdueix mes : ");
	  inputMes = reader.readLine();
	  mes = Integer.parseInt(inputMes);
      System.out.print("Introdueix any : ");
      inputAny = reader.readLine();
      any = Integer.parseInt(inputAny);
      System.out.print("Introdueix hora : ");
      inputHora = reader.readLine();
      hora = Integer.parseInt(inputHora);
      System.out.print("Introdueix minut : ");
      inputMinut = reader.readLine();
      minut = Integer.parseInt(inputMinut);
      System.out.print("Introdueix segon : ");
      inputSegon = reader.readLine();
      segon = Integer.parseInt(inputSegon);
        if (segon > 59 || segon < 0){
			System.out.println("Error, segons incorrectes");
			}
		else if(minut > 59 || minut < 0){
			System.out.println("Error, minuts incorrectes");
		}
		else if(hora > 23 || hora < 0){
			System.out.println("Error, hores incorrectes");
		}
		else if(dia > 30 || dia < 1){
			System.out.println("Error, dia incorrecte");
		}
		else if(mes > 12 || mes < 1){
			System.out.println("Error, mes incorrecte");
		}
		else {
        if (segon + 1 == 60){
			segon = 0;
			minut = minut + 1;
		}
		else{
			segon = segon +1;
		}
		if (minut == 60){
			minut = 0;
			hora = hora + 1;
		}
		if (hora == 24){
			hora = 0;
			dia = dia + 1;
		}
		if (dia == 31){
			dia = 1;
			mes = mes + 1;
		}
		if (mes == 13){
			mes = 1;
			any = any + 1;
		}
		System.out.println("DD"+dia+" MM"+mes+" AAAA"+any+" HH"+hora+" MnMn"+minut+" SS"+segon);
	}
}
}
