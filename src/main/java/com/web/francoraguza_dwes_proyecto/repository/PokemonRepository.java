package com.web.francoraguza_dwes_proyecto.repository;

import com.web.francoraguza_dwes_proyecto.model.Pokemon;

import java.util.List;

public interface PokemonRepository {
    public List<Pokemon> findAll();
    public Pokemon findById(Long id);
}
