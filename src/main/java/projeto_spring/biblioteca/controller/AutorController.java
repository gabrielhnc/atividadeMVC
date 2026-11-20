package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import projeto_spring.biblioteca.model.Autor;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    private final List<Autor> autores = new ArrayList<>(List.of(
            new Autor("Marcos", "Brasileiro", 10),
            new Autor("Joao Pedro", "Brasileiro", 50)
    ));

    @GetMapping
    public String listarAutores(Model model) {
        model.addAttribute("autores", autores);

        return "autores/inicio";
    }

    @PostMapping
    public String cadastrarAutor(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autores";
    }

    @PutMapping("/atualizar/{indice}")
    public String atualizarAutor(@PathVariable int indice, @ModelAttribute Autor autor) {
        if (indice >= 0 && indice < autores.size()) {
            autores.set(indice, autor);
        }
        return "redirect:/autores";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluirAutor(@PathVariable int indice) {
        if (indice >= 0 && indice < autores.size()) {
            autores.remove(indice);
        }
        return "redirect:/autores";
    }
}
