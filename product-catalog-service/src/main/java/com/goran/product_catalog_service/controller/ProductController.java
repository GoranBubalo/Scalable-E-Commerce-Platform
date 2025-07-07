package com.goran.product_catalog_service.controller;

import com.goran.product_catalog_service.dto.ProductRequestDTO;
import com.goran.product_catalog_service.dto.ProductResponseDTO;
import com.goran.product_catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    // Constructor for dependency injection
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Getting all the products
    @GetMapping()
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
        List<ProductResponseDTO> product = productService.getAllProducts();
        return ResponseEntity.ok(product);
    }

    // Getting the product by ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> findProductById(@PathVariable String id) {
        ProductResponseDTO productResponseDTO = productService.getProduct(id);
        return ResponseEntity.ok(productResponseDTO);
    }

    // Creating the product
    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        ProductResponseDTO productResponseDTO = productService.createProduct(productRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponseDTO);
    }

    // Update the product
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> updateProduct(@PathVariable String id, @RequestBody ProductRequestDTO productRequestDTO) {
        ProductResponseDTO productResponseDTO = productService.updateProduct(id, productRequestDTO);
        return ResponseEntity.ok(productResponseDTO);
    }

    // Delete the Product
    @DeleteMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> deleteProduct(@PathVariable String id) {
        ProductResponseDTO productResponseDTO = productService.getProduct(id);
        return ResponseEntity.ok(productResponseDTO);
    }
}
