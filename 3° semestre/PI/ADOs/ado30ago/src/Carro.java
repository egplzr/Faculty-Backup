public class Carro {
    //Author: Enzo Guedes Pelizaro
    private final String marca;
    private final String modelo;
    private final String cor;
    private final int anoFabricacao;
    private boolean ligado = false;
    private int velocidade;

    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public String ligarCarro(){
        if(this.ligado){
            return "O carro já está ligado.";
        } else {
            ligado = true;
            return "O carro ligou.";
        }
    }

    public String desligarCarro(){
        if(this.ligado){
            ligado = false;
            return "O carro desligou";
        } else {
            return "O carro já está desligado.";
        }
    }

    public String acelerar(int v){
        if(this.ligado) {
            if(v >= 120){
                this.velocidade = 120;
                return "Velocidade máxima permitida = 120Km/h";
            }else{
                this.velocidade += v;
                return String.format("O veículo acelerou %dKm/h\nVelocidade atual: %d", v, this.velocidade);
            }
        }else{
            return "O veículo está desligado.";
        }
    }

    public String desacelerar(int v){
        if(this.ligado) {
            if(this.velocidade == 0){
                return "O carro está parado, impossível desacelerar. 0Km/h";
            }else if (this.velocidade - v < 0){
                return "Impossível desacelerar. Velocidade atual: " + this.velocidade;
            }else{
                this.velocidade -= v;
                return String.format("O veículo desacelerou %dKm/h\nVelocidade atual: %d", v, this.velocidade);
            }
        }else{
            return "O veículo está desligado.";
        }
    }

    public String marcha(){
        if(this.velocidade <= 0){
            return "Neutro";
        }else if(this.velocidade<=20){
            return "1ª marcha";
        }else if(this.velocidade<=40){
            return "2ª marcha";
        } else if(this.velocidade<=60) {
            return "3ª marcha";
        } else if (this.velocidade<=80) {
            return "4ª marcha";
        } else if (this.velocidade<=120) {
            return "5ª marcha";
        } else {
            return "Velocidade não permitida";
        }
    }

    public String statusCarro(){
        return String.format("""
                Marca: %s | Modelo: %s
                Cor: %s | Ano: %d
                Velocidade: %d
                Marcha: %s
                """, this.marca, this.modelo, this.cor, this.anoFabricacao, this.velocidade, this.marcha());
    }
}
