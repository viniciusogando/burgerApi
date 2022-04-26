package com.vinicius.burger.configuration;

import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class RestTemplateConfiguration {

    @Bean
    @Primary
    public RestTemplate burgers() {
        return new RestTemplateBuilder()
                .rootUri("https://burgers1.p.rapidapi.com/")
                .defaultHeader("X-RapidAPI-Key", "bacf3c6017msh7a38751ff13577cp1d91f5jsn2588a929e7e3")
                .build();
    }
}
