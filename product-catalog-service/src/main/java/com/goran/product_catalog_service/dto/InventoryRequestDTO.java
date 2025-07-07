package com.goran.product_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InventoryRequestDTO {

    private ProductRequestDTO productRequestDTO;

    @NotNull(message = "Quantity can't be null")
    private Integer quantity;

    @NotBlank(message = "warehouse location cannot be empty ")
    private String warehouseLocation;
}
