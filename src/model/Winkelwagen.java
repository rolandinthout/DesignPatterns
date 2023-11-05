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
    private static Winkelwagen single_instance;

    // variable
    private List<Product> productList = new ArrayList<>();

    private List<Order> orderList = new ArrayList<Order>();


    // private constructor kenmerk 1.
    private Winkelwagen() {
    }


    // iterator pattern
    public Iterator<Product> getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator<Product> {
        int index;

        @Override
        public boolean hasNext() {

            return index < productList.size();
        }

        @Override
        public Product next() {
            return productList.get(index++);
        }
    }


    // command pattern
    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }


    // Winkelwagen.getInstance() kenmerk 3.
    public static Winkelwagen getInstance() {
        if (single_instance == null)
            single_instance = new Winkelwagen();

        return single_instance;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

//    public void getWinkelwagen(Product product) {
//        return
//    }

} // end of class Winkelwagen
