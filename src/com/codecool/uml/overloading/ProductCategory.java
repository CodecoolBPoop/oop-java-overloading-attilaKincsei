package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;


class ProductCategory {

    private int id;

    static List<Integer> idList = new ArrayList(0);

    private String name;

    private String department;

    private String description;

    static List<ProductCategory> productCategories = new ArrayList<>(); // unnecessary

    public ProductCategory() {
        this.id = idList.size() + 1;
        idList.add(id);
        productCategories.add(this);
    }

    public ProductCategory(String name, String department, String description) {
        this.id = idList.size() + 1;
        idList.add(id);
        this.name = name;
        this.department = department;
        this.description = description;
        productCategories.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        return String.format("id:%d,name:%s,department:%s,description:%s", id, name, department, description);
    }

}
