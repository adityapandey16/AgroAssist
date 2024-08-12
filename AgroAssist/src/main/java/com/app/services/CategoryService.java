package com.app.services;

import java.util.List;
import com.app.entities.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category saveCategory(Category category); // New method
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
