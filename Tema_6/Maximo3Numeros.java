import java.util.Scanner;

public class Maximo3Numeros {
	
	public static int maximo(int num1, int num2, int num3) {
		
		return FuncionMaximo.maximo(FuncionMaximo.maximo(num1, num2), num3);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Introduce el tercer numero: ");
		int num3 = scanner.nextInt();
		
		System.out.println("El maximo es: "+maximo(num1, num2, num3));
		
		
	}

}
