import java.util.Scanner;
import java.text.DecimalFormat;

public class NotasRedondeadas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	  	DecimalFormat df = new DecimalFormat("#.0"); 
		
	    double[] notas = new double[5];
	    
	    for(int i = 0; i < notas.length; i++) {
	    	
	    	System.out.print("Introduce la nota "+ (i+1)+": ");
	    	
	    	notas[i] = scanner.nextDouble();
	    	
	    }
	    
	    double total = 0;
	    double max = 0;
	    double min = 999;

	    for(int i = 0; i < notas.length; i++) {
	    	
	    	total = total + notas[i];
	    	
	    	if(notas[i] > max) {
	    		max = notas[i];
	    	}
	    	
	    	if(notas[i] < min) {
	    		min = notas[i];
	    	}
	    	
	    	double redondeadoAlza = (double) Math.round(notas[i]*100)/100;
	    	
	    	System.out.println("Redondeado al alza de nota "+(i+1)+" : "+df.format(redondeadoAlza));
	    	
	    	double redondeadoBaja = (double) Math.floor(notas[i]*10)/10;
	    	
	    	System.out.println("Redondeado a la baja de nota "+(i+1)+" : "+df.format(redondeadoBaja));
	    	
	    	System.out.println("Notas en unidades de nota "+(i+1)+" : "+(int) notas[i]);
	    	
	    	
	    	
	    }
	    
	    double media = total/notas.length;
	    
	    System.out.println("La media es de: "+media);
	    
	    System.out.println("La nota maxima es: "+max);
	    
	    System.out.println("La nota minima es: "+min);
	    
		
	}

}
