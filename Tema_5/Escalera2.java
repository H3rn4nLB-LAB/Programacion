public class Escalera2 {

	public static void main(String[] args) {
		
		int filas = 4;

		for(int i = 1; i <= filas; i++) {
			
			for(int j = 1; j<=filas - i; j++) {
				
				System.out.print(" ");
	
			}
			
			for(int k = i; k>= 1; k--) {
				
				System.out.print(k);
			}
			
			System.out.println();
			
		}

	}

}
