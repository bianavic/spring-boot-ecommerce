package br.com.mtanuri.ada.t1043.web2.projeto.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    String description;
//    Integer quantityInStock;
    private BigDecimal price;
    private String image;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(Long id, String title, String description, BigDecimal price, String image, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }

}
