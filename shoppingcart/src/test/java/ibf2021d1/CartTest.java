package ibf2021d1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest {
    @Test

    public void testAdd(){
        Cart cart = new Cart();
        cart.addItem("durian");
        cart.addItem("mango");
        assertTrue(cart.numberOfItemsInCart() == 2);
        System.out.println("Assertion size = 2");
    }
}
