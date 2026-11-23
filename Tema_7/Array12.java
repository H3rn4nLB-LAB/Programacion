import java.util.Scanner;

public class Array12 {

	//Metodo para rellenar el array con los numeros leidos por teclado
	public static void rellenarArray(int[] array) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.print("Introduce el numero " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

	}

	
	//Metodo para multipliar por dos el array anterior. Lee de 'origen' (array1), multiplica por dos, guarda en 'destino' (array2) y lo devuelve
	public static int[] multiplicarPorDos(int[] origen) {

		int[] destino = new int[origen.length];
		
		for (int i = 0; i < origen.length; i++) {
			destino[i] = origen[i] * 2;
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
		

		rellenarArray(array1);

		int[] array2 = multiplicarPorDos(array1);

		System.out.println("\nEl array con los numeros multiplicados por 2 es: ");
		mostrarArray(array2);

	}

}
