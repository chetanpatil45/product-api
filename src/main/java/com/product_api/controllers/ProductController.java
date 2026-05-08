package com.product_api.controllers;

import com.product_api.dto.ProductDTO;
import com.product_api.entity.Product;
import com.product_api.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDTO product){
        Product product1 = productService.addProduct(product);
        if (product1 != null){
            return ResponseEntity.ok(product1);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).build();
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
        Optional<Product> product = productService.get(id);

        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).build();
        }
        return ResponseEntity.ok(product.get());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductDTO productDTO, @PathVariable Long id){
        return null;
    }


}
