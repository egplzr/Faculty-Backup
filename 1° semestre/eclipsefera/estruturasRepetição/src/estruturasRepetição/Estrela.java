package estruturasRepetição;

public class Estrela {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("a");
				if (j == 5) {
					System.out.printf("%n");
				}
			}
		}
	}

}
