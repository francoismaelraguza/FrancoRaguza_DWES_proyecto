package com.web.francoraguza_dwes_proyecto.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Valid
public class TrainerDTO {
    @NotBlank(message = "Introduce un usuario")
    @Size(min = 3, max = 15, message = "Minimo 3 y Maximo 15 caracteres")
    private String trainer;

    public TrainerDTO() {
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}
