import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.println("Este programa evalua expresiones algoritmicas");
		
		a=2; b=5;
		
		System.out.println("a) 3 * A + B – 6 / A = ");
		System.out.println(3 * a + b - 6 / a);
		
		
		a=4; b=5; c=1;
		
		System.out.println("b) B * A – B * B / 4 * C");
		System.out.println(b*a - b*b/4*c);
		
		
		a=4; b=5;
		
		System.out.println("c) (A * B) / 9 ");
		System.out.println((a*b)/9);
		
		
		a=4; b=5; c=1;
		
		System.out.println("d) (((B + C) / 2 * A + 10) * 3 * B) – 6");
		System.out.println((((b+c)/2*a+10)*3*b)-6);
		
		
		a=4; c=1;
		
		System.out.println("e) 3 > A && ! C / 2 == 0. 5 ");
		System.out.println("Esta expresion no esta bien planteada.");
		
		
		a=4; b=2; c=20;
		
		System.out.println("f) (A+ B) / 2 >= 3 || C != 20 ");
		System.out.println("Esta expresion no esta bien planteada.");
		
		
		System.out.println("g) 5 + 25 % 2");
		System.out.println(5+25%2);
		
		
		System.out.println("h) (5+25) % 2 "); 
		System.out.println((5+25) % 2 );
		
		
		System.out.println("i) 5+25 / 10");
		System.out.println(5+25/10);
		
		
		System.out.println("j) -2*2 ");
		System.out.println(-2*2);
		
		
        System.out.println("k) (-2)*2");
        System.out.println((-2)*2);
        
        
        System.out.println("l) -(2*2)");
        System.out.println(-(2*2));
        
        
        System.out.println("m) -Math.pow(2, 2)");
        System.out.println(-Math.pow(2, 2));
        
        
        System.out.println("n) Math.pow(-2,2) ");
        System.out.println(Math.pow(-2,2) );
        
        
        System.out.println("o) -(Math.pow(2,2))");
        System.out.println(-(Math.pow(2,2)));
		
	}
	
}
