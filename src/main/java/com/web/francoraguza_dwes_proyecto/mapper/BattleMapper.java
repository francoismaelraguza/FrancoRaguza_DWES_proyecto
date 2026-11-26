package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.BattleDTO;
import com.web.francoraguza_dwes_proyecto.model.Battle;

public final class BattleMapper {
    public static BattleDTO toBattleDTO(Battle battle){
        BattleDTO dto = new BattleDTO();
        dto.setId(battle.getId());
        dto.setTime(battle.getTime());
        dto.setPokemonTrainer(battle.getPokemonTrainer());
        dto.setPokemonRival(battle.getPokemonRival());
        dto.setMovesTrainer(battle.getMovesTrainer());
        dto.setMovesRival(battle.getMovesRival());
        dto.setHpTrainer(battle.getHpTrainer());
        dto.setHpRival(battle.getHpRival());
        dto.setEstado(battle.getEstado());
        return dto;
    }

    public static Battle toBattle(BattleDTO dto){
        Battle battle = new Battle();
        battle.setId(dto.getId());
        battle.setTime(dto.getTime());
        battle.setPokemonTrainer(dto.getPokemonTrainer());
        battle.setPokemonRival(dto.getPokemonRival());
        battle.setMovesTrainer(dto.getMovesTrainer());
        battle.setMovesRival(dto.getMovesRival());
        battle.setHpTrainer(dto.getHpTrainer());
        battle.setHpRival(dto.getHpRival());
        battle.setEstado(dto.getEstado());
        return battle;
    }
}
