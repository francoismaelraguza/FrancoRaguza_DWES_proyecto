package com.web.francoraguza_dwes_proyecto.service;

import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;

import java.util.List;

public interface PokemonService {
    public List<PokemonDTO> listarTodos();
    public PokemonDTO buscarPorID(Long id);
    public PokemonDTO buscarPorNombre(String name);
}
