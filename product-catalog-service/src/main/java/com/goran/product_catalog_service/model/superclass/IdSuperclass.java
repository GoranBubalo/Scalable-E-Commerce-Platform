package com.goran.product_catalog_service.model.superclass;

import com.fasterxml.jackson.annotation.JsonView;
import com.goran.product_catalog_service.model.view.JsonViewFilter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@MappedSuperclass
public class IdSuperclass {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(36)")
    @JsonView(JsonViewFilter.Basic.class)
    private String id;
}
