package projeto_spring.biblioteca.model;

import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime prazoEntrega;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime prazoEntrega, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.prazoEntrega = prazoEntrega;
        this.livro = livro;
        this.usuario = usuario;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDateTime prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
