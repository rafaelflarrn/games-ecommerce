package com.ecommerce.games.games.controller;

import com.ecommerce.games.games.entity.Category;
import com.ecommerce.games.games.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("categories")
@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Category create(@RequestBody Category category){
        return categoryRepository.save(category);
    }

}
