package exerciciosEnzinguita;

public class Fibo {

	public static void main(String[] args) {
		// Sequencia de Fibonacci:
		
		int a, b, c, i;
		
		a = 0;
		System.out.print(a + " >> ");
		b = 1;
		System.out.print(b + " >> ");
		
		for (i = 0; i < 10; i++) {
			c = a + b;
			System.out.print(c + " >> ");
			a = b;
			b = c;
		}

	}

}
