import java.util.Scanner;

public class Array11 {

	
	// Metodo para rellenar los arrays. Se piden los numeros por teclado y se guardan en el array recibido
	public static void rellenarArray(int[] array) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.print("Introduce el numero " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

	}

	
	// Metodo para unir los dos arrays anteriores. Copia dos arrays de 5 elementos dentro de uno de 10
	public static int[] unirArrays(int[] array1, int[] array2) {

		int[] destino = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {

			destino[i] = array1[i];  //Guarda los 5 primeros numeros en las 5 primeras posiciones
			
			destino[i + array1.length] = array2[i]; //Guarda el segundo array en las ultimas 5 posiciones
		}
     return destino;
	}
	
	
    // Metodo para imprimir el array resultante
	public static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] array1 = new int[5];
		int[] array2 = new int[5];

		System.out.println("--- Primer array ---");
		rellenarArray(array1);

		System.out.println("\n--- Segundo array ---");
		rellenarArray(array2);

		int[] array3 = unirArrays(array1, array2);   // Junta array1 y array2 en un solo array

		System.out.println("\nLos 10 numeros unidos son: ");
		mostrarArray(array3);

	}

}
