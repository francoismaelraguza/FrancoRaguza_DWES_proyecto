package com.web.francoraguza_dwes_proyecto.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private int height;
    private int id;
    private String name;
    private List<Stat> stats;
    private Sprites sprites;
    private ArrayList<String> types;
    private int weight;
    private ArrayList<Move> moves;

    Pokemon(){}

    public Pokemon(int height, int id, String name, List<Stat> stats, Sprites sprites, ArrayList<String> types, int weight, ArrayList<Move> moves) {
        this.height = height;
        this.id = id;
        this.name = name;
        this.stats = stats;
        this.sprites = sprites;
        this.types = types;
        this.weight = weight;
        this.moves = moves;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHeight() {
        return height;
    }

    public void setHeigth(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "height=" + height +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", stats=" + stats +
                ", sprites=" + sprites +
                ", types=" + types +
                ", weight=" + weight +
                ", moves=" + moves +
                '}';
    }
}
