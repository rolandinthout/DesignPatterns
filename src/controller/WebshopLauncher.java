package controller;

import model.Product;
//import model.ProductFactory;
import model.Winkelwagen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * All data of a product
 */
public class WebshopLauncher {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        // 1. Builder pattern
        Product product1 = new Product()
                .withProductName("laptop")
                .withBrand("Dell")
                .withPrice(600)
                .withCategory("Computer")
                .withAmount(10);
        Product product2 = new Product()
                .withProductName("mouse")
                .withBrand("Logitech")
                .withPrice(20)
                .withCategory("Computer")
                .withAmount(20);
        Product product3 = new Product()
                .withProductName("tv")
                .withBrand("Philips")
                .withPrice(200)
                .withCategory("HiFi")
                .withAmount(5);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // 2. Singleton pattern
        Winkelwagen.getInstance().addProduct(product1);
        Winkelwagen.getInstance().addProduct(product2);
        Winkelwagen.getInstance().addProduct(product3);

        Winkelwagen w1 = Winkelwagen.getInstance(product1);
        Winkelwagen w2 = Winkelwagen.getInstance(product2);
        Winkelwagen w3 = Winkelwagen.getInstance(product3);


        // 3. Factory Pattern
//        System.out.print("Wat voor een soort product wil je kopen? ");
//        String productType = toetsenbord.nextLine();
//        Product product = ProductFactory.createProduct(productType);
//        System.out.println(product);

//        Product product = ProductFactory.createProduct("computer");
//        product.printProductType();

        // 4. Iterator Pattern
//        List<Product> products = new ArrayList<>();
//        products.add(new Product());
//        products.add(null);
//        Winkelwagen productNames = new Winkelwagen(products);
//
//        for (Iterator<Product> iter = productNames.getIterator(); iter.hasNext();){
//            Product product = (Product) iter.next();
//            System.out.println("Product productName" + product.getProductName());
//        }

        // 5. Command Pattern

    }

} // end of class WebshopLauncher
