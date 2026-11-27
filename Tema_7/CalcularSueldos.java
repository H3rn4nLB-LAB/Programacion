public class CalcularSueldos {
	
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
	
	public static void calcularSueldos() {
		
		int precioHora = 20;
		
		for(int i = 0; i < nombres.length; i++) {
			int sueldo = horasTrabajadas[i]*precioHora;
			System.out.println(nombres[i]+" cobrara: "+sueldo+" €");
		}
	}

	public static void main(String[] args) {
		
		calcularSueldos();

	}

}
