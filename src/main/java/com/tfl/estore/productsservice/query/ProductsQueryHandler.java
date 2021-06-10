package com.tfl.estore.productsservice.query;

import com.tfl.estore.productsservice.core.data.ProductEntity;
import com.tfl.estore.productsservice.core.data.ProductsRepository;
import com.tfl.estore.productsservice.query.rest.ProductsRestModel;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsQueryHandler {

    private final ProductsRepository productsRepository;

    public ProductsQueryHandler(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @QueryHandler
    public List<ProductsRestModel> findProducts(FindProductsQuery findProductsQuery) {
        List<ProductsRestModel> productsRestModels = new ArrayList<>();
        List<ProductEntity> storedProducts = productsRepository.findAll();
        for (ProductEntity productEntity: storedProducts) {
            ProductsRestModel model = new ProductsRestModel();
            BeanUtils.copyProperties(productEntity, model);
            productsRestModels.add(model);
        }
        return productsRestModels;
    }
}
