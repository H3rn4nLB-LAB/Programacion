public static void main(String[] args) {
		
		char c = 0;
		
		int random = (int)(Math.random()*4);
		
	    int maximo = 1;
		
	    if(random == 0) {
	    	c = '&';
	    }else if(random == 1) {
	    	c = '$';
	    }else if(random == 2) {
	    	c = '€';
	    }else if(random == 3) {
	    	c = '#';
	    }
	    
	    while(maximo <= 5) {
	    	System.out.print(c);
	    	maximo++;
	    }
		
	}
