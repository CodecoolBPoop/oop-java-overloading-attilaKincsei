package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

class Product {

    private int id;

    private String name;

    private float defaultPrice;

    private Currency defaultCurrency;

    private ProductCategory productCategory;

    private Supplier supplier;

    private static List<Product> productList = new ArrayList<>();

    public Product() {
        this.id = productList.size() + 1;
        Product.productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = productList.size() + 1;
        Product.productList.add(this);
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : productList) {
            try {
                if (product.getProductCategory().getId() == productCategory.getId()) {
                    productsByCategory.add(product);
                }
            } catch (NullPointerException npe) {
                System.out.println(npe);
            }
        }
        return productsByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product product : productList) {
            try {
                if (product.getSupplier().getId() == supplier.getId()) {
                    productsBySupplier.add(product);
                }
            } catch (NullPointerException npe) {
                System.out.println(npe);
            }
        }
        return productsBySupplier;
    }

    @Override
    public String toString() {
        return String.format(
                "id:%d,name:%s,defaultPrice:%f,defaultCurrency:%s,productCategory:%s,supplier:%s",
                id, name, defaultPrice, defaultCurrency, productCategory, supplier);
    }
}
