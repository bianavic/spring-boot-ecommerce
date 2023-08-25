package br.com.mtanuri.ada.t1043.web2.projeto.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FakeAPIDataResponse {

    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image")
    private String image;
    @JsonProperty("category")
    private String category;


    @JsonCreator
    public FakeAPIDataResponse(String title, BigDecimal price, String description, String image, String category) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

}
