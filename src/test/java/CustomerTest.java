import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

@Test
void testCustomerDetails() {
Customer customer = new Customer(1, "Athenkosi");

assertEquals(1, customer.getId());
assertEquals("Athenkosi", customer.getName());
}
}
