package com.goran.product_catalog_service.service;

import com.goran.product_catalog_service.dto.ProductRequestDTO;
import com.goran.product_catalog_service.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    ProductResponseDTO getProduct(String id);
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO updateProduct(String id,ProductRequestDTO productRequestDTO);

}
