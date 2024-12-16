package com.mostafaesmail.green_shops.service.product;

import com.mostafaesmail.green_shops.Model.Product;
import com.mostafaesmail.green_shops.requests.AddProductRequest;
import com.mostafaesmail.green_shops.requests.UpdateProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest addProductRequest);
    void deleteProductById(Long id);
    Product updateProduct(UpdateProductRequest request, Long id);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
