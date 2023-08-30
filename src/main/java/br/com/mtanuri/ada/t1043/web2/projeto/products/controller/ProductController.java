package br.com.mtanuri.ada.t1043.web2.projeto.products.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.client.FakeAPIClient;
import br.com.mtanuri.ada.t1043.web2.projeto.client.FakeAPIProductsResponse;
import br.com.mtanuri.ada.t1043.web2.projeto.products.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.products.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;


@Tag(name = "Product Api", description = "This service is responsible for managing products. A user can add and list products")
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final FakeAPIClient fakeAPIClient;

    private final ProductService productService;

    @Operation(
            summary = "Add a new product")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "201", description = "Add new product")
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})
            })
    @PostMapping(consumes="application/json")
    public ResponseEntity<Product> saveUser(@RequestBody @Valid ProductDTO newProduct) {

        Product product = productService.save(newProduct);
        logger.info("Saving a product. Response: {}", product);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).body(product);

    }

    // TODO fix get methods exposed to swagger configuration
    @Operation(
            summary = "Get a list of all products")
    @ApiResponses(
            value = {
            @ApiResponse(responseCode = "200", description = "List of products")
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})
    })
    @GetMapping("/list")
    public ResponseEntity<List<List<FakeAPIProductsResponse>>> listProducts() {

        List<FakeAPIProductsResponse> response = fakeAPIClient.getProductsData();
        logger.info("Getting the list of products. Response: {}", response);
        return ResponseEntity.ok(Collections.singletonList(response));

    }

}