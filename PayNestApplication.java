public class PayNestApplication {

public static void main(String[] args) {

Product laptop = new Product(1, "Laptop", 12000);
Product mouse = new Product(2, "Mouse", 250);

Customer customer = new Customer(1, "Athenkosi");

Order order = new Order(1, customer);

order.addItem(laptop, 1);
order.addItem(mouse, 2);

order.printSummary();
}
}
