package com.mostafaesmail.green_shops.dto;

import com.mostafaesmail.green_shops.Model.Category;
import com.mostafaesmail.green_shops.Model.Image;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private String name;
    private String brand;
    private BigDecimal price;
    // go back and see why did he change the name from quantity to inventory
    private int inventory;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
}
