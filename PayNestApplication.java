
Athenkosi Mdebuka <athenkosimdebuka44@gmail.com>
10:19 (0 minutes ago)
to me

public class PayNestApplication {

public static void main(String[] args) {

System.out.println("=== PAYNEST ORDER DEMONSTRATION ===");

// Step 1: Create products
Product laptop = new Product(1, "Laptop", 12000);
Product mouse = new Product(2, "Mouse", 250);

// Step 2: Create customer
Customer customer = new Customer(1, "Athenkosi");

// Step 3: Create order
Order order = new Order(1, customer);

// Step 4: Add products to order
order.addItem(laptop, 1);
order.addItem(mouse, 2);

// Step 5: Display order summary
order.printSummary();
}
}
