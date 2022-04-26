package com.vinicius.burger.controller.v1;


import com.vinicius.burger.model.Burger;
import com.vinicius.burger.service.BurgerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor // Essa anotação é responsável por gerar um construtor com 1 parametro
@RestController
@RequestMapping("/v1/burger")
public class BurgerController {

    private final BurgerService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public ResponseEntity<Burger> saveProduct(@RequestBody @Valid Burger burger) {
        return ResponseEntity.ok(service.save(burger));
    }

    @GetMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public ResponseEntity<Burger> get(@PathVariable Integer id) {
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping("")
    @ResponseStatus(OK)
    public ResponseEntity<List<Burger>> findAll() {
        return ResponseEntity.ok(service.list());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        service.delete(id);
    }

}

