package com.web.francoraguza_dwes_proyecto.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Usuario {
    @NotBlank(message = "Introduce un usuario")
    @Size(min = 3, max = 15, message = "Minimo 3 y Maximo 15 caracteres")
    private String user;

    public Usuario(){}

    public Usuario(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

