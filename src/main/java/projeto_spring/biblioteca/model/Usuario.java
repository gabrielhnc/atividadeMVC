package projeto_spring.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String identificacao;

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String identificacao, List<Emprestimo> emprestimo) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo novoEmprestimo) {
        this.emprestimos.add(novoEmprestimo);
    }
}
