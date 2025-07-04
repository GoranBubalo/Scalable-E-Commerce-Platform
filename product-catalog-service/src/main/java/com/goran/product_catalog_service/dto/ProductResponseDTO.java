package com.goran.product_catalog_service.dto;

import com.goran.product_catalog_service.enums.*;

import java.time.ZonedDateTime;


public class ProductResponseDTO {

    private Long id;
    private String name;
    private String description;
    private double price;
    private String sku;
    private String brand;
    private ProductStatus status;
    private ProductCondition condition;

    private Currency currency;
    private ShippingType shippingType;
    private ReturnPolicy returnPolicy;
    private Visibility visibility;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}


