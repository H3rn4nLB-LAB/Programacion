import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] numeros = new double[10];	
		double suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
			suma = suma + numeros[i];
		}
		
		double media = suma / numeros.length;
		System.out.println("La media de los 10 números es: " + media);
	}

}
