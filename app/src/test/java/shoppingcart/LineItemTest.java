package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LineItemTest {
    @Test
    public void testLineItems(){
        Product product = new Product("dove",39.99);
        int quantity = 1;
        LineItem items = new LineItem(product,quantity);
        String productName = "dove";
        Assertions.assertEquals(productName,items.getProduct().getProductName());
    }
}
