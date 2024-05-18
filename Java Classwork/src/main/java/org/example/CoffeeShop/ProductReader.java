//package org.example.CoffeeShop;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductReader {
//
//    public List<Product> Products() {
//        List<Product> products = new ArrayList<>();
//
//        try {
//            File file = new File("products.txt");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//
////            String header = bufferedReader.readLine();
////            String product = bufferedReader.readLine();
////
////            System.out.println(header);
////            System.out.println(product);
////
////
////            Product p = parseProduct(product);
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                Product p = parseProduct(line);
//                products.add(p);
//                line = bufferedReader.readLine();
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return products;
//    }
//
//
//    //split into positions
//    private Product parseProduct(String line) {
//
//
//        //instantiate a product
//        Product result = new Product();
//
//        String[] column = line.split(",");
//        result.setName(column[0]);
//
//        int quantity = Integer. (column[2]);//??
//        result.setQuantityAvailable(quantity);
//
//        boolean beverage = Boolean.parseBoolean(column[3]);
//        result.setBeverage(beverage);
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        ProductReader pr = new ProductReader();
//        pr.readProducts();
//    }
//}
