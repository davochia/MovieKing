package com.wisekingdavid.movieking.model;

import java.util.List;

public class Category {
    String categoryName;
    List<CategoryItem> categoryItemList;

    public Category(String categoryName, List<CategoryItem> categoryItemList) {
        this.categoryName = categoryName;
        this.categoryItemList = categoryItemList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }
}
