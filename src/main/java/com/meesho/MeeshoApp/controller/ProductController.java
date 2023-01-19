package com.meesho.MeeshoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meesho.MeeshoApp.dto.ProductData;
import com.meesho.MeeshoApp.services.ProductServices;




@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
    private ProductServices productService;

    @GetMapping("/allProduct")
    public List<ProductData> findAll() {
        return productService.findAll();
    }
    @GetMapping("/ProductFindId/{id}")
    public ProductData findById(@PathVariable  Long id) {
        return productService.findById(id);
    }
    @PostMapping("/ProductCreate")
    public ProductData create(@RequestBody ProductData productData) {
        return productService.create(productData);
    }
    @DeleteMapping("/PoductDeleteId/{id}")
    public boolean delete(@PathVariable Long id) {
        return productService.delete(id);
    }

  //added
    @PutMapping("/productUpdateById/{id}")
    public ProductData updateProductById(@RequestBody ProductData productData, @PathVariable("id") Long productId) {
        return productService.update(productId, productData);

 


    }

}

