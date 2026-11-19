public class Array3 {

	public static void main(String[] args) {

		int[] numeros = new int[100];
		int contador = 0;

		for (int i = 0; i <= numeros.length; i++) {

			if (i % 2 == 0) {
				numeros[contador] = i;
				contador++;
			}

		}

		for (int i = 0; i <= contador; i++) {

			System.out.print(numeros[i] + " ");

		}

	}

}
