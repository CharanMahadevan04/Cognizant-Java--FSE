package com.cognizant.search;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        int searchId = 103;

        Product result = SearchService.linearSearch(products, searchId);

        if (result != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result.getProductId());
            System.out.println("Name: " + result.getProductName());
            System.out.println("Category: " + result.getCategory());
        } else {
            System.out.println("Product Not Found");
        }
    }
}