package com.ecommerce.games.games.services;

import com.ecommerce.games.games.entities.Category;
import com.ecommerce.games.games.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);

        return category.orElse(null);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category create(Category category){
        return categoryRepository.save(category);
    }

    public boolean deleteById(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.delete(findById(id));
            return true;
        }
        return false;
    }
}
