package com.web.francoraguza_dwes_proyecto.Controller;

import com.web.francoraguza_dwes_proyecto.Model.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    public Usuario usuarioActual;
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "index";
    }

    @PostMapping("/login")
    public String enviarUsuario(@Valid @ModelAttribute("usuario")Usuario usuario, BindingResult errores){
        if (errores.hasErrors()){
            return "index";
        }
        usuarioActual = usuario;
        return "redirect:/pokemon";
    }

    @GetMapping("/pokemon")
    public String pokeLista(Model model){
        model.addAttribute("usuario", usuarioActual);
        return "pokemon";
    }
}
