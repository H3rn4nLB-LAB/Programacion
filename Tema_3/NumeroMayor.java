import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		int num1= scanner.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		int num2= scanner.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero "+num1+" es mayor que el numero "+num2);
		} else if(num2>num1){
			System.out.println("El numero "+num2+" es mayor que el numero "+num1);
		} else {
			System.out.println("Ambos numeros son iguales");
		}
		
		scanner.close();
	}

}
