package com.example.dockerize.controller;

import com.example.dockerize.entity.Product;
import com.example.dockerize.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getSlot() {
        return ResponseEntity.ok().body(productService.getAll());
    }

    @GetMapping("/test")
    public ResponseEntity<String> testAPI() {
        return ResponseEntity.ok().body("Successfully");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test1API() {
        return ResponseEntity.ok().body("Failed");
    }
}
