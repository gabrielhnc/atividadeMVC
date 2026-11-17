package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projeto_spring.biblioteca.model.Autor;
import projeto_spring.biblioteca.model.Categoria;
import projeto_spring.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    public String exibirLivro(Model model) {
        Autor autor = new Autor("Pedro", "Brasileiro", 10);
        Categoria categoria = new Categoria("Ação", "16+");

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "ISBN-001", autor, categoria));
        livros.add(new Livro("O Cortiço", "ISBN-002", autor, categoria));
        livros.add(new Livro("Capitães da Areia", "ISBN-003", autor, categoria));

        model.addAttribute("livro", livros);

        return "livros/inicio";
    }
}