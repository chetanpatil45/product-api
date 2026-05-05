package com.product_api.controllers;

import com.product_api.dto.ProductDTO;
import com.product_api.entity.Product;
import com.product_api.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDTO product){
        return null;
    }

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
