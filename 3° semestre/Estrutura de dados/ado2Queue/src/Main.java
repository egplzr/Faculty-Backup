import java.util.Random;
import java.util.Scanner;

public class Main {
    //Enzo Guedes Pelizaro
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        Fila senhas = new Fila();
        int qSenhas = r.nextInt(1, 15);
        Senha.gerarSenha(senhas, qSenhas);

        System.out.println(mostrarMenu(qSenhas));

        int opcao = s.nextInt();

        Senha novaSenha = new Senha();

        if(opcao < 2){
            int n = r.nextInt(0, 49);
            do {
                if (senhas.contem(n)) {
                    n = r.nextInt(0, 49);
                } else {
                    break;
                }
            } while (true);
            novaSenha = new Senha(n, opcao, senhas.tamanho());
            senhas.enfileirar(novaSenha);
            senhas.organizarPorTipo();

            System.out.println(senhas);
            System.out.println("Sua senha é " + novaSenha + " | Lugar na fila: " + (senhas.busca(novaSenha) + 1 + "\n"));

        }else{
            System.out.println("Saindo...");
        }

        int atendimentoPreferencial = 0;

        while(true){

            if (senhas.espiar().equals(novaSenha)) {
                System.out.println("Chegou sua vez!!");
                break;
            }

            if (atendimentoPreferencial != 2) {

                if (senhas.espiar().getTipo() == 1) {
                    atendimentoPreferencial++;
                }

                System.out.println("Proximo: " + senhas.espiar());
                atender(senhas);

            } else {

                for (int j = 0; j < senhas.tamanho(); j++) {
                    if (senhas.busca(j).getTipo() == 0) {

                        System.out.println("Proximo: " + senhas.busca(j));

                        atenderPreferencial(senhas, j);
                        break;
                    }
                }
                atendimentoPreferencial = 0;
            }

            System.out.println(senhas);
            System.out.println();

        }
    }

    public static String mostrarMenu(int qSenhas){
        return """
                Bem vindo!
                
                Pessoas na fila: %d
                
                O que deseja fazer?
                0- Retirar senha;
                1- Retirar senha preferencial;
                2- Sair.
                """. formatted(qSenhas);
    }

    public static void atender(Fila senhas) {
        System.out.print(senhas.espiar() + " Atendido");
        senhas.desenfileirar();
        System.out.println(", faltam " + senhas.tamanho() + " pessoas!");
    }

    public static void atenderPreferencial(Fila senhas, int indice) {
        System.out.print(senhas.busca(indice) + " Atendido");
        senhas.remove(indice);
        System.out.println(", faltam " + senhas.tamanho() + " pessoas!");
    }
}
