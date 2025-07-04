package com.goran.product_catalog_service.mapper;

import com.goran.product_catalog_service.dto.ProductRequestDTO;
import com.goran.product_catalog_service.dto.ProductResponseDTO;
import com.goran.product_catalog_service.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper  {

    ProductRequestDTO toRequestDTO(Product product);
    ProductResponseDTO toResponseDTO(Product product);

    Product toEntity(ProductRequestDTO productRequestDTO);
    Product toEntity(ProductResponseDTO productResponseDTO);

}
