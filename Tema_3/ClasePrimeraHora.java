import java.util.Scanner;

public class ClasePrimeraHora {

	public static void main(String[] args) {
		
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Introduce un dia de la semana: ");
      String dia = scanner.nextLine();
      
      if(dia.equals("lunes")) {
    	  System.out.println("A primera hora toca Lenguajes de Marcas");
      } else if(dia.equals("martes")) {
    	  System.out.println("A primera hora toca Bases de Datos");
      } else if(dia.equals("miercoles")) {
    	  System.out.println("A primera hora toca Sistemas Informaticos"); 
      } else if(dia.equals("jueves")) {
    	  System.out.println("A primera hora toca Programacion");
      } else if(dia.equals("viernes")) {
    	  System.out.println("A primera hora toca Entornos de Desarrollo");
      } else {
    	  System.out.println("Dia invalido");
      }
		
      scanner.close();
	}

}
