import java.util.Scanner;

public class NumerosAmigos {

	public static int sumaDivisores(int num) {

		int suma = 1;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				suma += i;
			}

		}
		return suma;
	}

	public static boolean sonAmigos(int num1, int num2) {

		int suma1 = sumaDivisores(num1);
		int suma2 = sumaDivisores(num2);

		return suma1 == num2 && suma2 == num1;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer numero: ");
		int numAmigo1 = scanner.nextInt();

		System.out.print("Introduce el segundo numero: ");
		int numAmigo2 = scanner.nextInt();

		if (sonAmigos(numAmigo1, numAmigo2)) {
			System.out.println("Los numeros son amigos");
		} else {
			System.out.println("Los numeros NO son amigos");
		}

	}

}
