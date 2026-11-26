package com.web.francoraguza_dwes_proyecto.dto;

import com.web.francoraguza_dwes_proyecto.model.Estado;
import com.web.francoraguza_dwes_proyecto.model.Move;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;

import java.time.LocalDateTime;
import java.util.List;

public class BattleDTO {
    private Long id;
    private LocalDateTime time;
    private Pokemon pokemonTrainer;
    private Pokemon pokemonRival;
    private List<Move> movesTrainer;
    private List<Move> movesRival;
    private Long hpTrainer;
    private Long hpRival;
    private Estado estado;

    public BattleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Pokemon getPokemonTrainer() {
        return pokemonTrainer;
    }

    public void setPokemonTrainer(Pokemon pokemonTrainer) {
        this.pokemonTrainer = pokemonTrainer;
    }

    public Pokemon getPokemonRival() {
        return pokemonRival;
    }

    public void setPokemonRival(Pokemon pokemonRival) {
        this.pokemonRival = pokemonRival;
    }

    public List<Move> getMovesTrainer() {
        return movesTrainer;
    }

    public void setMovesTrainer(List<Move> movesTrainer) {
        this.movesTrainer = movesTrainer;
    }

    public List<Move> getMovesRival() {
        return movesRival;
    }

    public void setMovesRival(List<Move> movesRival) {
        this.movesRival = movesRival;
    }

    public Long getHpTrainer() {
        return hpTrainer;
    }

    public void setHpTrainer(Long hpTrainer) {
        this.hpTrainer = hpTrainer;
    }

    public Long getHpRival() {
        return hpRival;
    }

    public void setHpRival(Long hpRival) {
        this.hpRival = hpRival;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
