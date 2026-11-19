public class Array8 {

	public static void main(String[] args) {

		int[] numeros = new int[100];
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (i + 1) * 2;
		}

		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		
		System.out.println("La suma de los 100 primeros numeros pares es: "+suma);

	}

}
