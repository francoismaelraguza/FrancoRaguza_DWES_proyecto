package com.web.francoraguza_dwes_proyecto.service;

import com.web.francoraguza_dwes_proyecto.dto.BattleDTO;
import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.mapper.PokemonMapper;
import com.web.francoraguza_dwes_proyecto.model.Battle;
import com.web.francoraguza_dwes_proyecto.model.Move;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class BattleServiceImpl implements BattleService {
    PokemonService pokemonService;

    @Override
    public BattleDTO iniciarBatalla(String name) {
        Battle battle = new Battle();
        Pokemon pokemon = movesAlAzar(PokemonMapper.toPokemon(pokemonService.buscarPorNombre(name)));
        Pokemon rival = movesAlAzar(rivalAlAzar());




        return null;
    }

    private Pokemon rivalAlAzar(){
        List<Pokemon>pokemonList = PokemonMapper.toPokemonList(pokemonService.listarTodos());
        Pokemon rival = pokemonList.get((int) (Math.random()*(pokemonList.size()-1)));
        return rival;
    }

    private Pokemon movesAlAzar(Pokemon pokemon){
        ArrayList<Move>moves = pokemon.getMoves();
        while (moves.size() > 4){
            moves.remove((int) (Math.random()*(moves.size()-1)));
        }
        pokemon.setMoves(moves);
        return pokemon;
    }

}
