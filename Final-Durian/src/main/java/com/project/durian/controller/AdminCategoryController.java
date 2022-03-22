package com.project.durian.controller;


import com.project.durian.dto.ProductCategoryDTO;
import com.project.durian.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("admin-category")
public class AdminCategoryController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("categories", productService.categories()); /* category? */
        return "admin-category/index";
    }

    @GetMapping("/add")
    private String getCategoryAddForm(Model model) {
        model.addAttribute("category", new ProductCategoryDTO());
        
        return "admin-category/add-category";
    }

    @PostMapping
    private String addCategory(@Valid @ModelAttribute("category") ProductCategoryDTO category, BindingResult bindingResult,
                               Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("category", new ProductCategoryDTO());
            return "admin-category/add-category";
        }
        productService.addCategory(category);
        return list(model);
    }

    @GetMapping("/{id}")
    private String get(@PathVariable Long id, Model model) {
        model.addAttribute("category", productService.getCategory(id));
        return "admin-category/view-category";
    }

    @PutMapping
    private String updateCategory(ProductCategoryDTO category, Model model) {
        productService.updateCategory(category);
        return list(model);
    }

    @DeleteMapping
    private String deleteCategory(ProductCategoryDTO category, Model model) {
        productService.deleteCategory(category.getId());
        return list(model);
    }
}
