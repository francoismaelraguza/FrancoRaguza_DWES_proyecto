package com.web.francoraguza_dwes_proyecto.Controller;

import com.web.francoraguza_dwes_proyecto.Model.Trainer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    public Trainer trainerActual;
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("trainer", new Trainer());
        return "index";
    }

    @PostMapping("/login")
    public String enviarUsuario(@Valid @ModelAttribute("trainer") Trainer trainer, BindingResult errores){
        if (errores.hasErrors()){
            return "index";
        }
        trainerActual = trainer;
        return "redirect:/pokemon";
    }

    @GetMapping("/pokemon")
    public String pokeLista(Model model){
        model.addAttribute("trainer", trainerActual);
        return "pokemon";
    }
}
