package com.vinicius.burger.service;

import com.vinicius.burger.integration.RestClient;
import com.vinicius.burger.model.Burger;
import com.vinicius.burger.repository.BurgerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@AllArgsConstructor
@Service
public class BurgerService {

    private final BurgerRepository repository;
    private final RestClient restClient;

    public Burger save(Burger burger) {
        return repository.save(burger);
    }
    public Burger get(Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Burger not found."));
    }

    public List<Burger> list(){
        // Busca burgers da api externa
        List<Burger> burgers = restClient.getBurgers();
        // Persiste burgers no banco
        repository.saveAll(burgers);
        return burgers;
    }

    public void delete(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Burger not found."));
        repository.deleteById(id);
    }

}
