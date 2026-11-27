package com.web.francoraguza_dwes_proyecto.service;

import com.web.francoraguza_dwes_proyecto.dto.BattleDTO;
import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.exeption.EmptyExeption;
import com.web.francoraguza_dwes_proyecto.exeption.PokemonNotFound;
import com.web.francoraguza_dwes_proyecto.mapper.PokemonMapper;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PokemonServiceImpl implements PokemonService {
    PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;

    }

    @Override
    public List<PokemonDTO> listarTodos() {
        List<PokemonDTO> pokemonDTOList= PokemonMapper.toPokemonDTOList(pokemonRepository.findAll());
        if (pokemonDTOList.isEmpty()){
            throw new EmptyExeption("No hay ningun Pokémon");
        }
        return pokemonDTOList;
    }

    @Override
    public PokemonDTO buscarPorID(Long id) {
        Pokemon pokemon = pokemonRepository.findById(id);
        if(pokemon == null){
            throw new PokemonNotFound("No exite un pokemon con el id: " + id);
        }
        return PokemonMapper.toPokemonDTO(pokemon);
    }

    @Override
    public PokemonDTO buscarPorNombre(String name){
        Pokemon pokemon = pokemonRepository.findByName(name);
        if(pokemon == null){
            throw new PokemonNotFound("No exite un pokemon con el id: " + name);
        }
        return PokemonMapper.toPokemonDTO(pokemon);
    }


}
