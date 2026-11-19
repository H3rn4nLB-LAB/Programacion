import java.util.Scanner;

public class Array7 {

	public static double sumar(double[] array) {

		double suma = array[0];

		for (int i = 1; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;
	}

	public static double restar(double[] array) {

		double resta = array[0];

		for (int i = 1; i < array.length; i++) {
			resta = resta - array[i];
		}
		return resta;
	}

	public static double multiplicar(double[] array) {

		double multiplicacion = array[0];

		for (int i = 1; i < array.length; i++) {
			multiplicacion = multiplicacion * array[i];
		}
		return multiplicacion;
	}

	public static double dividir(double[] array) {

		double division = array[0];

		for (int i = 1; i < array.length; i++) {
			division = division / array[i];
		}
		return division;
	}

	public static void main(String[] args) {

		double[] numeros = new double[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}

		System.out.println("Suma = " + sumar(numeros));
		System.out.println("Resta = " + restar(numeros));
		System.out.println("Multiplicación = " + multiplicar(numeros));
		System.out.println("División = " + dividir(numeros));
	}

}
