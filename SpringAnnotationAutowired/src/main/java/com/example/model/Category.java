package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private int categoryId = 1;
    private String categoryName = "Stationery";

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
