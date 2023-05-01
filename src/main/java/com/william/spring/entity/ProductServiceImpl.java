package com.william.spring.entity;

import com.william.spring.dao.ProductDao;
import com.william.spring.dao.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired //inyecta el DAO
    private ProductDao productdao;

    @Override // implementacion del metodo para listar
    public List<Product> findAll() {
        return (List<Product>)productdao.findAll();
    }

    @Override // Se invoca al metodo del dao y el dao retorna un optional para retornar valores nulos
    public Product findById(Long id) {
        return productdao.findById(id).orElse(null);
    }

    @Override
    public void createProducto(Product producto) {
        productdao.save(producto);
    }

    @Override
    public void modifyProducto(Long id, Product producto) {
        if(productdao.existsById(id)){
            producto.setId(id);
            productdao.save(producto);
        }

    }

    @Override
    public void deleteProducto(Long id) {
        if(productdao.existsById(id)){
            productdao.deleteById(id);
        }
    }
}
