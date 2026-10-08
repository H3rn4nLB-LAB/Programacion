import java.util.Scanner;

public class AnoBisiesto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un ano: ");
		int ano = scanner.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano% 400 == 0)) {
			System.out.println("El ano es bisiesto");
		}else {
			System.out.println("El ano NO es bisiesto");
		}
		
	}

}
