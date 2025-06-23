package com.goran.product_catalog_service.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.goran.product_catalog_service.model.superclass.IdSuperclass;
import com.goran.product_catalog_service.model.view.JsonViewFilter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@SuperBuilder
@Table(name = "INVENTORY")
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Inventory extends IdSuperclass {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Column(name = "QUANTITY", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private Integer quantity;

    @Column(name = "WAREHOUSE_LOCATION")
    @JsonView(JsonViewFilter.Basic.class)
    private String warehouseLocation;

    @Column(name = "LAST_UPDATE")
    private ZonedDateTime lastUpdate;

}
