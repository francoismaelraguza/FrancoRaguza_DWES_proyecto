package com.web.francoraguza_dwes_proyecto.model;

import tools.jackson.databind.ext.javatime.deser.LocalDateTimeDeserializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Battle {
    private Long id;
    private LocalDateTime time;
    private Pokemon pokemonTrainer;
    private Pokemon pokemonRival;
    private List<Move> movesTrainer;
    private List<Move> movesRival;
    private Long hpTrainer;
    private Long hpRival;
    private Estado estado;

    public Battle(){};
    public Battle(Long id, LocalDateTime time, Pokemon pokemonTrainer, Pokemon pokemonRival, List<Move> movesTrainer, List<Move> movesRival, Long hpTrainer, Long hpRival, Estado estado) {

        this.id = id;
        this.time = time;
        this.pokemonTrainer = pokemonTrainer;
        this.pokemonRival = pokemonRival;
        this.movesTrainer = movesTrainer;
        this.movesRival = movesRival;
        this.hpTrainer = hpTrainer;
        this.hpRival = hpRival;
        this.estado = estado;
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
