package shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void productNameTest(){
        Product product = new Product("Dove",39.99);
        String productName = "Dove";
        Assertions.assertEquals(productName,product.getProductName());
    }
}
