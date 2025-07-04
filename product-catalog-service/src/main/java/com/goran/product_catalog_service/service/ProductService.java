package com.goran.product_catalog_service.service;

import com.goran.product_catalog_service.model.Product;
import com.goran.product_catalog_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //TODO: Add DTO's to this

    @Autowired
    private ProductRepository productRepository;

    private List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    private Product getProductByID(String id) {
        return productRepository.getReferenceById(id);
    }

    private Product createProduct(Product product) {
        return productRepository.save(product);
    }

    private Product updateProduct(String id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    private void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

}
