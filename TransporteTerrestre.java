public class TransporteTerrestre implements TransporteStrategy {
    public void realizarEntrega(Encomenda encomenda, Localizacao localizacao) {
        System.out.println("Transporte terrestre para " + localizacao.getCidade() + ". Transportadora local necessária.");
    }
}
