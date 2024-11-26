public class Main {
    public static void main(String[] args) {
        // Exemplos de encomendas e localizações
        Encomenda encomenda1 = new Encomenda(50, 100, "Brasil");
        Localizacao localizacao1 = new Localizacao("São Paulo", "Brasil");

        Encomenda encomenda2 = new Encomenda(150, 250, "Brasil");
        Localizacao localizacao2 = new Localizacao("Porto Alegre", "Brasil");

        Encomenda encomenda3 = new Encomenda(200, 50, "Internacional");
        Localizacao localizacao3 = new Localizacao("Lisboa", "Portugal");

        Encomenda encomenda4 = new Encomenda(5, 3, "Brasil");
        Localizacao localizacao4 = new Localizacao("São Paulo", "Brasil");

        Encomenda encomenda5 = new Encomenda(30, 90, "Brasil");
        Localizacao localizacao5 = new Localizacao("Curitiba", "Brasil");

        Encomenda encomenda6 = new Encomenda(120, 180, "Internacional");
        Localizacao localizacao6 = new Localizacao("Buenos Aires", "Argentina");

        Encomenda encomenda7 = new Encomenda(500, 250, "Internacional");
        Localizacao localizacao7 = new Localizacao("Miami", "Estados Unidos");

        // Selecionando o tipo de transporte dinamicamente
        TransporteStrategy transporte1 = TransporteFactory.escolherTransporte(encomenda1, localizacao1);
        transporte1.realizarEntrega(encomenda1, localizacao1);

        TransporteStrategy transporte2 = TransporteFactory.escolherTransporte(encomenda2, localizacao2);
        transporte2.realizarEntrega(encomenda2, localizacao2);

        TransporteStrategy transporte3 = TransporteFactory.escolherTransporte(encomenda3, localizacao3);
        transporte3.realizarEntrega(encomenda3, localizacao3);

        TransporteStrategy transporte4 = TransporteFactory.escolherTransporte(encomenda4, localizacao4);
        transporte4.realizarEntrega(encomenda4, localizacao4);

        TransporteStrategy transporte5 = TransporteFactory.escolherTransporte(encomenda5, localizacao5);
        transporte5.realizarEntrega(encomenda5, localizacao5);

        TransporteStrategy transporte6 = TransporteFactory.escolherTransporte(encomenda6, localizacao6);
        transporte6.realizarEntrega(encomenda6, localizacao6);

        TransporteStrategy transporte7 = TransporteFactory.escolherTransporte(encomenda7, localizacao7);
        transporte7.realizarEntrega(encomenda7, localizacao7);

    }
}