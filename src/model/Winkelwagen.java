package model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * Pattern examples
 */
public class Winkelwagen {
    // static field kenmerk 2.
    private static Winkelwagen instance;

    // variable
    private final List<Product> productList;

    // private constructor kenmerk 1.
    private Winkelwagen(){
        this.productList = new ArrayList<>();
    }

    // Winkelwagen.getInstance() kenmerk 3.
    public static Winkelwagen getInstance() {
        if (instance == null)
            instance = new Winkelwagen();

        return instance;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }


    // iterator pattern
//    public Iterator<Product> getIterator() {
//        return new ProductIterator();
//    }
//
//    private class ProductIterator implements Iterator<Product> {
//        int index;
//
//        @Override
//        public boolean hasNext() {
//
//            return index < productList.size();
//        }
//
//        @Override
//        public Product next() {
//            return productList.get(index++);
//        }
//    }


    // command pattern
//    public void getWinkelwagen(Product product) {
//        return
//    }

} // end of class Winkelwagen
