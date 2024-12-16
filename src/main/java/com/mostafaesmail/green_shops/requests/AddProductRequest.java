package com.mostafaesmail.green_shops.requests;

import com.mostafaesmail.green_shops.Model.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private BigDecimal price;
    private String name;
    private String description;
    private String brand;
    private int inventory;
    private Category category;

}
