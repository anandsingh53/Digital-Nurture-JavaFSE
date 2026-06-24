import java.util.Arrays;
import java.util.Comparator;

public class EcommercePlatformSearch {

    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "ID: " + productId +
                    ", Name: " + productName +
                    ", Category: " + category;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(104, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(102, "Headphones", "Accessories")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, 103);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        // Sort Array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, 103);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}