package com.product.catalog.service;

import com.product.catalog.model.Product;
import com.product.catalog.repository.ProdRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServ {

    private final ProdRepo prodRepo;

    ProdServ(ProdRepo prodRepo) {
        this.prodRepo = prodRepo;
    }

    // get all products
    public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }

    // get by ID
    public Product getProductById(Long id) {
        return prodRepo.findById(id);
    }

    // create products
    public Product createProduct(Product product) {
        return prodRepo.save(product);
    }

    // delete product
    public void deleteProduct(Long id) {
        prodRepo.deleteProd(id);
    }

}
