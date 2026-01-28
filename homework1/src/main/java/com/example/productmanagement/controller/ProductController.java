package com.example.productmanagement.controller;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private final ProductService productService ;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping
    public List<Product> getAll () {
        return productService.getAllproducts(); 
        
    }
    
    //post
    @PostMapping
    public String add(@RequestBody Product product) {
        productService.addProduct(product);
        return "Thêm thành công!";
    }
    
    // update
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Product updatedProduct) {
        productService.updateProduct(id, updatedProduct);
        return "Cập nhật thành công!";
    }

    @DeleteMapping("/{id}")
    public String delete (@PathVariable int id ) {
        productService.deleteProduct(id);
        return "xoa thanh cong ";



    }
}
