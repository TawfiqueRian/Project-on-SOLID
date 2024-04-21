/**
 * Title: This program demonstrates the Interface Segregation Principle by modeling an online shopping system.
 * Author: Md. Tawfiqul Islam, Undergraduate student, Khulna University
 */

/**
 * Interface for basic user functionalities.
 */
interface User {
    /**
     * Method to log in.
     */
    void login();

    /**
     * Method to browse products.
     */
    void browseProducts();
}

/**
 * Interface for seller functionalities.
 */
interface Seller {
    /**
     * Method to add a product.
     */
    void addProduct();

    /**
     * Method to update a product.
     */
    void updateProduct();
}

/**
 * Interface for customer functionalities.
 */
interface Customer {
    /**
     * Method to add an item to the cart.
     */
    void addToCart();

    /**
     * Method to checkout.
     */
    void checkout();
}

/**
 * Interface for admin functionalities.
 */
interface Admin {
    /**
     * Method to add a category.
     */
    void addCategory();

    /**
     * Method to manage users.
     */
    void manageUsers();
}

/**
 * Implementation of a basic user.
 */
class BasicUser implements User {
    @Override
    public void login() {
        System.out.println("Basic user logged in");
    }

    @Override
    public void browseProducts() {
        System.out.println("Basic user browsing products");
    }
}

/**
 * Implementation of a seller.
 */
class OnlineSeller implements User, Seller {
    @Override
    public void login() {
        System.out.println("Seller logged in");
    }

    @Override
    public void browseProducts() {
        System.out.println("Seller browsing products");
    }

    @Override
    public void addProduct() {
        System.out.println("Seller adding a product");
    }

    @Override
    public void updateProduct() {
        System.out.println("Seller updating a product");
    }
}

/**
 * Implementation of a customer.
 */
class CustomerUser implements User, Customer {
    @Override
    public void login() {
        System.out.println("Customer logged in");
    }

    @Override
    public void browseProducts() {
        System.out.println("Customer browsing products");
    }

    @Override
    public void addToCart() {
        System.out.println("Customer adding to cart");
    }

    @Override
    public void checkout() {
        System.out.println("Customer checking out");
    }
}

/**
 * Implementation of an admin.
 */
class AdminUser implements User, Admin {
    @Override
    public void login() {
        System.out.println("Admin logged in");
    }

    @Override
    public void browseProducts() {
        System.out.println("Admin browsing products");
    }

    @Override
    public void addCategory() {
        System.out.println("Admin adding a category");
    }

    @Override
    public void manageUsers() {
        System.out.println("Admin managing users");
    }
}

/**
 * Main class for the online shopping system.
 */
public class interface_segregation_principle {
    /**
     * Main method to demonstrate the usage of the online shopping system.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        BasicUser basicUser = new BasicUser();
        basicUser.login();
        basicUser.browseProducts();

        OnlineSeller onlineSeller = new OnlineSeller();
        onlineSeller.login();
        onlineSeller.addProduct();

        CustomerUser customer = new CustomerUser();
        customer.login();
        customer.addToCart();
        customer.checkout();

        AdminUser admin = new AdminUser();
        admin.login();
        admin.addCategory();
        admin.manageUsers();
    }
}
