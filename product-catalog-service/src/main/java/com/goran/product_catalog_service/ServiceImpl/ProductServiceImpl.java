package com.goran.product_catalog_service.ServiceImpl;

import com.goran.product_catalog_service.dto.ProductRequestDTO;
import com.goran.product_catalog_service.dto.ProductResponseDTO;
import com.goran.product_catalog_service.mapper.ProductMapper;
import com.goran.product_catalog_service.model.Product;
import com.goran.product_catalog_service.repository.ProductRepository;
import com.goran.product_catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private  ProductRepository productRepository;

    @Autowired
    private  ProductMapper productMapper;


    @Override
    public List<ProductResponseDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.toResponseDTOList(products);
    }

    @Override
    public ProductResponseDTO getProduct(String id) {
        Product product = productRepository.findById(id).orElse(null);
        return productMapper.toResponseDTO(product);
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        Product product = productMapper.toEntity(productRequestDTO);
        productRepository.save(product);
        return productMapper.toResponseDTO(product);
    }

    @Override
    public ProductResponseDTO updateProduct(String id, ProductRequestDTO productRequestDTO) {
        Product product = productRepository.findById(id).orElse(null);
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());
        product.setCondition(productRequestDTO.getCondition());
        product.setCurrency(productRequestDTO.getCurrency());
        product.setReturnPolicy(productRequestDTO.getReturnPolicy());
        product.setShippingType(productRequestDTO.getShippingType());
        product.setVisibility(productRequestDTO.getVisibility());
        return productMapper.toResponseDTO(productRepository.save(product));
    }


    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
