package com.product.catalog.repository;

import com.product.catalog.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProdRepo {

    private final Map<Long, Product> products = new HashMap<>();

    private Long nextId = 1L;

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product findById(Long id) {
        return products.get(id);
    }

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(nextId++);
        }

        products.put(product.getId(), product);
        return product;
    }

    public void deleteProd(Long id) {
        products.remove(id);
    }
}
