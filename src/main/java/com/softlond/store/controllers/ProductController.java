package com.softlond.store.controllers;

import com.softlond.store.entities.Product;
import com.softlond.store.services.contracts.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    private ResponseEntity<List<Product>> getAllProducts() {
        return this.iProductService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return this.iProductService.created(product);
    }
}
