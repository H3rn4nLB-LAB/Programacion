import java.util.Scanner;

public class Array13 {

	//Metodo para rellenar el array con los numeros leidos por teclado
	public static void rellenarArray(int[] array) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.print("Introduce el numero " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

	}

	//Metodo para multipliar por dos el array anterior.
	public static int[] multiplicarPorDos(int[] origen) {
		
		int[] destino = new int[origen.length];

		for (int i = 0; i < origen.length; i++) {
			destino[i] = origen[i] * 2;
		}
		return destino;
	}

	//Metodo para unir los dos arrays anteriores en uno grande
	public static int[] unirArrays(int[] array1, int[] array2) {

		int[] destino = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++) {

			destino[i] = array1[i];
			destino[i + array1.length] = array2[i];
		}
       return destino;
	}
	
	
    //Metodo para ordenar un array de menor a mayor (ascendente)
	public static void ordenarAscendente(int[] array) {

		//El prime bucle (i) fija el numero que vamos a comparar
		for (int i = 0; i < array.length; i++) {

			//El segundo bucle(j) recorre todos los numeros que estan a su derecha
			for (int j = i + 1; j < array.length; j++) {

				//Si el numero de la izquierda es mayor que el de la derecha...
				if (array[i] > array[j]) {
					
					//...se intercambian usando una variable auxiliar (aux) para no perder el dato
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	
	//Metodo para mostrar el array completo
	public static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] array1 = new int[5];  //Array con los numeros originales

		rellenarArray(array1);
		
		int[] array2 = multiplicarPorDos(array1);  //Array con los numeros multiplicados por dos
		
		int[] array3 = unirArrays(array1, array2);	 // Array con los numeros de los dos arrays anteriores juntos

		ordenarAscendente(array3);

		System.out.println("Todos los numeros ordenados: ");
		mostrarArray(array3);

	}

}
