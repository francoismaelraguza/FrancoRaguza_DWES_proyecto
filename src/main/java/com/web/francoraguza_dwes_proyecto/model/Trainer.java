package com.web.francoraguza_dwes_proyecto.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Trainer {
    @NotBlank(message = "Introduce un usuario")
    @Size(min = 3, max = 15, message = "Minimo 3 y Maximo 15 caracteres")
    private String trainer;

    public Trainer(){}

    public Trainer(String trainer) {
        this.trainer = trainer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}

