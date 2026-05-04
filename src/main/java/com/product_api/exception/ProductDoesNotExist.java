package com.product_api.exception;

public class ProductDoesNotExist extends Exception{
    public ProductDoesNotExist(String message) {
        super(message);
    }
}
