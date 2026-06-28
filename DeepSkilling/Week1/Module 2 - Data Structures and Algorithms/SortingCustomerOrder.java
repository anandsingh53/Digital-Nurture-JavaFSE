public class SortingCustomerOrder {

    static class Order{
        int orderId;
        String customerName;
        double totalPrice;
        Order(int orderId, String customerName, double totalPrice) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalPrice = totalPrice;
        }

           void display() {
            System.out.println(orderId + "\t" + customerName + " \t" + totalPrice);
        }
    }

static void BubbleSort(Order[] orders){
    int n = orders.length;
    for(int i =0; i<n-1; i++){
        int flag =0;
        for(int j =0; j<n-1-i; j++){
            if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                 Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
            }
        }
        if (flag ==0) {
            break;
        }
    }
}

 static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        
         Order[] orders = {
                new Order(101, "Anand", 5500),
                new Order(102, "Rahul", 3200),
                new Order(103, "Priya", 8700),
                new Order(104, "Amit", 4500),
                new Order(105, "Neha", 6200)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            order.display();
        }

        
        BubbleSort(orders);

        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            order.display();
        }

       
        Order[] orders2 = {
                new Order(101, "Anand", 5500),
                new Order(102, "Rahul", 3200),
                new Order(103, "Priya", 8700),
                new Order(104, "Amit", 4500),
                new Order(105, "Neha", 6200)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders2) {
            order.display();
        }

        // Time Complexity Analysis
        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Bubble Sort : Best O(n), Average O(n^2), Worst O(n^2)");
        System.out.println("Quick Sort  : Best O(n log n), Average O(n log n), Worst O(n^2)");

        System.out.println("\nWhy Quick Sort is Preferred?");
        System.out.println("- Faster for large datasets.");
        System.out.println("- Average time complexity is O(n log n).");
        System.out.println("- Uses Divide and Conquer technique.");
        System.out.println("- Performs fewer comparisons than Bubble Sort.");
    }
}
