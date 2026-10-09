import java.util.Scanner;

public class CaídaObjeto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la altura (h) en metros: ");
		double h = scanner.nextDouble();
		
		if(h < 0) {
			System.out.println("Error. La altura no puede ser negativa");
		}
		
		double g = 9.81;
		
		double t = Math.sqrt((2*h)/g);
		
		System.out.println("El objeto tardará "+t+ " segundos en caer");
		
		scanner.close();
	}

}
