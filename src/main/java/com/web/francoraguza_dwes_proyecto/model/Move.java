package com.web.francoraguza_dwes_proyecto.model;

import java.io.InputStream;

public class Move {
    private String name;
    private String url;
    private Integer accuracy;
    private int power;
    private String type;

    Move(){}

    public Move(String name, String url, Integer accuracy, int power, String type) {
        this.name = name;
        this.url = url;
        this.accuracy = accuracy;
        this.power = power;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


