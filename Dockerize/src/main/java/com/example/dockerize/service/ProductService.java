package com.example.dockerize.service;

import com.example.dockerize.entity.Product;
import com.example.dockerize.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public void saveAll(Product product){
         productRepository.save(product);
    }
}
