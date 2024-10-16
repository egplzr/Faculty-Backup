import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String classe, nome;
        double peso;

        System.out.println("Quantos produtos serão adicionados na prateleira?");
        int quant = s.nextInt();
        Vetor v = new Vetor(quant);
        MateriaPrima[] matPi = new MateriaPrima[quant];

        for (int i = 0; i <= quant - 1; i++) {
            System.out.printf("Digite em ordem a classe, o nome e o peso em mg da %d° matéria prima:\n", i + 1);
            classe = s.next();
            nome = s.next();
            peso = s.nextDouble();

            matPi[i] = new MateriaPrima(classe, nome, peso);
            v.adicionar(matPi[i]);
        }

        boolean x = true;
        do {
            System.out.println("""
                ==========================================
                          
                                Opções:
                                
                1. Visualizar prateleira;
                2. Buscar matéria prima na prateleira;
                3. Adicionar matéria prima à prateleira;
                4. Excluir matéria prima da prateleira;
                5. Alterar matéria prima da prateleira;
                
                ==========================================
                """);

            escolhas(s.nextInt(), v);
            System.out.println("Retornar ao menu? [s/n]");
            if (s.next().equalsIgnoreCase("n")) {
                System.out.println("Encerrando programa...");
                break;
            }
        } while (x);
    }

    public static void escolhas(int opcao, Vetor v) {

        switch (opcao) {
            case 1:
                System.out.println(v.toString());

                break;
            case 2:
                System.out.println("Digite o nome da matéria prima que deseja buscar para procurar sua posição na prateleira: ");
                System.out.println(v.buscar(s.next()));

                break;
            case 3:
                System.out.println("Digite a classe, nome e peso da matéria prima para adiciona-la: ");
                v.adicionar(new MateriaPrima(s.next(), s.next(), s.nextDouble()));

                break;
            case 4:
                System.out.println("Digite a posição da matéria prima que deseja excluir:");
                v.remover(s.nextInt());

                break;
            case 5:
                System.out.println("Digite a posição da matéria prima na prateleira e as novas classe, nome, peso: ");
                v.alterar(s.nextInt(), new MateriaPrima(s.next(), s.next(), s.nextDouble()));

                break;
        }
    }
}
