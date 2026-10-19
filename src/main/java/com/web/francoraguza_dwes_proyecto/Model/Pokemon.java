package com.web.francoraguza_dwes_proyecto.Model;

import java.util.ArrayList;

public class Pokemon {
    private int heigth;
    private int id;
    private Stat stats;
    private Sprites sprites;
    private ArrayList<String> types;
    private ArrayList<Move> moves;
    private int weight;

    public Pokemon(int heigth, int id, Stat stats, Sprites sprites, ArrayList<String> types, ArrayList<Move> moves, int weight) {
        this.heigth = heigth;
        this.id = id;
        this.stats = stats;
        this.sprites = sprites;
        this.types = types;
        this.moves = moves;
        this.weight = weight;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stat getStats() {
        return stats;
    }

    public void setStats(Stat stats) {
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
}
