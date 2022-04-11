package com.project.durian.controller;

import com.project.durian.dto.ProductDTO;
import com.project.durian.services.FileStorageService;
import com.project.durian.services.ProductService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("images")
public class ImageController {

    @Autowired
    private ProductService productService;

    @Autowired
    private FileStorageService fileStorageService;


    @GetMapping(value = "/{id}/product")
    private ResponseEntity<Resource> getImage(@PathVariable Long id, Model model) throws IOException {
        ProductDTO productDTO = productService.get(id);
        Resource resource = fileStorageService.load(productDTO.getImageLoc());
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(resource.contentLength())
                .body(resource);
    }

}