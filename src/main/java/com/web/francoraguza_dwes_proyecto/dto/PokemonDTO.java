package com.web.francoraguza_dwes_proyecto.dto;

import com.web.francoraguza_dwes_proyecto.model.Move;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.model.Sprites;
import com.web.francoraguza_dwes_proyecto.model.Stat;

import java.util.ArrayList;
import java.util.List;

public class PokemonDTO {
    private int height;
    private int id;
    private String name;
    private List<Stat> stats;
    private Sprites sprites;
    private ArrayList<String> types;
    private int weight;
    private ArrayList<Move> moves;

    public PokemonDTO(){};

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }


}
