import java.util.Scanner;

public class VolumenCilindro {
	
	public static double volumenCilindro(double radio, double altura) {
		
		return Math.PI * Math.pow(radio, 2) * altura;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el radio del cilindro: ");
		double radio = scanner.nextDouble();
		
		System.out.print("Introduce la altura del cilindro: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Volumen: "+volumenCilindro(radio, altura));
		
	}

}
