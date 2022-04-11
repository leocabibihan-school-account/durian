package com.project.durian.services.impl;

import com.project.durian.dto.ProductDTO;
import com.project.durian.model.Product;
import com.project.durian.repository.ProductRepository;
import com.project.durian.services.FileStorageService;
import com.project.durian.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> list() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(ProductDTO productDTO) {
        Product product = new Product(productDTO);
        if (productDTO.getImage() != null) {
            fileStorageService.save(productDTO.getImage());
            product.setImageLocation(productDTO.getImage().getOriginalFilename());
        }
        productRepository.save(product);
    }

    @Override
    public ProductDTO get(Long id) {
        return new ProductDTO(productRepository.findById(id).get());
    }

    @Override
    public void update(ProductDTO productDTO) {
        Product product = productRepository.findById(productDTO.getId()).get();
//        if (productDTO.getImage() != null) {
//            fileStorageService.save(productDTO.getImage());
//            product.setImageLocation(productDTO.getImage().getOriginalFilename());
//        } else {
//            productDTO.setImageLoc(product.getImageLocation());
//        }
        productDTO.setImageLoc(product.getImageLocation());

        productRepository.save(new Product(productDTO));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }


}