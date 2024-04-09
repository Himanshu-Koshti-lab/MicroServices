package com.microservice.core.product.service;

import com.core.microservicecore.core.Product.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProduct() {
        Product product = new Product(1,"Sampo",100,"House no 2 Dubai");
        Product product2 = new Product(2,"Soap",200,"House no 1 Dubai");

        return new ArrayList<>(List.of(product,product2));
    }
}
