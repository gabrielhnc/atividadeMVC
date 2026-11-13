package projeto_spring.biblioteca.model;

public class Categoria {
    private String classificacao;

    public Categoria() {
    }

    public Categoria(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
