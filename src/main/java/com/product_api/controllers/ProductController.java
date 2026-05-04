package com.product_api.controllers;

import com.product_api.dto.ProductDTO;
import com.product_api.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDTO product){

    }
}
