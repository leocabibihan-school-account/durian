package com.project.durian.services.impl;

import com.project.durian.dto.ProductDTO;
import com.project.durian.model.Product;
import com.project.durian.repository.ProductRepository;
import com.project.durian.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> list() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map((Product p) -> new ProductDTO(p))
                .collect(Collectors.toList());
    }

    @Override
    public void add(ProductDTO productDTO) {
        productRepository.save(new Product(productDTO));
    }

    @Override
    public ProductDTO get(Long id) {
        return new ProductDTO(productRepository.findById(id).get());
    }

    @Override
    public void update(ProductDTO productDTO) {
        productRepository.save(new Product(productDTO));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}