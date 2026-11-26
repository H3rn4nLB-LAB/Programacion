public class ContadorFrecuencuaVocales {

	public static char[] crearArrayVocales() {
		char[] letras = new char[100]; 
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' }; // Array auxiliar con las 5 vocales

		
		for (int i = 0; i < letras.length; i++) {
			int azar = (int) (Math.random() * 5); // Numero aleatorio entre 0 y 4
			
			/*
			 * Se usa el numero al azar para coger una vocal del array vocales y guardarla
			 * en la posicion i del array letras
			 */
			letras[i] = vocales[azar];
		}
		return letras; 
	}

	
	public static int[] contarVocales(char[] letras) {

		int[] contadores = new int[5]; // Se crea un array de 5 numeros enteros para crear un contador para cada vocal

		// Se revisan las 100 letras una a una
		for (int i = 0; i < letras.length; i++) {

			// Según la vocal que haya en la posición i del array, sumamos 1 en su casilla correspondiente
			// Cambiar luego por switch
			switch(letras[i]) {
			
			case 'a': 
				contadores[0]++;
				break;
				
			case 'e':
				contadores[1]++;
				break;
				
			case 'i':
				contadores[2]++;
				break;
				
			case 'o':
				contadores[3]++;
				break;
				
			case 'u':
				contadores[4]++;
				break;
			
			}
		}
		return contadores; // Devuelve el array con la suma total de cada vocal (5 sumas)
	}

	public static void mostrarContadores(int[] contadores) {

		// Las vocales se ponen en el mismo orden que las casillas de 'contadores'
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		// Se recorre las 5 posiciones (de 0 a 4)
		for (int i = 0; i < contadores.length; i++) {

			/*
			 * Se imprime el numero guardado en contadores[i] seguido de su vocal
			 * correspondiente en vocales[i]
			 */
			System.out.println(contadores[i] + " " + vocales[i]);
		}
	}

	public static void main(String[] args) {
		
		char[] letras = crearArrayVocales();
		
		int[] contadores = contarVocales(letras);
		
		System.out.println("Las repeticiones de cada vocal son: ");
		
		mostrarContadores(contadores);

	}

}
