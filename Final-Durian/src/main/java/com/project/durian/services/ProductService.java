package com.project.durian.services;

import com.project.durian.dto.ProductCategoryDTO;
import com.project.durian.dto.ProductDTO;
import com.project.durian.dto.ProductOptionDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> list();

    void add(ProductDTO productDTO);

    ProductDTO get(Long id);

    void update(ProductDTO productDTO);

    void delete(Long id);

    void addOption(ProductOptionDTO option);

    void deleteOption(Long id);

    void addCategory(ProductCategoryDTO category);

    List<ProductCategoryDTO> categories();

    ProductCategoryDTO getCategory(Long id);

    void updateCategory(ProductCategoryDTO category);

    void deleteCategory(Long id);


}
