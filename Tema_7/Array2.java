public class Array2 {

	public static void main(String[] args) {

		int[] numeros = new int[100];

		for (int i = 0; i <= numeros.length; i++) {

			numeros[i] = 100 - i;

		}

		for (int i = 0; i <= numeros.length; i++) {

			System.out.print(numeros[i] + " ");

		}

	}

}
