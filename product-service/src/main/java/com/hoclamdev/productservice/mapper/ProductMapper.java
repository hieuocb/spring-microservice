package com.hoclamdev.productservice.mapper;

import com.hoclamdev.productservice.dto.ProductDto;
import com.hoclamdev.productservice.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "category.name", target = "category")
    ProductDto getProductDto(Product product);

    List<ProductDto> getListProductDto(List<Product> products);
}
