package com.web.francoraguza_dwes_proyecto.exeption;

public class PokemonNotFound extends RuntimeException {
    public PokemonNotFound(String message) {
        super(message);
    }
}
