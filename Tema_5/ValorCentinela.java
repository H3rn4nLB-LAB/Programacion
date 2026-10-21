import java.util.Scanner;

public class ValorCentinela {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int resultado = 0;
		int entradaUsuario = -1;

		while (entradaUsuario != 0) {

			System.out.print("Introduzca el numero a sumar: ");
			entradaUsuario = scanner.nextInt();

			resultado = resultado + entradaUsuario;
		}

		System.out.println("El resultado de la suma es de " + resultado);

	}

}
