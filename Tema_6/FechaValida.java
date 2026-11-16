import java.util.Scanner;

public class FechaValida {
	
	public static int LeeDiaValido() {
		
		Scanner scanner = new Scanner(System.in);
		
		int dia = 0;
		
		do {
			System.out.print("Introduce un dia del 1 al 31: ");
			dia = scanner.nextInt();
			
			if(dia<1 || dia >31) {
				System.out.println("DIA INVALIDO");
			}
			
		}while(dia<1 || dia >31);
		
		return dia;
	}
	
	public static int LeeMesValido() {
		
        Scanner scanner = new Scanner(System.in);
		
		int mes = 0;
		
		do {
			System.out.print("Introduce un mes del 1 al 12: ");
			mes = scanner.nextInt();
			
			if(mes<1 || mes >12) {
				System.out.println("MES INVALIDO");
			}
			
		}while(mes<1 || mes >12);
		
		return mes;
		
	}
	
	public static int LeeAñoValido() {
		
        Scanner scanner = new Scanner(System.in);
		
		int año = 0;
		
		do {
			System.out.print("Introduce un año del 1926 al 2126: ");
			año = scanner.nextInt();
			
			if(año < 1926 || año > 2126) {
				System.out.println("AÑO INVALIDO");
			}
			
		}while(año < 1926 || año > 2126);
		
		return año;
		
	}
	
	public static int DiaSemana(int dia, int mes, int año) {
		
		int a, b, c;
		
		if(mes <= 2) {
			
			a = mes +10;
			b = (año-1) % 100;
			c = (año-1)/100;
			
		} else {
			
			a = mes-2;
			b = año % 100;
			c = año/100;
		}
		
		return (700 + (26 * a -2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;
		
	}
	
	public static String DiaEnLetra(int nDia) {
		
		switch(nDia) {
		
		case 1: return "lunes";
			
		case 2: return "martes";
		
		case 3: return "miercoles";
		
		case 4: return "jueves";
		
		case 5: return "viernes";
		
		case 6: return "sabado";
		
		case 0: return "domingo";
		
		default: return "desconocido";
		
		}
		
	}

	public static void main(String[] args) {
		
         int dia = LeeDiaValido();
         int mes = LeeMesValido();
		 int año = LeeAñoValido();
		 
		 int diaSemana = DiaSemana(dia, mes, año);
		 
		 String diaLetra = DiaEnLetra(diaSemana);
		 
		 System.out.println("La fecha introducida es: "+diaLetra);
	}

}
