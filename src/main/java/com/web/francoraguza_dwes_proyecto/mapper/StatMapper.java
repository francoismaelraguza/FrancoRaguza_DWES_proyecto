package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.PokemonDTO;
import com.web.francoraguza_dwes_proyecto.dto.StatDTO;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import com.web.francoraguza_dwes_proyecto.model.Stat;

import java.util.List;

public final class StatMapper {
    public static StatDTO toStatDTO(Stat stat){
        StatDTO dto = new StatDTO();
        dto.setName(stat.getName());
        dto.setValue(stat.getValue());
        return dto;
    }

    public static Stat toStat(StatDTO dto){
        Stat stat = new Stat();
        stat.setName(dto.getName());
        stat.setValue(dto.getValue());
        return stat;
    }

    public static List<StatDTO> toStatDTOList(List<Stat> statList){
        return statList.stream().map(stat -> toStatDTO(stat)).toList();
    }

    public static List<Stat> toStatList(List<StatDTO> statDTOList){
        return statDTOList.stream().map(statDTO -> toStat(statDTO)).toList();
    }

}
