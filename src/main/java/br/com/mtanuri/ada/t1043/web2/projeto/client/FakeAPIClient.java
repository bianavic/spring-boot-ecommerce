package br.com.mtanuri.ada.t1043.web2.projeto.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "fakeapiclient", url = "${fakeapi.url}")
public interface FakeAPIClient {

    @GetMapping(value = "products", consumes = "application/json")
    List<FakeAPIDataResponse> getProductsData();

}
