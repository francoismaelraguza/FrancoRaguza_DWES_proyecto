package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.TrainerDTO;
import com.web.francoraguza_dwes_proyecto.model.Trainer;

import javax.print.DocFlavor;


public final class TrainerMapper {
    public static TrainerDTO toTrainerDTO(Trainer trainer){
        TrainerDTO dto = new TrainerDTO();
        dto.setTrainer(trainer.getTrainer());
        return dto;
    }
}
