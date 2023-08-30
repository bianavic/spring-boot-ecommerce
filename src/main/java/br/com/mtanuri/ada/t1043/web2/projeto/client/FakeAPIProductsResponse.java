package br.com.mtanuri.ada.t1043.web2.projeto.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FakeAPIProductsResponse {

    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("image")
    private String image;
    @JsonProperty("category")
    private String category;

    @JsonCreator
    public FakeAPIProductsResponse(String title, BigDecimal price, String description, String image, String category) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

}
