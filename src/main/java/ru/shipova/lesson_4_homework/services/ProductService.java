package ru.shipova.lesson_4_homework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shipova.lesson_4_homework.entities.Product;
import ru.shipova.lesson_4_homework.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


}
