package projeto_spring.biblioteca.model;

import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime prazoEntrega;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime prazoEntrega) {
        this.dataEmprestimo = dataEmprestimo;
        this.prazoEntrega = prazoEntrega;
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
}
