package com.web.francoraguza_dwes_proyecto.repository;
import com.web.francoraguza_dwes_proyecto.model.Pokemon;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PokemonRepositoryImpl implements PokemonRepository {
    private List<Pokemon>pokemonList;

    public PokemonRepositoryImpl() throws IOException {
        cargar();
    }
    public void cargar() throws IOException {
        ClassPathResource recurso =
                new ClassPathResource("data/pokemon.json");
        ObjectMapper mapper = new ObjectMapper();

        try(InputStream entrada = recurso.getInputStream()){
            pokemonList = mapper.readValue(entrada, new TypeReference<List<Pokemon>>() {});
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public List<Pokemon> findAll() {
        return pokemonList;
    }

    @Override
    public Pokemon findById(Long id) {
        return pokemonList.stream().filter((pokemon)->pokemon.getId().equals(id)).findFirst().orElse(null);
    }
}
