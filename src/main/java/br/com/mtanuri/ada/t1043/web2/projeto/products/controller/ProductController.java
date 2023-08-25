package br.com.mtanuri.ada.t1043.web2.projeto.products.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.client.FakeAPIClient;
import br.com.mtanuri.ada.t1043.web2.projeto.client.FakeAPIDataResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@Tag(name = "Product Api", description = "This service is responsible for managing products. A user can create and list products")
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final FakeAPIClient fakeAPIClient;

    // TODO fix get methods exposed to swagger configuration
    @GetMapping("/list")
    @Operation(
            summary = "Get a list of all products",
            tags = {"product", "post"})
    @ApiResponses(
            value = {
            @ApiResponse(responseCode = "200", description = "List of products")
//            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})
    })
    public ResponseEntity<List<List<FakeAPIDataResponse>>> listProducts() {

        List<FakeAPIDataResponse> response = fakeAPIClient.getProductsData();

        logger.info("Getting the list of products. Response: {}", response);

        return ResponseEntity.ok(Collections.singletonList(response));
    }

}