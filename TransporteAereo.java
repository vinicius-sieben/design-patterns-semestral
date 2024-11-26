public class TransporteAereo implements TransporteStrategy {
    // Transporte aéreo deve considerar limites de peso e dimensões das encomendas.
    @Override
    public void realizarEntrega(Encomenda encomenda, Localizacao localizacao) {
        if (encomenda.getPeso() > 100 || encomenda.getDimensao() > 200) {
            System.out.println("Transporte aéreo não disponível para encomendas com peso ou dimensões grandes.");
        } else {
            System.out.println("Transporte aéreo para " + localizacao.getCidade() + ". Verificando limites de peso e dimensões.");
        }
    }
}
