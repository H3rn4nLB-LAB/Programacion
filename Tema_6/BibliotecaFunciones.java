import java.util.Scanner;

public class BibliotecaFunciones {

	public static boolean esCapicua(int numero) {

		return numero == voltea(numero);
	}

	public static int potencia(int base, int exponente) {

		int p = 1;

		for (int i = 1; i <= exponente; i++) {
			p *= base;
		}

		return p;

	}

	public static int digitos(int numero) {

		if (numero == 0) {
			return 1;
		}

		int contador = 0;

		if (numero < 0) {
			numero = -numero;
		}

		while (numero > 0) {
			numero = numero / 10;
			contador++;
		}

		return contador;
	}

	public static int voltea(int numero) {

		int volteado = 0;
		int signo = 1;

		if (numero < 0) {
			signo = -1;
			numero = -numero;
		}

		while (numero > 0) {

			int digito = numero % 10;
			volteado = (volteado * 10) + digito;
			numero = numero / 10;

		}

		return volteado * signo;
	}

	public static int quitaPorDetras(int numero, int n) {
		for (int i = 0; i < n; i++) {
			numero = numero / 10;
		}
		return numero;
	}

	public static int pegaPorDelante(int numero, int digito) {
		int signo = 1;
		if (numero < 0) {
			signo = -1;
			numero = -numero;
		}

		int nDigitos = digitos(numero);
		int multiplicador = (int) potencia(10, nDigitos);

		int resultado = (digito * multiplicador) + numero;
		return resultado * signo;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("MENU");
			System.out.println("0. Salir");
			System.out.println("1. Es Capicua?");
			System.out.println("2. Potencia");
			System.out.println("3. Contar Digitos");
			System.out.println("4. Voltear numero");
			System.out.println("5. Quitar digitos por atras");
			System.out.println("6. Pegar digitos por delante");
			System.out.println("Elija una opcion: ");

			opcion = scanner.nextInt();

			switch (opcion) {
			
			case 0:
				
				System.out.println("HASTA LA VISTA");
				break;

			case 1:
				System.out.print("Introduce un numero: ");
				int numCapicua = scanner.nextInt();

				if (esCapicua(numCapicua)) {

					System.out.println("El numero es capicua");

				} else {

					System.out.println("El numero NO es capicua");
				}

				break;

			case 2:
				System.out.print("Introduce un numero base: ");
				int base = scanner.nextInt();

				System.out.print("Introduce el exponente: ");
				int exponente = scanner.nextInt();

				System.out.println("Resultado: " + potencia(base, exponente));

				break;

			case 3:

				System.out.print("Introduce un numero: ");
				int numDigitos = scanner.nextInt();

				System.out.println("El numero tiene: " + digitos(numDigitos) + " digitos");
				break;

			case 4:
				System.out.print("Introduce un numero: ");
				int numVoltear = scanner.nextInt();

				System.out.println("Numero volteado: " + voltea(numVoltear));

				break;

			case 5:
				System.out.print("Introduce un numero: ");
				int numQuitar = scanner.nextInt();

				System.out.print("Introduce cuantos digitos quieres quitar: ");
				int cantQuitar = scanner.nextInt();

				System.out.println("Resultado: " + quitaPorDetras(numQuitar, cantQuitar));
				break;

			case 6:

				System.out.print("Introduce un numero: ");
				int numPegar = scanner.nextInt();

				System.out.print("Introduce el digito que quiera pegar en el numero: ");
				int digito = scanner.nextInt();

				System.out.println("Resultado: " + pegaPorDelante(numPegar, digito));

				break;

			default:

				System.out.println("ERROR: OPCION INVALIDA");
			}

		} while (opcion != 0);
	}
}
