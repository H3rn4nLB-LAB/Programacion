import java.util.Scanner;

public class NumerosPrimosRango {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M, N;
		
		System.out.print("Introduzca dos numeros: ");
		M = scanner.nextInt();
		N = scanner.nextInt();
		
		for (int num = M; num <= N; num++) {

			boolean esPrimo = true;

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					esPrimo = false;
				}
			}

			if (esPrimo) {
				System.out.println(num);
			}

		}

	}

}
