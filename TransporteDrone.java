public class TransporteDrone implements TransporteStrategy {
    // Entrega por drones é limitada a áreas metropolitanas e pequenos pacotes.
    @Override
    public void realizarEntrega(Encomenda encomenda, Localizacao localizacao) {
        if (encomenda.getDimensao() > 10) {
            System.out.println("Entrega por drone disponível apenas para pacotes pequenos.");
        } else if (!localizacao.getCidade().equals("São Paulo")) {
            System.out.println("Entrega por drone disponível apenas em áreas metropolitanas.");
        } else {
            System.out.println("Entrega por drone para " + localizacao.getCidade() + ".");
        }
    }
}
