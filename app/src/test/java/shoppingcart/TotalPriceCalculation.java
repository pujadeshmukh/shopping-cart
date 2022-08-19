package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TotalPriceCalculation {
    @Test
    public void calculatePrice(){
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Dove",39.99);
        Product product2 = new Product("Axe",99.99);
        cart.addToCart(new LineItem(product1,2));
        cart.addToCart(new LineItem(product2,2));
        cart.setTax(12.5);
        double price = 314.96;
        Assertions.assertEquals(price, ShoppingCartApp.getTotalBill(cart));
    }
}
