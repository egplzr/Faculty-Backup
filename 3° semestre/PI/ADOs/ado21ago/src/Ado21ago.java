import javax.swing.*;

public class Ado21ago {
    //ALUNO: Enzo Guedes Pelizaro, TURMA A, 3°Semestre;
    public static void main(String[] args) throws Exception {
        int linhas, colunas;
        boolean continuar = true;
        while(continuar) {
            linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de linhas da matriz: "));
            colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de colunas da matriz: "));
            Matriz m = new Matriz(linhas, colunas);
            int num;
            for (int i = 0; i < 16; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para adicioná-lo à matriz: "));
                m.add(num);
            }

            String finalMsg = String.format("""
                    %s
                    
                    Soma de todos os números: %d
                    Maior número da matriz: %d
                    Menor número da matriz: %d
                    Soma da diagonal principal: %d
                    Soma da diagonal secundária: %d
                    Soma da diagonal principal com a secundária: %d
                    """,m.printMatriz(), m.somaElementosMatriz(), m.maiorNumero(), m.menorNumero(), m.sDiagonalPrincipal(), m.sDiagonalSecundaria(), m.sDiagonalPrincipal() + m.sDiagonalSecundaria());

            JOptionPane.showMessageDialog(null, finalMsg);

            String escolha = JOptionPane.showInputDialog(null, "Deseja continuar? [S/N]");
            if(escolha.equalsIgnoreCase("n")){
                continuar = false;
            }
        }

    }
}
