package com.codecool.uml.overloading;

import java.sql.Date;
import java.util.Currency;
import java.util.List;

public class Webshop {

    private static Currency defaultCurrency = Currency.getInstance("USD");

    private static ProductCategory toys = new ProductCategory(
            "Toys", "Entertainment", "All kinds of toys for kids under 10"
    );
    private static ProductCategory music = new ProductCategory(
            "Music", "Entertainment", "LPs, EPs, songs"
    );
    private static FeaturedProductCategory jewelry = new FeaturedProductCategory();


    private static Product reignInBlood = new Product("Reign In Blood", (float) 43.00, defaultCurrency);
    private static Product seasonsInTheAbyss = new Product("Seasons In The Abyss", (float) 26.99, defaultCurrency);
    private static Product teddyBear = new Product("Teddy Bear", (float) 6.59, defaultCurrency);
    private static Product weddingRingWithDiamond = new Product("Wedding Ring With Diamond", (float) 179.99, defaultCurrency);
    private static Supplier virginRecords = new Supplier("Virgin Records", "A big fuckin' record company");
    private static Supplier gemsbrokers = new Supplier("Gemsbrokers", "We deal in prescious stones");

    private static void settingProductCategories() {
        reignInBlood.setProductCategory(music);
        reignInBlood.setSupplier(virginRecords);
        seasonsInTheAbyss.setProductCategory(music);
        seasonsInTheAbyss.setSupplier(virginRecords);
        teddyBear.setProductCategory(toys);
        jewelry.setName("Jewelry");
        jewelry.setDepartment("Luxury");
        jewelry.setDescription("Prescious stones, metals, works of art");
        jewelry.schedule(Date.valueOf("2018-06-25"), Date.valueOf("2018-06-30"));
        weddingRingWithDiamond.setProductCategory(jewelry);
        weddingRingWithDiamond.setSupplier(gemsbrokers);
    };

    private static void settingSuppliers() {

    }

    public static void main(String[] args) {
	// write your code here
        settingProductCategories();
//        for (ProductCategory category : ProductCategory.productCategories) {
//            System.out.println(category);
//        }
//        System.out.println(reignInBlood);
//        System.out.println(weddingRingWithDiamond);
        List<Product> productList = Product.getAllProductsBy(gemsbrokers);
        for (Product oneProduct : productList) {
            System.out.println(oneProduct);
        }
        System.out.println(gemsbrokers.getProducts());
    }
}
