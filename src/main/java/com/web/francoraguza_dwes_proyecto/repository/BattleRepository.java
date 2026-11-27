package com.web.francoraguza_dwes_proyecto.repository;

import com.web.francoraguza_dwes_proyecto.model.Battle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BattleRepository {

    public List<Battle>findAll();
    public Battle save(Battle battle);
    public Optional<Battle> findById(Long id);

}
