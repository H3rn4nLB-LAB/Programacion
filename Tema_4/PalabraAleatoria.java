public class PalabraAleatoria {
	
	public static void main(String[] args) {
		
		String Mayuscula = "";
		int maximo = 0;
		int num = 0;
		char character;
		
		while(maximo < 5) {
			
			num = (int)(Math.random()* 26)+65;
			character= (char) num;
			
			Mayuscula = Mayuscula + character;
			maximo++;
			
		}
		
		String textoMinuscula = Mayuscula.toLowerCase();
		System.out.println(Mayuscula);
		System.out.println(textoMinuscula);
		
	}

}
