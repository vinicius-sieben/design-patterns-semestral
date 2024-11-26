public class TransporteFactory {
    public static TransporteStrategy escolherTransporte(Encomenda encomenda, Localizacao localizacao) {
        // Caso de encomendas com drones (apenas em áreas metropolitanas e pacotes pequenos)
        if (localizacao.getPais().equals("Brasil") && localizacao.getCidade().equals("São Paulo") && encomenda.getDimensao() <= 10) {
            return new TransporteDrone();
        }

        // Caso de transporte marítimo (internacional)
        if (!localizacao.getPais().equals("Brasil") || localizacao.getPais().equals("Internacional")) {
            return new TransporteMaritimo();
        }

        // Caso de transporte aéreo (se as dimensões e peso forem adequados)
        if (encomenda.getPeso() <= 100 && encomenda.getDimensao() <= 200) {
            return new TransporteAereo();
        }

        // Caso de transporte terrestre (Brasil)
        if (localizacao.getPais().equals("Brasil")) {
            return new TransporteTerrestre();
        }

        // Se não há nenhum transporte disponível, lança uma exceção
        throw new IllegalArgumentException("Não há transporte disponível para as condições fornecidas.");
    }
}
