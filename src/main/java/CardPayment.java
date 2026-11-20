
public class CardPayment implements PaymentMethod {

private final String cvv;

public CardPayment(String cvv) {
this.cvv = cvv;
}

public boolean isValidCvv() {
return "123".equals(cvv);
}

@Override
public boolean processPayment(double amount) {

if (!Double.isFinite(amount) || amount <= 0) {
System.out.println("Invalid payment amount.");
return false;
}

if (!isValidCvv()) {
System.out.println("Invalid CVV. Card payment declined.");
return false;
}

System.out.println("Processing card payment for R"
+ String.format("%.2f", amount));

return true;
}

@Override
public String getPaymentType() {
return "CARD";
}
}