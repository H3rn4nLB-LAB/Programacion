public class SueldoMayorMenor {
	
	private static String[] nombres = {
			 "Ana", "Luis", "Carlos", "Marta", "Javier",
		     "Lucia", "Pedro", "Sofia", "David", "Elena",
		     "Pablo", "Laura", "Diego", "Carmen", "Jorge",
		     "Paula", "Raul", "Alba", "Ivan", "Sara",
		     "Mario", "Nuria", "Sergio", "Irene", "Hugo",
		     "Clara", "Adrian", "Natalia", "Ruben", "Eva"	
	};
	
	private static int[] horasTrabajadas = {
			 40, 35, 45, 20, 38,
		     42, 30, 50, 25, 36,
		     44, 28, 39, 41, 32,
		     48, 22, 37, 43, 29,
		     46, 31, 34, 47, 26,
		     33, 49, 27, 38, 40
	};
	
	public static void mostrarSueldoMayorMenor() {
		
		int precioHora = 20;
		int indiceMAX = 0;
		int indiceMIN = 0;
		
		for(int i = 1; i < horasTrabajadas.length; i++) {
			
			if(horasTrabajadas[i] > horasTrabajadas[indiceMAX]) {
				indiceMAX = i;
			} 
			
			if(horasTrabajadas[i] < horasTrabajadas[indiceMIN]) {
				indiceMIN = i;
			} 
		}
		
		int sueldoMAX = horasTrabajadas[indiceMAX]*precioHora;
		int sueldoMIN = horasTrabajadas[indiceMIN]*precioHora;
		
		System.out.println("El empleado que mas gana es: "+nombres[indiceMAX]+" ("+sueldoMAX+" €)");
		System.out.println("El empleado que menos gana es: "+nombres[indiceMIN]+" ("+sueldoMIN+" €)");
	}

	public static void main(String[] args) {
		
		mostrarSueldoMayorMenor();
	}

}
