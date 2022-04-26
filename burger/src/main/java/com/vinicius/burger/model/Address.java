package com.vinicius.burger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Address {

    @JsonProperty("addressId")
    private Integer addressId;
    @JsonProperty("number")
    private String number;
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("country")
    private String country;

}