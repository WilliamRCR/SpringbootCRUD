package com.william.spring.dao;

import com.william.spring.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository <Product, Long>{

}
