import java.util.Scanner;

public class VolumenCono {

     public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la base del cono (r): ");
		double radio = scanner.nextDouble();
		
		double pi = 3.14;
		
		System.out.println("Introduce la altura del cono (h): ");
		double altura = scanner.nextDouble();
		
		double volumen =(1.0/3.0)*pi*(radio*radio)*altura;
		
		System.out.println("El volumen del cono es: "+volumen);
		
		scanner.close();
		
	}
	
}
