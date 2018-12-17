package iceCreamShopApplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class IceCreamTest {
    @Test
    void testCupIcecream() {
            CupIceCream cupIceCream = new CupIceCream("Strawberry", "Cream");
            String message = cupIceCream.eat();
            String expected = "The Strawberry ice-cream with Cream is eaten with a spoon";
            assertEquals(expected, message );
    }

    @Test
    void testConIcecream() {
        ConeIceCream coneIceCream = new ConeIceCream("vanilla", "choclate");
        String message = coneIceCream.eat();
        String expected = "The vanilla ice-cream with choclate is licked.";
        assertEquals(expected, message);
    }
}