import java.util.Scanner;

public class MatrizNumerica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el numero de filas: ");
		int filas = scanner.nextInt();

		System.out.print("Introduce el numero de columnas: ");
		int columnas = scanner.nextInt();

		System.out.println("Resultado de la matriz: ");
		
		for (int i = 1; i <= filas; i++) {

			for (int j = 1; j <= columnas; j++) {
				
				int valor = i*j;
			System.out.print(valor+ "\t");
			}

			System.out.println();
		}
	}

}
