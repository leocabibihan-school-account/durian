package com.project.durian.services;

import com.project.durian.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDTO> list(Boolean storeFilter);

    List<ProductDTO> list();

    void add(ProductDTO productDTO);

    ProductDTO get(Long id);

    void update(ProductDTO productDTO);

    void delete(Long id);

}
