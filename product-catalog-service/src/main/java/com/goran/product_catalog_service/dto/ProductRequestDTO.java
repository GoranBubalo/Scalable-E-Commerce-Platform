package com.goran.product_catalog_service.dto;

import com.goran.product_catalog_service.enums.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDTO {

    @NotBlank(message = "Product name cannot be blank")
    @Size(max = 255, message = "Product name cannot exceed 255 characters")
    private String name;

    @Size(max = 1000, message = "Product description cannot exceed 1000 characters")
    private String description;

    @NotNull(message = "Product price cannot be null")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "SKU cannot be blank")
    @Pattern(regexp = "^[A-Z0-9-]{3,50}$", message = "SKU must be alphanumeric with hyphens, 3-50 chars") // Example pattern
    private String sku;

    @NotBlank(message = "Brand cannot be blank")
    @Size(max = 100, message = "Brand name cannot exceed 100 characters")
    private String brand;

    @NotNull(message = "Product status cannot be null")
    private ProductStatus status;

    @NotNull(message = "Product condition cannot be null")
    private ProductCondition condition;

    @NotNull(message = "Category ID cannot be null")
    private Long categoryId;

    @NotNull(message = "Currency cannot be null")
    private Currency currency;

    @NotNull(message = "Shipping type cannot be null")
    private ShippingType shippingType;

    @NotNull(message = "Return policy cannot be null")
    private ReturnPolicy returnPolicy;

    @NotNull(message = "Visibility cannot be null")
    private Visibility visibility;

}
