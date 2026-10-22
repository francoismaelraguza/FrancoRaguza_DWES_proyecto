package com.web.francoraguza_dwes_proyecto.controller;

import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.model.Trainer;
import com.web.francoraguza_dwes_proyecto.service.LectorPokemon;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public String pokeLista(Model model) throws IOException{
        model.addAttribute("trainer", trainerActual);
        List<Pokemon> listaPokemon = new LectorPokemon().cargar();
        model.addAttribute("listaPokemon", listaPokemon);
        return "pokemon";
    }

    @GetMapping("/pokemon/{id}")
    public String detallePokemon(@PathVariable Integer id, Model model) throws IOException{
        List<Pokemon> listaPokemon = new LectorPokemon().cargar();
        for (Pokemon p: listaPokemon){
            if (id == p.getId()){
                model.addAttribute("pokemon", p);
                return "detallePokemon";
            }
        }
        return "redirect:/notfound";
    }


}
