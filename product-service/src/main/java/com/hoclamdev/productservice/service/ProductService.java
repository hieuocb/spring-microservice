package com.hoclamdev.productservice.service;

import com.hoclamdev.productservice.dto.ProductDto;
import com.hoclamdev.productservice.mapper.ProductMapper;
import com.hoclamdev.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> getListProduct() {
        var products = productRepository.findAll();
        return ProductMapper.INSTANCE.getListProductDto(products);
    }

    public ProductDto getProduct(Long id) {
        var product = productRepository.findById(id);
        if (product.isEmpty()) {
            return new ProductDto();
        }
        return ProductMapper.INSTANCE.getProductDto(product.get());
    }
}
