package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import projeto_spring.biblioteca.model.Autor;
import projeto_spring.biblioteca.model.Categoria;
import projeto_spring.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private static final Categoria categoria = new Categoria("Ação", "16+");

    public static final List<Livro> livros = new ArrayList<>(List.of(
        new Livro("Dom Casmurro", "ISBN-001", new Autor("Pedro", "Brasileiro", 10), categoria),
        new Livro("O Cortiço", "ISBN-002", new Autor("Pedro", "Brasileiro", 10), categoria),
        new Livro("Capitães da Areia", "ISBN-003", new Autor("Pedro", "Brasileiro", 10), categoria)
    ));

    @GetMapping({"/", ""})
    public String listarLivros(Model model) {
        model.addAttribute("livros", livros);
        return "livros/inicio";
    }

    @PostMapping
    public String cadastrarLivro(@ModelAttribute Livro livro) {
        livros.add(livro);
        return "redirect:/livros";
    }

    @PutMapping("/atualizar/{indice}")
    public String atualizarLivro(@PathVariable int indice, @ModelAttribute Livro livro) {
        if (indice >= 0 && indice < livros.size()) {
            Livro atual = livros.get(indice);
            atual.setTitulo(livro.getTitulo());
            atual.setIsbn(livro.getIsbn());
            atual.setAutor(livro.getAutor());
            atual.setCategoria(livro.getCategoria());
        }
        return "redirect:/livros";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluirLivro(@PathVariable int indice) {
        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        }
        return "redirect:/livros";
    }

}
