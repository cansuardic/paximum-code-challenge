package com.media.store.service;

import com.media.store.entity.BaseProduct;
import com.media.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;


    public List<BaseProduct> getAllProducts(){
        return productRepository.findAll();
    }

    public BaseProduct saveProduct(BaseProduct product) {
        return productRepository.save(product);
    }



}
