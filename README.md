
# Merchant Order Desk and Catalogue Engine

## Project Description

This project is a Java application that simulates a merchant order desk system.

The application allows:
- Creation of products
- Creation of customers
- Creation of orders
- Adding products to an order
- Calculating order totals
- Displaying an order summary

## Setup Instructions

### Requirements
- Java JDK 21 or later
- Maven
- Visual Studio Code or another Java IDE

### Clone the Repository

```bash
git clone <repository-url>
```

### Open the Project

1. Open Visual Studio Code.
2. Select **File > Open Folder**.
3. Select the cloned project folder.
4. Allow Maven to load the project.

### Build the Project

Run the following command in the terminal:

```bash
mvn clean package
```

### Run the Tests

```bash
mvn test
```

## Demonstration Workflow

The application demonstrates the following workflow:

### Step 1: Create Products

```java
Product laptop = new Product(1, "Laptop", 12000);
Product mouse = new Product(2, "Mouse", 250);
```

### Step 2: Create Customer

```java
Customer customer = new Customer(1, "Athenkosi");
```

### Step 3: Create Order

```java
Order order = new Order(1, customer);
```

### Step 4: Add Products to Order

```java
order.addItem(laptop, 1);
order.addItem(mouse, 2);
```

### Step 5: Print Order Summary

```java
order.printSummary();
```

## Expected Output

The program displays:
- Customer details
- Ordered products
- Quantities
- Item totals
- Grand total

## Author

Athenkosi Mdebuka

---

# Capstone 3 - Unified Checkout Across Payment Rails

## Project Description

This project extends the Merchant Order Desk and Catalogue Engine with a unified checkout system that supports multiple payment methods.

The checkout system allows customers to select one payment method for their order.

## Supported Payment Methods

The application supports three payment methods:

- Card Payment
- EFT Payment
- PayNest Wallet Payment

All payment methods implement the `PaymentMethod` interface.

The `Order` class calculates the order total and passes it to the selected payment method through the checkout process.

## Unified Checkout

The application displays the available payment methods and allows the customer to select one:

1. Card
2. EFT
3. Wallet

The selected payment method is processed through the common `PaymentMethod` interface.

This allows the checkout system to process different payment methods without requiring separate checkout logic for each payment type.

## Payment Validation

The application performs shared validation for all payment methods to ensure that payment amounts are valid and greater than zero.

It also includes payment-specific validation:

- Card payments validate the CVV.
- Wallet payments check whether the available balance is sufficient.
- EFT payments use the shared payment amount validation.

These validations help ensure that payments are processed only when the required conditions are met.

## Testing

JUnit 5 tests cover:

- Valid and invalid payment amounts
- Negative payment amounts
- Valid and invalid card CVV
- EFT payment processing
- Wallet payment with insufficient balance
- Successful payment processing

Run the tests using:

```bash
mvn test
```

## Technologies

- Java 21
- Maven
- JUnit 5

## Project Structure

The project includes the following main classes:

- `PayNestApplication` - Runs the application and allows the customer to select a payment method.
- `Order` - Manages order items, calculates totals and handles checkout.
- `OrderItem` - Represents products and their quantities in an order.
- `Product` - Represents products available for purchase.
- `Customer` - Stores customer information.
- `PaymentMethod` - Common interface for all payment methods.
- `CardPayment` - Handles card payment processing and CVV validation.
- `EftPayment` - Handles EFT payment processing.
- `WalletPayment` - Handles wallet payment processing and balance validation.
- `PaymentProcessor` - Processes payments and handles success or failure messages.

## Author

Athenkosi Mdebuka