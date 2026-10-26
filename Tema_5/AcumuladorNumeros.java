import java.util.Scanner;

public class AcumuladorNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int numero;

		int suma = 0;

		int numerosIntroducidos = 0;

		do {

			System.out.print("Introduce un numero entero (0 para terminar): ");
			numero = scanner.nextInt();
			suma = suma + numero;
			
			numerosIntroducidos++;

		} while (numero != 0);

		System.out.println("La suma total es " + suma);
		
		int media = suma/numerosIntroducidos;
		
		System.out.println("La media es "+media);

	}
		
		

}
