public class WalletPayment implements PaymentMethod {

private double walletBalance;

public WalletPayment(double walletBalance) {
this.walletBalance = walletBalance;
}

@Override
public boolean processPayment(double amount) {

if (amount <= 0) {
System.out.println("Invalid payment amount.");
return false;
}

if (walletBalance < amount) {
System.out.println("Insufficient wallet balance.");
return false;
}

System.out.println("Processing wallet payment for R"
+ String.format("%.2f", amount));

walletBalance -= amount;

return true;
}

@Override
public String getPaymentType() {
return "WALLET";
}

public double getWalletBalance() {
return walletBalance;
}
}