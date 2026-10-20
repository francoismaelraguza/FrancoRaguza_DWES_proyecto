package com.web.francoraguza_dwes_proyecto.service;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import org.springframework.core.io.ClassPathResource;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class LectorPokemon {

        public List<Pokemon> cargar() throws IOException {
            ClassPathResource recurso =
                    new ClassPathResource("data/pokemon.json");
            ObjectMapper mapper = new ObjectMapper();

            try(InputStream entrada = recurso.getInputStream()){
                List<Pokemon> pokemons = mapper.readValue(entrada, new TypeReference<List<Pokemon>>() {});
                return pokemons;
            }catch (Exception e){
                e.printStackTrace();
                return new ArrayList<>();
            }
        }
}
