public class Localizacao {
    private String cidade;
    private String pais;

    public Localizacao(String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }
}
