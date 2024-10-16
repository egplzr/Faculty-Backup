package exerciciosEnzinguita;
import java.util.Scanner;
public class Exercicio2prova {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int hEntrada, mEntrada, hSaida, mSaida, hFinal, mFinal;
        double valor = 0;
        String placa, cpf;
        char resp;

        System.out.println("|--------------------------------------------------------------|");
        System.out.println("  BEM VINDO AO ESTACIONAMENTO PARE BEM!");
        System.out.println("  Vamos calcular o valor da sua estadia.");
        System.out.println("   - Digite a placa do seu veículo:");
        placa = scan.next();
        System.out.println("   - Digite a hora de entrada no estacionamento[0-23]:");
        hEntrada = scan.nextInt();
        System.out.println("   - Digite o minuto de entrada no estacionamento[0-59]:");
        mEntrada = scan.nextInt();
        System.out.println("   - Digite a hora de saída no estacionamento[0-23]:");
        hSaida = scan.nextInt();
        System.out.println("   - Digite o minuto de saída no estacionamento[0-59]:");
        mSaida = scan.nextInt();
        System.out.println("|--------------------------------------------------------------|");

        hFinal = hSaida - hEntrada;
		mFinal = mSaida - mEntrada;
		if (hFinal < 0) {
			hFinal += 24;
		}
		if (mFinal < 0) {
			mFinal += 60;
		}
        if (hFinal == 0 && mFinal == 15){
            valor = 0;
        } else if (hFinal >= 0 && mFinal > 15 || hFinal >= 0 && mFinal > 0) {
            hFinal++;
            mFinal = 00;
        }
        if (hFinal == 1){
            valor = 7;
        } else if (hFinal > 1 && hFinal < 3){
            valor = 12;
        } else if (hFinal > 2 && hFinal < 5){
            valor = 18;
        } else if (hFinal > 4 && hFinal < 7){
            valor = 20;
        } else if (hFinal > 6){
            valor = 28;
        }

        System.out.println("  Deseja imprimir o CPF no recibo? [s/n]");
        resp = scan.next().charAt(0);
        if (resp == 's'){
            System.out.println("  Por favor digite seu CPF:");
            cpf = scan.next();
        } else {
            cpf = "NÃO INFORMADO.";
        }

        System.out.println("|--------------------------------------------------------------|");
        System.out.println("                      RECIBO ESTACIONAMENTO");
        System.out.println("|              Rede Pare Bem - Shopping Gaste Bem              |");
        System.out.printf("|   PLACA: %s \n", placa);
        System.out.printf("|   ENTRADA: %2d:%2d \n", hEntrada, mEntrada);
        System.out.printf("|   SAÍDA: %2d:%2d \n", hSaida, mSaida);
        System.out.printf("|   PERMANÊNCIA: %2d:%2d \n", hFinal, mFinal);
        System.out.printf("|   VALOR: R$%5.2f \n", valor);
        System.out.printf("|   CPF: %s \n", cpf);
        System.out.println("                          VOLTE SEMPRE!");
        System.out.println("|--------------------------------------------------------------|");

        scan.close();
    }
}
