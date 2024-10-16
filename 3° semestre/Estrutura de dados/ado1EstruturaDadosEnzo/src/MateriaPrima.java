public class MateriaPrima {
    private String classe;
    private String nome;
    private double peso;

    public MateriaPrima(String classe, String nome, double peso) {
        this.classe = classe;
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString(){
        return """
                Classe: %s
                Nome: %s
                Peso em mg: %f
                """.formatted(this.classe, this.nome, this.peso);
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
