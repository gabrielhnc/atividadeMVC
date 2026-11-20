package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import projeto_spring.biblioteca.model.Categoria;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    public static final List<Categoria> categorias = new ArrayList<>(List.of(
        new Categoria("Romance", "16+"),
        new Categoria("Infantil", "4+"),
        new Categoria("Ação", "16+")
    ));

    @GetMapping
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categorias);
        return "categorias/inicio";
    }

    @PostMapping
    public String cadastrarCategoria(@ModelAttribute Categoria categoria) {
        categorias.add(categoria);
        return "redirect:/categorias";
    }

    @PutMapping("/atualizar/{indice}")
    public String atualizarCategoria(@PathVariable int indice, @ModelAttribute Categoria categoria) {
        if (indice >= 0 && indice < categorias.size()) {
            categorias.get(indice).setNome(categoria.getNome());
            categorias.get(indice).setClassificacao(categoria.getClassificacao());
        }
        return "redirect:/categorias";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluirCategoria(@PathVariable int indice) {
        if (indice >= 0 && indice < categorias.size()) {
            categorias.remove(indice);
        }
        return "redirect:/categorias";
    }
}
