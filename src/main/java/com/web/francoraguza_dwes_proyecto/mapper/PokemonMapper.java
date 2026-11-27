package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;

import java.util.List;

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

    public static Pokemon toPokemon(PokemonDTO dto){
        Pokemon pokemon = new Pokemon();
        pokemon.setHeigth(dto.getHeight());
        pokemon.setId(dto.getId());
        pokemon.setName(dto.getName());
        pokemon.setStats(dto.getStats());
        pokemon.setSprites(dto.getSprites());
        pokemon.setMoves(dto.getMoves());
        pokemon.setWeight(dto.getWeight());
        pokemon.setTypes(dto.getTypes());
        return pokemon;
    }


    public static List<PokemonDTO> toPokemonDTOList(List<Pokemon> pokemonList){
        return pokemonList.stream().map(pokemon -> toPokemonDTO(pokemon)).toList();
    }

    public static List<Pokemon> toPokemonList(List<PokemonDTO> pokemonList){
        return pokemonList.stream().map(pokemonDTO -> toPokemon(pokemonDTO)).toList();
    }
}
