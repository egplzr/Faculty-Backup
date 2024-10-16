package exerciciosAulaRecursao;

public class ExercicioPinosBoliche {

    public static int pinosIterativo(int nLinha) {

        int nPinos = nLinha;
        int totalPinos = 0;

        for (int i = 0; i <= nPinos; i++) {
            totalPinos += nPinos - i;
        }

        return totalPinos;

    }

    public static int pinosRec(int n) {
        int totalPinos;
        if (n == 1) {
            return 1;
        }
        totalPinos = n + pinosRec(n - 1);
        return totalPinos;
    }

    public static void main(String args[]) {
        System.out.println(pinosIterativo(5));
        System.out.println(pinosRec(5));
    }

}
