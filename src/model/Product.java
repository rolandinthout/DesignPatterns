package model;


/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * All data of a product
 */
public class Product {
    private String productName;
    private String brand;
    private double price;
    private String category;
    private int amount;



    public void addAmount(){
        System.out.println("Stock [ Name: "+ productName +", Quantity: " + amount +" ] bought");
    }
    public void decreaseAmount(){
        System.out.println("Stock [ Name: "+ productName +", Quantity: " + amount +" ] sold");
    }

    @Override
    public String toString() {
        return String.format(
                "productName: %s, brand: %s, price: %s, category: %s, amount: %s",
                this.productName, this.brand, this.price, this.category, this.amount);
    }

     public Product withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public Product withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Product withPrice(double price) {
        this.price = price;
        return this;
    }

    public Product withCategory(String category) {
        this.category = category;
        return this;
    }

    public Product withAmount(int amount) {
        this.amount = amount;
        return this;
    }


} // end of class product
