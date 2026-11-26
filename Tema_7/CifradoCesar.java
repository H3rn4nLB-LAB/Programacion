import java.util.Scanner;

public class CifradoCesar {

	// Metodo para encriptar la cadena (+3 en codigo ASCII)
	public static String encriptar(String cadena) {
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			char letraCifrada = (char) (letra + 3); // Sumamos 3 al codigo ASCII para encriptar cada caracter de la cadena
			resultado += letraCifrada;
		}

		return resultado; // Devuelve la cadena encriptada
	}

	
	// Metodo para desencriptar la cadena (-3 en codigo ASCII) para coprobar si la cadena vuelve a la normalidad
	public static String desencriptar(String cadena) {
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			char letraDescifrada = (char) (letra - 3); // Restamos 3 al codigo ASCII para desencriptar cada caracter de la cadena
			resultado += letraDescifrada;
		}

		return resultado; // Devuelve la cadena desencriptada
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Escribe un mensaje para cifrar: ");
		String textoOriginal = scanner.nextLine(); 

		// Creo una variable para que guarde el texto cifrado en el metodo encriptar
		String textoCifrado = encriptar(textoOriginal);

		System.out.println("Texto encriptado: " + textoCifrado);		

		// Creo una variable para que guarde el texto descifrado en el metododesencriptar
		String textoDescifrado = desencriptar(textoCifrado);
		
		System.out.println("Texto desencriptado: " + textoDescifrado);

	}

}
