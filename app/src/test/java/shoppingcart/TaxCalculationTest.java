package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static shoppingcart.Constants.*;

public class TaxCalculationTest {


    @Test
    public void calculateTax(){
        ShoppingCart cart = new ShoppingCart();
        String sales = SALESTAX;
        Product product1 = new Product(DOVESOAP,39.99);
        Product product2 = new Product(AXEDEO,99.99);
        cart.addToCart(new LineItem(product1,2));
        cart.addToCart(new LineItem(product2,2));
        cart.setTax(12.5);
        double tax = 35.00;
        Assertions.assertEquals(tax,cart.getTax());
    }
}
