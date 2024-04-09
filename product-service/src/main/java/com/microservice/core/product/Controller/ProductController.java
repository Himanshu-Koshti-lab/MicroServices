package com.microservice.core.product.Controller;

import com.core.microservicecore.core.Product.Product;
import com.microservice.core.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

//    http://localhost:8080/getAllProduct
    @GetMapping("getAllProduct")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

}
