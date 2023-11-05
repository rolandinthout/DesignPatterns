package model;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * Purpose of the program
 */
public class ProductFactory {

    public static Product createProduct(String productType) {
        switch (productType) {
            case "computer":
                return new Computer();
            case "radio":
                return new Radio();
            case "tv":
                return new TV();
            case "hifi":
                return new HiFi();
            default:
                System.out.println("invalid type");
        }
        return null;
    }

} // end of class ProductFactory
