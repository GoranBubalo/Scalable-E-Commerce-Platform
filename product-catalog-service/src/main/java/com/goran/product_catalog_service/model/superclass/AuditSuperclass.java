package com.goran.product_catalog_service.model.superclass;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
@ToString
public class AuditSuperclass extends IdSuperclass {

    @Column(name="modified")
    private ZonedDateTime modified;

    @Column(name="modified_user_id")
    private String modifiedUserId;
}
