package com.product_api.utils;

import com.product_api.dto.ProductDTO;
import com.product_api.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductUtil {
    public Product toProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setQty(productDTO.getQty());

        return product;
    }
}
