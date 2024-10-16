package ago20;

public class Vetor {
    //Criando uma classe vetor similar a classe ArrayList, para fins de estudo;

    public String[] elementos;
    public int count;

    public Vetor(int tamanho){
        this.elementos = new String[tamanho];
        this.count = 0;
    }

    public void adicionar(String elemento) throws Exception{
        if (this.count < this.elementos.length){
            this.elementos[this.count] = elemento;
            this.count++;
        } else {
            throw new Exception("O vetor está cheio, " +
                    "não é possível adicionar novos elementos");
        }
    }

    public int tamanho(){
        return this.count;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.count-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.count > 0) {
            s.append(this.elementos[this.count-1]);
        }

        s.append("]");
        return s.toString();
    }

    public int busca1(String elemento){
        for (int i = 0; i < this.count; i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio (int posicao, String elemento) throws Exception{
        if(posicao >= 0 && posicao < count){
            for(int i = this.count-1; i > posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.count++;
        } else {
            throw new Exception("Posição Inválida");
        }

        return true;
    }
}
