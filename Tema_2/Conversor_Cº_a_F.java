import java.util.Scanner;

public class Conversor_temperaturas2 {

    public static void main(String[] args) {
		
		System.out.println("Este programa convierte grados Celsius en Fahrenheit.");
		System.out.println("Introduce los grados Celsius:");
		
		Scanner scanner = new Scanner(System.in);
		double celsius = scanner.nextDouble();
		
		double fahrenheit= (celsius * 9.0/5)+32;
		
		System.out.println(celsius+" grados celsius equivalen a "+fahrenheit+" grados fahrenheit");
		scanner.close();
		
	}
}
