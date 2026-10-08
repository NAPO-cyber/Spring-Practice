package com.product.catalog.controller;

import com.product.catalog.model.Product;
import com.product.catalog.service.ProdServ;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog/products")
public class ProdController {

    private final ProdServ prodServ;

    public ProdController(ProdServ prodServ) {
        this.prodServ = prodServ;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return prodServ.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return prodServ.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return prodServ.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        prodServ.deleteProduct(id);
    }

}
