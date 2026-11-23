import java.util.Scanner;

public class Array14 {
	
	//Metodo para rellenar el array por teclado (acepta positivos y negativos)
		public static void rellenarArray(int[] array) {

			Scanner scanner = new Scanner(System.in);

			for (int i = 0; i < array.length; i++) {

				System.out.print("Introduce el numero " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}

		}
		
		
		public static void ordenarArray(int[] array) {

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

		//Metodo para mostrar el contenido del array
		public static void mostrarArray(int[] array) {

			System.out.println("\nNumeros ordenados");
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}

		

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	   System.out.println("Cuantos numeros quiere introducir en el array?: ");
	   int cantidad = scanner.nextInt();  //Esta variable es la cantidad de numeros que el usuario desea introducir en el array
	   
	   int[] numeros = new int[cantidad];
	   
	   // Llamo a los metodos
	   
	   rellenarArray(numeros);
	   ordenarArray(numeros);
	   mostrarArray(numeros);
	
	}

}
