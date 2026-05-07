package com.product_api.service;

import com.product_api.dto.ProductDTO;
import com.product_api.entity.Product;
import com.product_api.repository.ProductRepository;
import com.product_api.utils.ProductUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;
    private final ProductUtil util;

    public ProductService(ProductRepository repository, ProductUtil util) {
        this.repository = repository;
        this.util = util;
    }

    public  Product addProduct(ProductDTO productDTO){
        return repository.save(util.toProduct(productDTO));
    }

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Optional<Product> get(long id){
        return repository.findById(id);
    }
}
