package com.goran.product_catalog_service.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.goran.product_catalog_service.enums.*;
import com.goran.product_catalog_service.model.superclass.IdSuperclass;
import com.goran.product_catalog_service.model.view.JsonViewFilter;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@SuperBuilder
@Table(name = "PRODUCT")
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = {"category"})
public class Product extends IdSuperclass {

    @Column(name = "NAME", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private String name;

    @Column(name = "DESCRIPTION")
    @JsonView(JsonViewFilter.Basic.class)
    private String description;

    @Column(name = "PRICE", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private Double price;

    @Column(name = "SKU", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private String sku;

    @Column(name = "BRAND", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private String brand;

    @Column(name = "PRODUCT_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private ProductStatus status;

    @Column(name = "PRODUCT_CONDITION", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private ProductCondition condition;

    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Column(name = "CURRENCY", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private Currency currency;

    @Column(name = "SHIPPING_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private ShippingType shippingType;

    @Column(name = "RETURN_POLICY", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private ReturnPolicy returnPolicy;

    @Column(name = "VISIBILITY",  nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonView(JsonViewFilter.Basic.class)
    private Visibility visibility;

    @Column(name = "CREATED_AT", nullable = false)
    private ZonedDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private ZonedDateTime updatedAt;

}
