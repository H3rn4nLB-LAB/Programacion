public class Quiniela {
	
	public static void main(String[] args) {
		
		System.out.println("Quiniela al azar");
		
		for(int i=1; i<=15; i++){
			
			int numero = (int) (Math.random()*5) + 1;

            System.out.print("Partido "+i+": [ ");
            
            if(numero >= 1 && numero <=3) {
            	System.out.print("1");
            } else if (numero == 4) {
            	System.out.print("X");
            } else {
            	System.out.print("2");
            }
			
			System.out.println(" ]");
			
		}	
	}

}
