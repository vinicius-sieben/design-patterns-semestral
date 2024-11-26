public class Encomenda {
    private double peso;
    private double dimensao;
    private String destino;

    public Encomenda(double peso, double dimensao, String destino) {
        this.peso = peso;
        this.dimensao = dimensao;
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensao() {
        return dimensao;
    }

    public String getDestino() {
        return destino;
    }
}
