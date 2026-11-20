package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import projeto_spring.biblioteca.model.Emprestimo;
import projeto_spring.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    public static final List<Emprestimo> emprestimos = new ArrayList<>();

    @GetMapping
    public String listarEmprestimos(Model model) {
        model.addAttribute("emprestimos", emprestimos);
        model.addAttribute("livros", LivroController.livros);
        return "emprestimos/inicio";
    }

    @PostMapping
    public String cadastrarEmprestimo(@ModelAttribute Emprestimo emprestimo, @RequestParam int livroIndice) {
        emprestimo.setLivro(obterLivro(livroIndice));
        emprestimos.add(emprestimo);
        emprestimo.getUsuario().adicionarEmprestimo(emprestimo);
        return "redirect:/emprestimos";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluirEmprestimo(@PathVariable int indice) {
        if (indice >= 0 && indice < emprestimos.size()) {
            Emprestimo emprestimo = emprestimos.remove(indice);
            emprestimo.getUsuario().removerEmprestimo(emprestimo);
        }
        return "redirect:/emprestimos";
    }

    private Livro obterLivro(int indice) {
        return LivroController.livros.get(indice);
    }
}
