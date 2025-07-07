package com.goran.product_catalog_service.mapper;

import com.goran.product_catalog_service.dto.InventoryRequestDTO;
import com.goran.product_catalog_service.dto.InventoryResponseDTO;
import com.goran.product_catalog_service.model.Inventory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface InventoryMapper {

    InventoryResponseDTO toResponseDTO(Inventory inventory);
    List<InventoryResponseDTO> toResponseDTOList(List<Inventory> inventorys);
    Inventory toEntity(InventoryRequestDTO inventoryRequestDTO);
}
