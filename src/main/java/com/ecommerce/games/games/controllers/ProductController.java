package com.ecommerce.games.games.controllers;

import com.ecommerce.games.games.entities.Product;
import com.ecommerce.games.games.repositories.ProductRepository;
import com.ecommerce.games.games.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> create(@RequestBody Product product){
        Product createProduct = productService.create(product);

        return ResponseEntity.status(201).body(createProduct);
    }
}
