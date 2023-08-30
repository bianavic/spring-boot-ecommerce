package br.com.mtanuri.ada.t1043.web2.projeto.products.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    @NotEmpty(message="The title is required")
    @Size(min = 1, max = 20)
    private String title;
    @Size(min = 1, max = 250)
    private String description;
    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal price;
    private String image;
    @NotEmpty(message="The category is required")
    @Size(min = 1, max = 10)
    private String category;


//    @NotEmpty(message="The quantity is required")
//    Integer quantityInStock;

}
