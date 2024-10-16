package ListaPOO;

public class Aluno {
    double n1, n2, n3, n4;
    double totalAulas, totalFaltas;

    public Aluno (double n1, double n2, double n3, double n4, double totalAulas, double totalFaltas){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.totalAulas = totalAulas;
        this.totalFaltas = totalFaltas;
    }

    public void avaliarNotas(){
        double media = (n1 + n2 + n3 + n4) / 4;

        if (media < 7){
            System.out.println("REPROVADO | ABAIXO DA MÉDIA");
        } else {
            System.out.println("APROVADO");
        }
    }

    public void avaliarPresenca(){
        double porcentagem = ((totalAulas - totalFaltas) / totalAulas) * 100;

        if (porcentagem < 75){
            System.out.println("REPROVADO | FALTAS ESTOURADAS");
        } else {
            System.out.println("APROVADO");
        }
    }
}


