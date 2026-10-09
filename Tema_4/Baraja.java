public class Baraja {
	
	public static void main(String[] args) {
		
		int numeroPalo = (int)(Math.random() * 4)+1;
		int numeroCarta = (int)(Math.random() * 13)+1;
		
		String palo = "";
		String valorCarta = "";
		
		switch(numeroPalo) {
		    case 1: palo = "Picas"; 
		    break;
		    
		    case 2: palo = "Corazones"; 
		    break;
		    
		    case 3: palo = "Diamantes"; 
		    break;
		    
		    case 4: palo = "Treboles"; 
		    break;
		}
		
		switch (numeroCarta) {
		    case 1:  
		    	valorCarta = "A (1)"; 
		    	break;
		    	
            case 11: 
            	valorCarta = "J"; 
                break;
                
            case 12: 
            	valorCarta = "Q"; 
            	break;
            	
            case 13: 
            	valorCarta = "K"; 
            	break;
            	
            default: 

            valorCarta = numeroCarta + ""; 
            break;
		}
		
		System.out.println("Tu carta al azar es: " + valorCarta + " de " + palo);
	}

}
