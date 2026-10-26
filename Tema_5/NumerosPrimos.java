public class NumerosPrimos {

	public static void main(String[] args) {

		for (int num = 2; num <= 50; num++) {

			boolean esPrimo = true;

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					esPrimo = false;
				}
			}

			if (esPrimo) {
				System.out.println(num);
			}

		}

	}

}
