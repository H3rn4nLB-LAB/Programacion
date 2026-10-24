import java.util.Scanner;

public class MaximoDivisorComun {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca el primer entero positivo: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Introduzca el segundo entero positivo: ");
		int n2 = scanner.nextInt();
		
		
		int mcd = 1;
		
		int k = 2;
		
		while(k <= n1 && k <= n2) {
			
			if(n1 % k == 0 && n2 % k == 0) {
				mcd = k;
			}
			k++;
		}
		
		System.out.println("El maximo divisor comun para "+n1+" y "+n2+" es: "+mcd);

	}

}
