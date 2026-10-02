import java.util.Scanner;

public class ConversorBytes1 {
	
	public static void main(String[] args) {
		
	   System.out.println("Este programa convierte Mb en Kb.");
	   System.out.println("Introduce los Mb:");
	
       Scanner scanner = new Scanner(System.in);
       double mb = scanner.nextDouble();
	
	   double kb = mb * 1024;
	
	   System.out.println(mb+" Mb equivalen a "+kb+" KB");
	   scanner.close();
	
	}

}
