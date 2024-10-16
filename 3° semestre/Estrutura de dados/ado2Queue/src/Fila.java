public class Fila {
    //Enzo Guedes Pelizaro
    private Senha[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = new Senha[capacidade];
        this.tamanho = 0;
    }

    public Fila() {
        this(10);
    }

    public void enfileirar(Senha senha) {
        aumentaCapacidade();
        this.elementos[tamanho] = senha;
        tamanho++;
    }

    public void adiciona(int indice, Senha senha) {
        aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= indice; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[indice] = senha;
        this.tamanho++;
    }

    public Senha espiar() {
        if (estaVazia()) {
            return null;
        } else {
            return elementos[0];
        }
    }

    public Senha desenfileirar() {
        if (estaVazia()) {
            return null;
        } else {
            Senha elemento = elementos[0];
            remove(0);
            return elemento;
        }
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Senha[] sup = new Senha[this.tamanho * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                sup[i] = this.elementos[i];
            }
            elementos = sup;
        }
    }

    public void organizarPorTipo() {
        int indiceTipo = 0;
        for (int i = 0; i < this.tamanho; i++) {
            if (busca(i).getTipo() == 1) {
                if (i != 0) {
                    Senha senha = busca(i);
                    remove(i);
                    adiciona(indiceTipo, senha);
                }
                indiceTipo++;
            }
        }
    }

    public int busca(Senha senha) {
        for(int i = 0; i < this.tamanho; i++){
            if(senha.getN() == this.elementos[i].getN()){
                return i;
            }
        }

        return -1;
    }


    public boolean estaVazia() {
        if (this.tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(int num) {
        if (estaVazia()) {
            return false;
        } else {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].getN() == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public Senha busca(int indice) {
        if (indice >= 0 && indice < this.tamanho) {
            return this.elementos[indice];
        } else {
            return null;
        }
    }

    public void remove(int indice) {
        for (int i = indice; i < this.tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < this.tamanho; i++) {

            if (i == this.tamanho - 1) {
                sb.append(elementos[i]);
                break;
            }

            sb.append(elementos[i] + ", ");

        }

        sb.append("]");

        return sb.toString();
    }
}
