
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

@Test
void testInvalidPaymentAmount() {
PaymentProcessor processor = new PaymentProcessor();
PaymentMethod paymentMethod = new CardPayment("123");

boolean result = processor.processPayment(paymentMethod, 0);

assertFalse(result);
}

@Test
void testNegativePaymentAmount() {
PaymentProcessor processor = new PaymentProcessor();
PaymentMethod paymentMethod = new CardPayment("123");

boolean result = processor.processPayment(paymentMethod, -100);

assertFalse(result);
}

@Test
void testInvalidCvv() {
CardPayment cardPayment = new CardPayment("999");

boolean result = cardPayment.processPayment(100);

assertFalse(result);
}

@Test
void testValidCvv() {
CardPayment cardPayment = new CardPayment("123");

boolean result = cardPayment.processPayment(100);

assertTrue(result);
}
@Test
void testEftPayment() {
PaymentProcessor processor = new PaymentProcessor();
PaymentMethod paymentMethod = new EftPayment();

boolean result = processor.processPayment(paymentMethod, 100);

assertTrue(result);
}
@Test
void testWalletPaymentInsufficientBalance() {
WalletPayment walletPayment = new WalletPayment(50);

boolean result = walletPayment.processPayment(100);

assertFalse(result);
assertEquals(50, walletPayment.getWalletBalance());
}
}
