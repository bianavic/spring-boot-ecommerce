package br.com.mtanuri.ada.t1043.web2.projeto.products.service;

import br.com.mtanuri.ada.t1043.web2.projeto.products.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;

public interface ProductService {

    Product save(ProductDTO newProduct);

}
