import java.util.Scanner;


public class Horoscopo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("HOROSCOPO");
		System.out.println("\nIntroduce tu dia de nacimiento: ");
		int dia = scanner.nextInt();
		
		System.out.println("\nIntroduce tu mes de nacimiento");
		int mes = scanner.nextInt();
		
		String signo = "";
		boolean fechaValida = true;
		
		
		if(mes < 1 || mes > 12 || dia < 1 || dia > 31) {
			
			fechaValida = false;     
			
		}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)&& dia > 30) {
			
			fechaValida = false;   //Para los meses con 30 dias
			
		}else if (mes == 2 && dia>29) {
			
			fechaValida = false;  //Para el mes de feberero, que tiene 29 dias en año bisiesto.
			
		}
		
		
		if(!fechaValida) {
			System.out.println("La fecha introducida no es valida");
		} else {
			
			if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                signo = "Aries";
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                signo = "Tauro";
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                signo = "Géminis";
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                signo = "Cáncer";
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                signo = "Leo";
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                signo = "Virgo";
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                signo = "Libra";
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                signo = "Escorpio";
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                signo = "Sagitario";
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                signo = "Capricornio";
            } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                signo = "Acuario";
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                signo = "Piscis";
            }
			
			System.out.println("\nTu signo del zodiaco es: "+signo);
			
		}
		
		scanner.close();

	}

}
