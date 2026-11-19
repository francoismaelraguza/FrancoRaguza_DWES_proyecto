package com.web.francoraguza_dwes_proyecto.controller;

import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.model.Trainer;
import com.web.francoraguza_dwes_proyecto.repository.PokemonRepositoryImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
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
        return "redirect:/pokemons";
    }

    @GetMapping("/pokemons")
    public String pokeLista(Model model) throws IOException{
        model.addAttribute("trainer", trainerActual);
        List<Pokemon> listaPokemon = new PokemonRepositoryImpl().cargar();
        model.addAttribute("listaPokemon", listaPokemon);
        return "pokemon";
    }

    @GetMapping("/pokemons/{id}")
    public String detallePokemon(@PathVariable Long id, Model model) throws IOException{
        List<Pokemon> listaPokemon = new PokemonRepositoryImpl().cargar();
        for (Pokemon p: listaPokemon){
            if (id.equals(p.getId())){
                model.addAttribute("pokemon", p);
                return "detallePokemon";
            }
        }
        return "redirect:/notfound";
    }

    @GetMapping("/notfound")
    public String notfound(){
        return "notfound";
    }


}
