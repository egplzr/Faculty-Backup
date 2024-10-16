public class Aluno {

    double n1, n2, n3, n4;
    double tAulas;
    double tFaltas;
    
    public Aluno(double n1, double n2, double n3, double n4, double tAulas, double tFaltas){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
        this.tAulas=tAulas;
        this.tFaltas=tFaltas;
}
    public void avaliarNotas(){
        double media = (n1+n2+n3+n4)/4;
        if (media < 7){
            System.out.println("REPROVADO | MÉDIA: " + media);
        } else {
            System.out.println("APROVADO | MÉDIA: " + media);
 
        }
    }
    
    public void avaliarFaltas(){
        double freqAluno = (tFaltas * 100) / tAulas;
        if (freqAluno > 75){
            System.out.println("PRESENÇA APROVADA");
        } else {
            System.out.println("PRESENÇA REPROVADA");
        }
    }
    
}    

