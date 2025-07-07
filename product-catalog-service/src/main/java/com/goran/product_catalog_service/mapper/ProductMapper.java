package com.goran.product_catalog_service.mapper;

import com.goran.product_catalog_service.dto.ProductRequestDTO;
import com.goran.product_catalog_service.dto.ProductResponseDTO;
import com.goran.product_catalog_service.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper  {

    ProductResponseDTO toResponseDTO(Product product);
    List<ProductResponseDTO> toResponseDTOList(List<Product> products);
    Product toEntity(ProductRequestDTO productRequestDTO);

}
