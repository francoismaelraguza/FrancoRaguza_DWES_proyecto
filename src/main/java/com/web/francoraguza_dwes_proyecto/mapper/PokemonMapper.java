package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;

public final class PokemonMapper {
    public static PokemonDTO toPokemonDTO(Pokemon pokemon){
        PokemonDTO dto = new PokemonDTO();
        dto.setHeight(pokemon.getHeight());
        dto.setId(pokemon.getId());
        dto.setName(pokemon.getName());
        dto.setStats(pokemon.getStats());
        dto.setSprites(pokemon.getSprites());
        dto.setMoves(pokemon.getMoves());
        dto.setWeight(pokemon.getWeight());
        dto.setTypes(pokemon.getTypes());
        return dto;
    }
}
