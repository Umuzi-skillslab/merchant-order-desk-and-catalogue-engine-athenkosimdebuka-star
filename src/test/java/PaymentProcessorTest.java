
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
void testProcessorRejectsInvalidCvv() {
PaymentProcessor processor = new PaymentProcessor();
PaymentMethod paymentMethod = new CardPayment("999");

boolean result = processor.processPayment(paymentMethod, 100);

assertFalse(result);
}

@Test
void testProcessorAcceptsValidCvv() {
PaymentProcessor processor = new PaymentProcessor();
PaymentMethod paymentMethod = new CardPayment("123");

boolean result = processor.processPayment(paymentMethod, 100);

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

@Test
void testWalletPaymentSuccessful() {
WalletPayment walletPayment = new WalletPayment(200);

boolean result = walletPayment.processPayment(100);

assertTrue(result);
assertEquals(100, walletPayment.getWalletBalance());
}

@Test
void testNullPaymentMethod() {
PaymentProcessor processor = new PaymentProcessor();

boolean result = processor.processPayment(null, 100);

assertFalse(result);
}
}
