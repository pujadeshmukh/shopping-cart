package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductPriceTest {
    @Test
    public void calculatePrice(){
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Dove",50);
        cart.addToCart(new LineItem(product,10));
        int price = 500;
        Assertions.assertEquals(price,cart.getTotalBill());
    }
}
