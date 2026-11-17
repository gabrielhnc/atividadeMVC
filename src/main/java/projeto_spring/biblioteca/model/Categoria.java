package projeto_spring.biblioteca.model;

public class Categoria {
    private String nome;
    private String classificacao;

    public Categoria() {
    }

    public Categoria(String nome, String classificacao) {
        this.nome = nome;
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
