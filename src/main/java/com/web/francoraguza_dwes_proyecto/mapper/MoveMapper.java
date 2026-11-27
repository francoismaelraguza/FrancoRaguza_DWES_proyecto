package com.web.francoraguza_dwes_proyecto.mapper;

import com.web.francoraguza_dwes_proyecto.dto.MoveDTO;
import com.web.francoraguza_dwes_proyecto.dto.StatDTO;
import com.web.francoraguza_dwes_proyecto.model.Move;
import com.web.francoraguza_dwes_proyecto.model.Stat;

import java.util.List;

public final class MoveMapper {
    public static MoveDTO toMoveDTO(Move move){
        MoveDTO dto = new MoveDTO();
        dto.setAccuracy(move.getAccuracy());
        dto.setName(move.getName());
        dto.setPower(move.getPower());
        dto.setType(move.getType());
        dto.setUrl(move.getUrl());
        return dto;
    }

    public static Move toMove(MoveDTO dto){
        Move move = new Move();
        move.setAccuracy(dto.getAccuracy());
        move.setName(dto.getName());
        move.setPower(dto.getPower());
        move.setType(dto.getType());
        move.setUrl(dto.getUrl());
        return move;
    }

    public static List<MoveDTO> toMoveDTOList(List<Move> moveList){
        return moveList.stream().map(move -> toMoveDTO(move)).toList();
    }

    public static List<Move> toMoveList(List<MoveDTO> moveDTOList){
        return moveDTOList.stream().map(moveDTO -> toMove(moveDTO)).toList();
    }
}
