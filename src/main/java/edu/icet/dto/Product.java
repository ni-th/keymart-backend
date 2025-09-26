package edu.icet.dto;

import edu.icet.enums.Category;

import java.time.LocalDateTime;

public class Product {
    private Integer productId;
    private String productName;
    private String productDescription;
    private Category category;
    private Double price;
    private Integer stockQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
