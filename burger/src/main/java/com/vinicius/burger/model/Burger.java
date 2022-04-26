package com.vinicius.burger.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Burger {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("restaurant")
    private String restaurant;
    @JsonProperty("web")
    private String web;
    @JsonProperty("description")
    private String description;
    @JsonProperty("ingredients")
    private List<String> ingredients = null;
    @JsonProperty("addresses")
    private List<Address> addresses = null;

}