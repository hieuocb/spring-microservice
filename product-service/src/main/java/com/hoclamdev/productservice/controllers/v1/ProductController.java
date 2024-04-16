package com.hoclamdev.productservice.controllers.v1;

import com.hoclamdev.productservice.dto.ProductDto;
import com.hoclamdev.productservice.service.ProductService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class ProductController {

    private final ProductService productService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDto>> getAll() {
      log.info("Getll all products");
        return new ResponseEntity<>(productService.getListProduct(), HttpStatus.OK);
    }

    @RequestMapping(path = "/product/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }
}
