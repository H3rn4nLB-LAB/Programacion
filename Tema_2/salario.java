import java.util.Scanner;

public class CalculoSalario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int precio_hora = 12;
		
		System.out.println("Introduce las horas trabajadas por el empleado esta semana");
		int horasTrabajadas = scanner.nextInt();
		
		int salarioSemanal = horasTrabajadas * precio_hora;
		
		System.out.println("El salario semanal del empleado es: "+salarioSemanal);
		
		scanner.close();
		
	}

}
