package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static shoppingcart.ShoppingCartApp.getTotalBill;

public class MainTest {

    @Test
    public void testMain() {
        double total = 314.96;
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new LineItem(new Product("Dove",39.99),2));
        cart.addToCart(new LineItem(new Product("axe",99.99),2));
        cart.setTax(12.5);
        Assertions.assertEquals(total,getTotalBill(cart));
    }
}
