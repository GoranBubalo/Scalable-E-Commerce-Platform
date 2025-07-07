package com.goran.product_catalog_service.service;

import com.goran.product_catalog_service.dto.InventoryRequestDTO;
import com.goran.product_catalog_service.dto.InventoryResponseDTO;

import java.util.List;

public interface InventoryService {

    InventoryResponseDTO getInventory(String id);
    List<InventoryResponseDTO> getAllInventory();
    InventoryResponseDTO addInventory(InventoryRequestDTO inventoryRequestDTO);
    InventoryResponseDTO updateInventory(String id,InventoryRequestDTO inventoryRequestDTO);
}
