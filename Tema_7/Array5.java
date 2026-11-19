public class Array5 {

	public static boolean esPrimo(int numero) {

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] numeros = new int[100];
		int contador = 0;

		for (int i = 1; i <= numeros.length; i++) {

			if (esPrimo(i)) {
				numeros[contador] = i;
				contador++;
			}

		}

		for (int i = 0; i <= contador; i++) {

			System.out.print(numeros[i] + " ");

		}

	}

}
