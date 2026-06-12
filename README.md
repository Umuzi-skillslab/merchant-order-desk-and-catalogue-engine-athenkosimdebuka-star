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

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in Visual Studio Code or any Java IDE.

3. Ensure Java JDK 17 (or later) is installed.

4. Compile all Java files.

5. Run:

```bash
PayNestApplication.java
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

### Step 4: Add Products To Order

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
