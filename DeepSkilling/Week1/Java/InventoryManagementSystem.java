



import java.util.HashMap;

public class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return "Product ID: " + productId +
                    ", Product Name: " + productName +
                    ", Quantity: " + quantity +
                    ", Price: " + price;
        }
    }

    public static void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added Successfully");
    }

    public static void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product Updated Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public static void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product Deleted Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public static void displayProducts() {
        System.out.println("\nInventory Details:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 20, 55000));
        addProduct(new Product(102, "Mouse", 50, 500));
        addProduct(new Product(103, "Keyboard", 30, 1200));

        displayProducts();

        updateProduct(101, 25, 56000);

        deleteProduct(102);

        displayProducts();
    }
}