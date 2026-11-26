package com.web.francoraguza_dwes_proyecto.controller;

import com.web.francoraguza_dwes_proyecto.dto.TrainerDTO;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.model.Trainer;
import com.web.francoraguza_dwes_proyecto.repository.PokemonRepositoryImpl;
import com.web.francoraguza_dwes_proyecto.service.PokemonService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class WebController {
    PokemonService pokemonService;

    public WebController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

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
        model.addAttribute("listaPokemon", pokemonService.listarTodos());
        return "pokemon";
    }

    @GetMapping("/pokemons/{id}")
    public String detallePokemon(@PathVariable Long id, Model model){
        model.addAttribute("pokemon", pokemonService.buscarPorID(id));
        return "detallePokemon";
    }

    @PostMapping("/battle")
    public String batalla(@RequestParam("pokemon") String name, Model model){
        return "redirect:/pokemons";
    }

}
