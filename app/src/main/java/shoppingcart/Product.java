package shoppingcart;

public class Product {
    private String productName;
    private double productPrice;
    public String getProductName() {
        return productName;
    }

    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice(){
        return productPrice;
    }

}
