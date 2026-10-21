import java.util.Scanner;

public class ExamenTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int max = 100;
		int min = 0;
		int rango = (max - min) + 1;
		boolean[] respuestas = new boolean[5];

		for (int i = 0; i < respuestas.length; i++) {

			int numero1 = (int) ((Math.random() * rango) + min);
			int numero2 = (int) ((Math.random() * rango) + min);

			System.out.print((i + 1) + ") Cuanto es " + numero1 + " + " + numero2 + " : ");
			int numeroUsuario = scanner.nextInt();

			respuestas[i] = numeroUsuario == (numero1 + numero2);

		}

		for (int i = 0; i < respuestas.length; i++) {

			if (respuestas[i]) {
				System.out.println((i + 1) + ") Has acertado");
			} else {
				System.out.println((i + 1) + ") Respuesta incorrecta");
			}

		}

	}

}
