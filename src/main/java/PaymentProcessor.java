public class PaymentProcessor {

public boolean processPayment(PaymentMethod method, double amount) {
    if (amount <= 0) {
System.out.println("Invalid payment amount.");
return false;
}

boolean success = method.processPayment(amount);

if (success) {
System.out.println("Payment successful via "
+ method.getPaymentType());

System.out.println("Amount: R"
+ String.format("%.2f", amount));

} else {
System.out.println("Payment failed via "
+ method.getPaymentType());
}

return success;
}
}
