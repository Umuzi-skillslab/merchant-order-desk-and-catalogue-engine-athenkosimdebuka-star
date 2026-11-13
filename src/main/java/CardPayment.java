
public class CardPayment implements PaymentMethod {

private String cvv;

public CardPayment(String cvv) {
this.cvv = cvv;
}

public boolean isValidCvv() {
return "123".equals(cvv);
}

@Override
public boolean processPayment(double amount) {

if (amount <= 0) {
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