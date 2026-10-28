import java.util.Scanner;

public class CuadradoNumerico {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int N = scanner.nextInt();
		
		for(int i = 1; i<= N; i++) {
			
			for(int j = 1; j<=N; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
