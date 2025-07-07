package com.goran.product_catalog_service.dto;

import com.goran.product_catalog_service.enums.*;

public class ProductResponseDTO {

    private String name;
    private String description;
    private double price;
    private String sku;
    private String brand;
    private ProductStatus status;
    private ProductCondition condition;

    private Currency currency;
    private ShippingType shippingType;
}


