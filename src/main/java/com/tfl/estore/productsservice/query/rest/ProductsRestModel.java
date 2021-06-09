package com.tfl.estore.productsservice.query.rest;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductsRestModel {

    private String productId;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
