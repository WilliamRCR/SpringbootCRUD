package com.william.spring.dao;

import com.william.spring.entity.Product;

import java.util.List;

public interface ProductService {

    public List <Product> findAll();
    public Product findById(Long id);
    public void createProducto(Product producto);
    public void modifyProducto(Long id, Product producto);
    public void deleteProducto(Long id);



}
