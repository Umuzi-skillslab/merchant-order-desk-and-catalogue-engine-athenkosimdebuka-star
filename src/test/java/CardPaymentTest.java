
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardPaymentTest {

@Test
void testValidCvv() {
CardPayment cardPayment = new CardPayment("123");

assertTrue(cardPayment.isValidCvv());
}

@Test
void testInvalidCvv() {
CardPayment cardPayment = new CardPayment("456");

assertFalse(cardPayment.isValidCvv());
}

@Test
void testCardPaymentWithInvalidCvv() {
CardPayment cardPayment = new CardPayment("456");

boolean result = cardPayment.processPayment(100.00);

assertFalse(result);
}
}