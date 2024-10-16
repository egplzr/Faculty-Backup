package exerciciosaularecursao;

public class ExercicioFatorial {

    public static int fatInte(int fat) {
        if (fat < 0) {
            return -1;
        } else {
            int produto = 1;
            for (int i = fat; i > 0; i--) {
                produto *= i;
            }
            return produto;
        }
    }

    public static int fatRecu(int n) {
        if (n == 0) {
            return 1;
        }
        n *= fatRecu(n - 1);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(fatInte(5));
        System.out.println(fatRecu(4));

    }
}
