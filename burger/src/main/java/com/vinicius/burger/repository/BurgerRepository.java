package com.vinicius.burger.repository;

import com.vinicius.burger.model.Burger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BurgerRepository extends MongoRepository<Burger, Integer> {

}
