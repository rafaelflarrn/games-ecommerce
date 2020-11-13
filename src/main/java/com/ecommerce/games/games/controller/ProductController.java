package com.ecommerce.games.games.controller;

import com.ecommerce.games.games.entity.Product;
import com.ecommerce.games.games.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("products")
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }
}
