package com.vinicius.burger.integration;

import com.vinicius.burger.model.Burger;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class RestClient {
    private RestTemplate restTemplate;

    public List<Burger> getBurgers(){
        return Arrays.stream(Objects.requireNonNull(restTemplate.getForObject("/burgers", Burger[].class)))
                .toList();
    }

}