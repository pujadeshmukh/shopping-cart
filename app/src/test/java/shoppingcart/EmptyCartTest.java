package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmptyCartTest {
    @Test
    public void isEmptyCart(){
        ShoppingCart cart = new ShoppingCart();
        int listSize = 0;
        Assertions.assertEquals(listSize,cart.getItemList().size());
    }
}
