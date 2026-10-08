import java.util.Scanner;

public class NotaProgramacion {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer control: ");
		double nota1 = scanner.nextInt();
		
		System.out.println("Introduce la nota del segundo control: ");
		double nota2 = scanner.nextInt();
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 5) {
			System.out.println("Tu nota de Programacion es: "+media+ " - ¡Aprobado!");
		}else {
			System.out.println("Cual ha sido el resultado de la recuperacion? (apto/ no apto) ");
			String recuperacion = scanner.next();
			
			if(recuperacion.equals("apto")) {
				media = 5;
				System.out.println("Tu nota de programacion es: "+ media+ " - Aprobado en recuperacion.");
			} else {
				System.out.println("Tu nota de programacion es: "+media+ " - Suspenso");
			}	
		}
		
		scanner.close();
	}

}
