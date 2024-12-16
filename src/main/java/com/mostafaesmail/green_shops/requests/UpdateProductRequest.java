package com.mostafaesmail.green_shops.requests;

import com.mostafaesmail.green_shops.Model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    private Long id;
    private BigDecimal price;
    private String name;
    private String description;
    private String brand;
    private int inventory;
    private Category category;
}
