
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

@Test
void testOrderCalculateTotal() {

Customer customer = new Customer(1, "Athi");

Product product = new Product(1, "Laptop", 10000.00);

Order order = new Order(1, customer);

order.addItem(product, 2);

double total = order.calculateTotal();

assertEquals(20000.00, total, 0.01);
}
@Test
void testOrderCheckoutWithCardPayment() {

Customer customer = new Customer(1, "Athi");

Product product = new Product(1, "Laptop", 10000.00);

Order order = new Order(1, customer);

order.addItem(product, 2);

PaymentMethod paymentMethod = new CardPayment("123");

boolean result = order.checkout(paymentMethod);

assertTrue(result);
}
@Test
void testOrderCheckoutWithWalletPayment() {

Customer customer = new Customer(1, "Athi");

Product product = new Product(1, "Laptop", 10000.00);

Order order = new Order(1, customer);

order.addItem(product, 2);

PaymentMethod paymentMethod = new WalletPayment(25000.00);

boolean result = order.checkout(paymentMethod);

assertTrue(result);
}

}