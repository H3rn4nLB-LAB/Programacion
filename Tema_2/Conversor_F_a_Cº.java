import java.util.Scanner;

public class Conversor_temperaturas {

	public static void main(String[] args) {
		
		System.out.println("Este programa convierte grados Fahrenheit en Celsius.");
		System.out.println("Introduce los grados Fahrenheit:");
		
		Scanner scanner = new Scanner(System.in);
		double fahrenheit = scanner.nextDouble();
		
		double celsius = (5.0/9)*(fahrenheit -32);
		
		System.out.println(fahrenheit+" grados fahrenheit equivalen a "+celsius+" grados celsius");
		scanner.close();
		
	}
	
}
