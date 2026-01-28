package com.example.productmanagement.services;

import com.example.productmanagement.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>() ;

    public ProductService () {

        products.add ( new Product ( 1, "Laptop", 1200.0 ) ) ;
        products.add ( new Product ( 2, "Smartphone", 800.0 ) ) ;
        products.add ( new Product ( 3, "Tablet", 500.0 ) ) ;
    }

    public List<Product> getAllproducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public void updateProduct(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updatedProduct);
                return;
            }
        }
    }

    public void deleteProduct(int id) {
     products.removeIf(product -> product.getId() ==id) ;

    }

}
