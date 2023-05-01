package com.william.spring.controllers;

import com.william.spring.dao.ProductService;
import com.william.spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired //inyectar el servicio de productos
    ProductService productservice;

    @GetMapping //Invocar el metodo findall del servicio
    public List <Product> listarProductos(){
        return productservice.findAll();
    }

    @GetMapping(value = "/{id}") // Invocar el metodo findById del producto
    public Product obtenerProducto(@PathVariable long id){
        return productservice.findById(id);
    }

    @PostMapping() //Utilizado para crear nuevo producto
    public void createProducto(@RequestBody Product producto){
        productservice.createProducto(producto);
    }

    @PutMapping(value = "/{id}") // Utilizado para borrar producto existente
    public void modificarProducto(@RequestBody Product producto){
        productservice.createProducto(producto);
    }

    @DeleteMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id){
        productservice.deleteProducto(id);
    }


}
