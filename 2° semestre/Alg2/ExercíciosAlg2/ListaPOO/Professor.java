package ListaPOO;

public class Professor {
    double totalAlunos, totalAprovados, aulasAtribuidas;

    public Professor (double totalAlunos, double totalAprovados, double aulasAtribuidas){
        this.aulasAtribuidas = aulasAtribuidas;
        this.totalAlunos = totalAlunos;
        this.totalAprovados = totalAprovados;
    }

    public void promocao(){
        double porcentagemAprovados = (totalAprovados / totalAlunos) * 100;

        if (porcentagemAprovados < 75){
            System.out.println("NÃO PROMOVIDO");
        } else {
            System.out.println("PROMOVIDO");
        }
    }

    public void bonificacao(){
        if (aulasAtribuidas >= 30){
            System.out.println("BONIFICADO");
        } else {
            System.out.println("Não Bonificado");
        }
    }
}
