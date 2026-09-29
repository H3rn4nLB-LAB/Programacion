import java.util.Scanner;

public class Visualizacion_tiempo {
	
	public static void main(String[] args) {

		int segundos;
		int minutos;
		int horas;
		int dias;
		int segundosRestantes;
		
		System.out.println("Este programa calcula el numero de minutos y segundos dada una cantidad de segundos");
		System.out.println("Introduce el numero de segundos");
		Scanner scanner = new Scanner(System.in);
		segundos = scanner.nextInt();
		
		minutos = segundos/60;
		
		horas = minutos/60;
		
		dias = horas/24;
		
		segundosRestantes = minutos % 60;
		
		System.out.println(segundos+" segundos es igual a "+dias+" dias, "+horas+ " horas, "+minutos+ " minutos y "+segundosRestantes+" segundos");
		
	}

}
