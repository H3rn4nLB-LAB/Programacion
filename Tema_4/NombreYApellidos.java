import java.util.Scanner;

public class NombreYApellidos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre completo: ");
		String nombreCompleto = scanner.nextLine();
		
		int primerEspacio = nombreCompleto.indexOf(" ");
		int segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio + 1);
		
		
		String nombre = nombreCompleto.substring(0, primerEspacio);
		String primerApellido = nombreCompleto.substring(primerEspacio+1, segundoEspacio);
		String segundoApellido = nombreCompleto.substring(segundoEspacio+1);
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Primer apellido: "+primerApellido);
		System.out.println("Segundo apellido: "+segundoApellido);
		
	}

}
