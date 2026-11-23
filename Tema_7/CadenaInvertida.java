import java.util.Scanner;

public class CadenaInvertida {

	// Metodo para pedir y leer la cadena por teclado y la devuelve
	public static String leerCadena(Scanner scanner) {
		System.out.println("Escribe una frase o palabra");
		String cadena = scanner.nextLine();

		return cadena;

	}

	// Metodo que recibe una cadena(String) y la devuelve al reves 
	//(Tuve que buscarinformacion por Internet)
	public static String invertirCadena(String cadena) {
		String invertida = "";

		for (int i = cadena.length(); i >= 0; i--) {
			invertida = invertida + cadena.charAt(i);
		}
		return invertida;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * Creo una variable para guardar el texto original 
		 * que el usuario ha escrito por teclado
		 */
		String textoOriginal = leerCadena(scanner);

		/*
		 * Creo otra variable que guarda el resultado final 
		 * ya dado la vuelta (cadena al reves)
		 */
		String textoInvertido = invertirCadena(textoOriginal);

		System.out.println("Cadena al reves: " + textoInvertido);
	}

}
