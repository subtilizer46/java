package com.stackroute.oops;
import java.util.*;
/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode)
    {
        Product[] products=ProductRepository.getProducts();
        for (Product product : products) {
            if (product.getProductCode() == productCode) {
                return product.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category)
    {
        Product[] products=ProductRepository.getProducts();
        Product maxPriceProduct = null;
        double maxPrice = Double.MIN_VALUE;
        for (Product product : products) {
            if (product.getCategory().equals(category) && product.getPrice() > maxPrice) {
                maxPriceProduct = product;
                maxPrice = product.getPrice();
            }
        }
        return maxPriceProduct;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category)
    {
        Product[] products=ProductRepository.getProducts();
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                productsByCategory.add(product);
            }
        }
        if (productsByCategory.isEmpty()) {
            return null;
        } else {
            return productsByCategory.toArray(new Product[0]);
        }
    }
}
