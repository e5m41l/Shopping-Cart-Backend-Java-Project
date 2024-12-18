package com.mostafaesmail.green_shops.service.category;

import com.mostafaesmail.green_shops.Model.Category;
import com.mostafaesmail.green_shops.exceptions.AlreadyExistsException;
import com.mostafaesmail.green_shops.exceptions.ResourceNotFoundException;
import com.mostafaesmail.green_shops.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Category was not found!"));
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        return  Optional.of(category).filter(c -> !categoryRepository.existsByName(c.getName()))
                .map(categoryRepository :: save)
                .orElseThrow(() -> new AlreadyExistsException(category.getName()+" already exists"));
    }

    @Override
    public Category updateCategory(Category category, Long id) {

        return Optional.ofNullable(getCategoryById(id)).map(oldCategory -> {
            oldCategory.setName(category.getName());

            return categoryRepository.save(oldCategory);
        }).orElseThrow(()->new ResourceNotFoundException("Category was not found!"));
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.findById(id)
                .ifPresentOrElse(categoryRepository::delete,  ()-> {
                    throw new ResourceNotFoundException("Category was not found!");
                });
    }
}
