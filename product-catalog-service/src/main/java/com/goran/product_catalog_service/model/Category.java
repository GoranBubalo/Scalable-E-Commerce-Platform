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

import java.util.Set;

@Entity
@Getter
@Setter
@SuperBuilder
@Table(name = "CATEGORY")
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Category extends IdSuperclass {

    @Column(name = "NAME", nullable = false)
    @JsonView(JsonViewFilter.Basic.class)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Product> products;
}
