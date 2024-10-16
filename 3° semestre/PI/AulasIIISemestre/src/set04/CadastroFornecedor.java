package set04;

public class CadastroFornecedor <fornecedor>{
    private fornecedor[] fornecedores;
    private int tamanho;

    public CadastroFornecedor(int comprimento) {
        this.fornecedores = (fornecedor[]) new Object[comprimento];
        this.tamanho = 0;
    }

    public CadastroFornecedor(){
        this(10);
        this.tamanho++;
    }

    public void adicionaFornecedor(fornecedor fornecedorN){
        this.aumentaTamanho();
        this.fornecedores[this.tamanho] = fornecedorN;
        this.tamanho++;
    }

    public void aumentaTamanho(){
        if(this.tamanho == this.fornecedores.length){
            fornecedor[] fornecedoresNovos = (fornecedor[]) new Object[fornecedores.length*2];
            for (int i = 0; i < this.fornecedores.length; i++) {
                fornecedoresNovos[i] = fornecedores[i];
            }

            this.fornecedores = fornecedoresNovos;
        }
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.fornecedores[i]);
            s.append(",\n");
        }

        if(this.tamanho > 0){
            s.append(this.fornecedores[this.tamanho -1]);
        }

        s.append("]");

        return s.toString();
    }
}
