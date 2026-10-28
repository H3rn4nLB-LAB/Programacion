import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un numero entero positivo: ");
		int numero = scanner.nextInt();

		int division = 1;
		int cifras = 0;

		do {

			division = division * 10;
			cifras++;

		} while (numero / division > 0);

		System.out.print("El numero tiene " + cifras + " cifras");
	}

}
