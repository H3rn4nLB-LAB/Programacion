import java.util.Scanner;

public class ConversorBytes2 {
	
	public static void main(String[] args) {
		
		System.out.println("Este programa convierte Kb en Mb.");
		System.out.println("Introduce los Kb:");
		
		Scanner scanner = new Scanner(System.in);
		double kb = scanner.nextDouble();
		
		double mb = kb/1024;
		
		System.out.println(kb+" Kb equivalen a "+mb+" MB");
		scanner.close();
		
	  }

}
