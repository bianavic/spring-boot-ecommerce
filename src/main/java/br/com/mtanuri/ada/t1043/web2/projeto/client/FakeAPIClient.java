package br.com.mtanuri.ada.t1043.web2.projeto.client;

import br.com.mtanuri.ada.t1043.web2.projeto.products.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "fakeapiclient", url = "${fakeapi.url}")
public interface FakeAPIClient {

    @GetMapping(value = "products", consumes = "application/json")
    List<FakeAPIProductsResponse> getProductsData();

    @PostMapping(value = "products")
    void saveProduct(@RequestBody ProductDTO newProduct);

}
