import java.util.Scanner;

public class NumeroMenor {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		int num1= scanner.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		int num2= scanner.nextInt();
		
		System.out.println("Introduzca el tercer numero: ");
		int num3= scanner.nextInt();
		
		int menor = num1;
		
		if(num2 < menor) {
			menor = num2;
		} else if (num3 < menor){
			menor = num3;
		}
		
		System.out.println("El numero menor de los tres numeros introducidos es: " + menor);
		
		scanner.close();
	}

}
