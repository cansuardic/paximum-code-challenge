package com.media.store.controller;

import com.media.store.entity.BaseProduct;
import com.media.store.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductServiceImpl service;

    public ProductController(ProductServiceImpl service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<BaseProduct>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<BaseProduct> createProduct(@RequestBody BaseProduct product) {
        return new ResponseEntity<>(service.saveProduct(product), HttpStatus.CREATED);
    }
}
