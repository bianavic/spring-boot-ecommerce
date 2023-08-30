package br.com.mtanuri.ada.t1043.web2.projeto.products.service;

import br.com.mtanuri.ada.t1043.web2.projeto.client.FakeAPIClient;
import br.com.mtanuri.ada.t1043.web2.projeto.products.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private FakeAPIClient client;
    private final ProductRepository productRepository;

    @Override
    public Product save(ProductDTO newProduct) {
        return productRepository.save(new Product(newProduct.getId(), newProduct.getTitle(), newProduct.getDescription(),
                newProduct.getPrice(), newProduct.getImage(), newProduct.getCategory()));
    }

}