# TP OOP Exam: Java E-Commerce Console Application

## Getting Started

Welcome to my E-commerce Console Application

## Folder Structure

The workspace contains eight folders and a file:  
-Accounts  
-Interfaces  
-Inventory  
-Product_Categories  
-Shopping_Cart  
-Payment  
-Orders  
-App  
-AppTesting

Each folder has its own purpose and will be explained in the following sections.

### Accounts

This folder holds:  
**Account class:** It is designed as an abstract class to encapsulate common functionalities and properties shared by both types of accounts(customer and admin),it cannot be instantiated but it provides a structure for its subclasses to inherit and implement.  
**AdminAccount class:** It extends the abstract Account class and will serve as an admin account.  
**Customer class:** It is another extension of class Account and made for regular users of the application.  
**AdminAccounts class:** This class encapsulates an ArrayList named admins,which holds instances for admins, It's like a database for admin accounts.  
-The `isAdmin` method checks if a given username and password correspond to any existing admin account
**CustomerAccounts class:** This class also encapsulates an ArrayList named customers to store instances of customers. It's like a database for customer accounts.  
-The `addCustomer` method adds a customer to the list of customers  
-The `isCustomer` method checks if a given username and password correspond to any existing customer accounts  

### Interfaces

This folder holds:  
**UserAuthentication class:** This class manages user authentication processes and simulates a basic sign in/sign up menu  
-The `runUserAuthentication` method initiates the menu with options log in, sign up for a new account and quit for exiting the application  
-The `loginInterface` method asks the user to input username and password,verifies the credentials and then if successful connects the user to either the admin interface or the customer interface  
-The `createAccount` method is for customers visiting the application for the first time to create accounts and then it redirects them to customer interface  
**AdminInterface class:** This class provides an interactive interface presenting a menu of options for admins allowing them to view products, add products to inventory, update products, delete products, clear inventory, check low-stock and out-of-stock products, send ads to customers and log out.  
-The `run` method initializes the interface  
-The `chooseCategoryAndAdd` method allows the administrator to choose a product category and add products to the inventory based on the selected category.  
-The `delete` method asks admin to enter a product ID and removes the corresponding product from inventory  
-The `updateInventory` method allows to update the price of a product by providing its ID  
-The `sendAds` method sends an email to each and every customer in CustomerAccounts ArrayList  
**UserInterface class:** provides an interactive interface for regular users with a menu of options including browsing products,searching and filtering of products,managing their shopping cart,placing orders and logging out.  
-The `run` method initializes the interface  
-The `viewProducts` method displays products in a paginated format  
-The `searchProducts` method allows users to search for products by name or id  
-The `filterProducts` method allows users to filter products by category,price range or brand  
-The `viewCart` method displays the user's shopping cart  
-The `addToCart` method asks users to provide an id or name of product and then adds the product to their shopping cart with the desired quantity  
-The `removeFromCart` method allows users to remove a product or update its quantity  
-The `clearCart` clears the user's shopping cart  
-The `placeOrder` initiates the payment process

### Inventory

This folder holds:  
**Inventory class:** This class manages the product inventory of the e-commerce application.
It has an ArrayList for products.It provides functionalities for adding,removing and updating products.It also allows to filter products by category,brand and price range.Moreover,it checks for low and out-of-stock products  
-The constructor initializes the inventory with a list of products in various categories  
-The `getInventory` method return the products' ArrayList  
-The `addProduct` adds a new product to the inventory or updates the quantity if it exists  
-The `removeProduct` method removed a product from the inventory based on its ID  
-The `clearInventory` method clears the inventory  
-The `filterByCategory` method filters products based on category  
-The `filterByPrice` method filters products based on price range by asking users to input min price and max price  
-The `filterByBrand` method filters products by brand  
-The `searchByNameId` searches for a product by its name or id  
-The `update` method modifies the price of a product based on its ID  
-The `isLowStock` method checks if a product is low in stock(quantity<=10)  
-The `isOutOfStock` checks if a product is out of stock  
-The `checkLowStock` prints low-stock products  
-The `checkOutOfStock` prints out-of-stock products

### Product_Categories

This folder holds:  
**Product class:** It's an abstract class and represents the base class for various product categories  
**Books class:** extends the product class and represents a specific category.It provides essential getters and setters.  
-The `makeBook` static method allows the admin to input information to create a new 'Books' object without needing to instantiate a new 'Book' object outside.It will serve for storing it in the inventory.  
**Clothing,HomeAppliances,OfficeSupplies,PetSupplies,Security,VideoGames classes:** extend the product class and represent a specific category,provide getters and setters and a static method to create a reference  
**Electronics class:** is an abstract class that extends the product class,providing a common base for electronic products.It serves to create a foundation for more specific electronic products  
**Camera,Headphones,Smartphone,TV,Laptop classes:** extend the Electronics abstract class,provide getters and setters and a static method to create a reference

### Shopping_Cart

This folder holds:  
**Shopping_Cart class:** It represents a shopping cart in a HashMap of Product and Integer which represents the quantity of the product in the customer's shopping cart allowing customers to add,remove and view their shopping cart  
-The `getCart` method return the cart  
-The `cartIsEmpty` checks if the cart is empty  
-The `searchForProduct` searches for a product in the cart by its ID  
-The `addToCart` adds a specified quantity of a product to the cart considering stock availability  
-The `removeFromCart` removes a specified quantity of a product from the cart  
-The `getTotalPrice` calculates and returns the total price of products in the cart  
-The `clearCart` clears the cart  
-The `printCart` prints the contents of the shopping cart

### Payment

This folder holds:  
**Discount class:** represents a discount that can be applied during the payment process.It includes a discount code and the corresponding discount rate  
**Discounts class:** represents a collection of discount codes in the form of an ArrayList.The constructor adds certain discount codes to the collection  
-The `isValidDiscount` method checks if a given discount code is in the collection  
-The `getDiscount` method returns the discount rate associated with a valid discount code  
**Payment class:** handles the payment process for an order.It includes methods for processing payments using credit cards or PayPal,applying discounts,choosing a shipping method and printing the order details if the payment is successful  
-The `creditCardProcess` method takes credit card infos from the user  
-The `paypalProcess` method takes PayPal account infos from the user  
-The `pay` method initiates the payment process by providing a menu of options to allow the user to choose the payment method  
-The `applyDiscount` method applies a discount to the order  
-The `chooseShippingMethod` allows the user to choose a shipping method,updating the order total accordingly

### Orders

This folder holds:  
**Order class:** represents an order placed by a customer  
-The `getTotalPrice` method return the total price of the order  
-The `setTotalPrice` method allows updating the total price which will be useful when applying discounts  
-The `printOrder` method prints details about the order.It's sort of a reciept

### App

This folder holds:  
**App class:** serves as the entry point for running the application.  
-The `runApp` method creates instances of 'Inventory' and 'UserAuthentication' classes and initiates the user authentication process

### AppTesting

This file holds:  
**AppTesting class:** contains the main method which serves as the entry point for testing the application.It creates an instance of App class and runs the e-commerce application

## Additional Features

Apart from implementing the requirements, I have also added some additional features such as:

1. Discounts: Apply discounts to customers' orders
2. Shipping: Offer various shipping methods and update price accordingly

## Sign in

To sign in as an admin use the following accounts:

| Username | Password |
| -------- | -------- |
| admin1   | 1111     |
| admin2   | 2222     |
| admin3   | 3333     |
| admin4   | 4444     |
| admin5   | 5555     |

To sign in as a customer use the following accounts:

| Username | Password |
| -------- | -------- |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |
| user4    | pass4    |
| user5    | pass5    |
