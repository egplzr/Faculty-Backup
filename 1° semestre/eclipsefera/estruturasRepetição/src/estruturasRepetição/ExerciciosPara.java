package estruturasRepetição;

public class ExerciciosPara {

	public static void main(String[] args) {
		//uso do continue (pula a repetição para a próxima)
		for (int i = 0; i < 100; i++) {
			if(i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}
	}

}
