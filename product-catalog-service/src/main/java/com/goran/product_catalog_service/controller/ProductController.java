package com.goran.product_catalog_service.controller;

import com.goran.product_catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    // Constructor for dependency injection
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


}
