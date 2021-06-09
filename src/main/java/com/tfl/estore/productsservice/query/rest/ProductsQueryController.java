package com.tfl.estore.productsservice.query.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsQueryController {

    @GetMapping
    public List<ProductsRestModel> getProducts() {
        return null;
    }
}
