import java.util.Random;

public class Quiniela {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println("Quiniela al azar");
		
		for(int i=1; i<=15; i++){
			
			int numero = random.nextInt(6) + 1;

            System.out.print("Partido "+i+": [ ");
            
            if(numero >= 1 && numero <=3) {
            	System.out.print("1");
            } else if (numero == 4 || numero == 5) {
            	System.out.print("X");
            } else if(numero == 6) {
            	System.out.print("2");
            }
			
			System.out.println(" ]");
			
		}	
	}

}
