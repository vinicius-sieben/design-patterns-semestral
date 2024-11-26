public class TransporteMaritimo implements TransporteStrategy {
    // Transporte marítimo é utilizado apenas para entregas internacionais.
    @Override
    public void realizarEntrega(Encomenda encomenda, Localizacao localizacao) {
        if (!localizacao.getPais().equals("Brasil")) {
            System.out.println("Transporte marítimo disponível apenas para entregas internacionais.");
        } else {
            System.out.println("Transporte marítimo para " + localizacao.getPais() + ". Entrega internacional.");
        }
    }
}
