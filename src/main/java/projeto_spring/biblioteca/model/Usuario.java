package projeto_spring.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String identificacao;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String identificacao) {
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

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo novoEmprestimo) {
        this.emprestimos.add(novoEmprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.remove(emprestimo);
    }
}
