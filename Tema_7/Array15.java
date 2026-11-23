import java.util.Scanner;

public class Array15 {
	
	//Metodo para rellenar el array con numeros por teclado 
	public static void rellenarArray(int[] array) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.print("Introduce el numero " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

	}
			
	//Metodo para buscar un numero concreto y mostrar su posicion
	public static void buscarNumero(int[] array, int numeroBuscado) {
		
		boolean encontrado = false; // El numero que se quiere buscar no se ha encontrado aun
		
		for(int i = 0; i < array.length; i++) {
			
			// Si el numero buscado aparece en el array, el programa muestra que ha sido encontrado
			if(array[i]==numeroBuscado) {
				System.out.println("Numero "+numeroBuscado+" encontrado en la posicion "+i);
				encontrado = true;
			}
		}
		
		// Si hay un numero que no se encuentra en el array, se pone este mensaje
		if(!encontrado) {
			System.out.println("El numero "+numeroBuscado+" no se encuentra en el array");
		}
		
	}
			

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[20]; // Array con los 20 numeros
		
		rellenarArray(numeros);
		
		// Se pide el numero a buscar
		System.out.print("\nIntroduce el numero que quieres buscar: ");
		int buscado = scanner.nextInt(); //Esta variable representa el numero a buscar
		
		buscarNumero(numeros, buscado);
		
	}

}
