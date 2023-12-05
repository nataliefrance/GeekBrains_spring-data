package ru.shipova.lesson_4_homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.shipova.lesson_4_homework.entities.Product;
import ru.shipova.lesson_4_homework.services.ProductService;

import java.util.List;

@Controller
@ComponentScan("ru.shipova.lesson_4_homework")
public class MainController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/products")
    public String showProductsPage(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "products";
    }

}
