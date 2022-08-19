package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static shoppingcart.Constants.DOVESOAP;

public class AddToCartTest {
    @Test
    public void addToCart(){
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product(DOVESOAP,39.99);
        cart.addToCart(new LineItem(product,10));
        int size = 1;
        Assertions.assertEquals(size,cart.getItemList().size());
    }
}
