package com.ecommerce.games.games.controllers;

import com.ecommerce.games.games.entities.Category;
import com.ecommerce.games.games.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("categories")
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category findById(@PathVariable Long id){
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Category> create(@RequestBody Category category){
        Category createCategory = categoryService.create(category);

        return ResponseEntity.status(201).body(createCategory);
    }
}
