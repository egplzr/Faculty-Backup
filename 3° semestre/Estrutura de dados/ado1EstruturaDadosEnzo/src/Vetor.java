public class Vetor {
    //Criando uma classe vetor similar a classe ArrayList, para fins de estudo;

    public MateriaPrima[] elementos;
    public int count;

    public Vetor(int tamanho){
        this.elementos = new MateriaPrima[tamanho];
        this.count = 0;
    }

    public void adicionar(MateriaPrima materiaPrima) {
        this.aumentarTamanho();
        this.elementos[this.count] = materiaPrima;
        this.count++;
    }

    public int buscar(String nome){
        for (int i = 0; i < this.count; i++){
            if (elementos[i].getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }

    public boolean alterar(int posicao, MateriaPrima materiaPrima){
        if(!(posicao >= 0 && posicao < count)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.elementos[posicao] = materiaPrima;
        return true;
    }

    public void remover(int posicao){
        if(!(posicao >= 0 && posicao < count)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.count -1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        count--;
    }

    private void aumentarTamanho(){
        if (this.count == this.elementos.length) {
            MateriaPrima[] nmp = new MateriaPrima[this.elementos.length * 2];

            System.arraycopy(this.elementos, 0, nmp, 0, this.count);

            this.elementos = nmp;
        }
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("-----------------------------------------\n");

        for (int i = 0; i < this.count-1; i++){
            s.append(this.elementos[i]);
            s.append("-----------------------------------------\n");
        }

        if (this.count > 0) {
            s.append(this.elementos[this.count-1]);
        }

        s.append("-----------------------------------------\n");
        return s.toString();
    }
}
