package com.web.francoraguza_dwes_proyecto.repository;

import com.web.francoraguza_dwes_proyecto.model.Battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BattleRepositoryImpl implements BattleRepository{

    private List<Battle> battleList= new ArrayList<Battle>();
    private Long lastId = 1L;


    @Override
    public List<Battle> findAll() {
        return battleList;
    }
    @Override
    public Optional<Battle> findById(Long id) {
        return battleList.stream().filter(battle -> battle.getId().equals(id)).findFirst();
    }

    @Override
    public Battle save(Battle battle) {
        if(battle.getId() == null){
            battle.setId(lastId++);
            battleList.add(battle);
        }else {
            for (int i=0; i<battleList.size(); i++){
                if (battleList.get(i).getId().equals(battle.getId())){
                    battleList.set(i, battle);
                }
            }
            battleList.add(battle);
        }
        return battle;
    }


}
