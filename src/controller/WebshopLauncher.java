package controller;

import model.Product;
import model.ProductFactory;
import model.Winkelwagen;

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
        Winkelwagen winkelwagen1 = Winkelwagen.getInstance();
        Winkelwagen winkelwagen2 = Winkelwagen.getInstance();
        Winkelwagen winkelwagen3 = Winkelwagen.getInstance();

        winkelwagen1.addProduct(product1);
        winkelwagen2.addProduct(product2);
        winkelwagen3.addProduct(product3);

        System.out.println();
        System.out.println("winkelwagen1 == winkelwagen2: " + (winkelwagen1 == winkelwagen2));
        System.out.println("winkelwagen1 == winkelwagen3: " + (winkelwagen1 == winkelwagen3));
        System.out.println();

        List<Product> productsInWinkelwagen = winkelwagen1.getProductList();

        for (int item = 0; item < productsInWinkelwagen.size(); item++) {
            System.out.println(productsInWinkelwagen.get(item));
        }
        System.out.println();

        // 3. Factory Pattern
        Product computer = ProductFactory.createProduct("computer");
        assert computer != null;
        computer.withProductName("laptop").withBrand("Dell")
                .withPrice(600)
                .withCategory("Computer")
                .withAmount(10);;

        Product tv = ProductFactory.createProduct("tv");
        assert tv != null;
        tv.withProductName("tv")
                .withBrand("Philips")
                .withPrice(200)
                .withCategory("HiFi")
                .withAmount(5);

        System.out.println(computer);
        System.out.println(tv);
        System.out.println();

        // zelf invullen
        System.out.print("Wat voor een soort product wil je kopen? ");
        String productType = toetsenbord.nextLine();

        Product product = ProductFactory.createProduct(productType);
        assert product != null;
        product.printType();

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
