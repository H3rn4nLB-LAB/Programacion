import java.util.Scanner;

public class CalificacionNota {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		double nota = scanner.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.print("Nota invalida");
		} else if (nota >= 9) {
			System.out.print("Sobresaliente");
		} else if (nota >= 7) {
			System.out.print("Notable");
		} else if (nota >= 6) {
			System.out.print("Bien");
		} else if (nota >= 5) {
			System.out.print("Aprobado");
		} else {
			System.out.print("Suspenso");
		}

	}

}
