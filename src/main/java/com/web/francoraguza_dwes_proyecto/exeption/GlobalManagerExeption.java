package com.web.francoraguza_dwes_proyecto.exeption;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalManagerExeption {
    @ExceptionHandler(PokemonNotFound.class)
    public String pokemonNotFound(PokemonNotFound ex){
        return "notfound";
    }

}
