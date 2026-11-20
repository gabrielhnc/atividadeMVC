package projeto_spring.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import projeto_spring.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>(List.of(
        new Usuario("Ana Silva", "123456789"),
        new Usuario("Carlos Souza", "987654321")
    ));

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarios);
        return "usuarios/inicio";
    }

    @PostMapping
    public String cadastrarUsuario(@ModelAttribute Usuario usuario) {
        usuarios.add(usuario);
        return "redirect:/usuarios";
    }

    @PutMapping("/atualizar/{indice}")
    public String atualizarUsuario(@PathVariable int indice, @ModelAttribute Usuario usuario) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.set(indice, usuario);
        }
        return "redirect:/usuarios";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluirUsuario(@PathVariable int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
        }
        return "redirect:/usuarios";
    }
}
