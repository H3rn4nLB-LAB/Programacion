import java.util.Scanner;

public class Edad {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = scanner.nextInt();
		
		if(edad > 18) {
			System.out.println("Eres mayor de edad");
		} else if (edad < 18) {
			System.out.println("Eres menor de edad");
		}else {
			System.out.println("La edad introducida no es valida");
		}
		
		scanner.close();
	}

}
