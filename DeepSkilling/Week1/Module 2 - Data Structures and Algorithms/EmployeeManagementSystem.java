public class EmployeeManagementSystem {

    
    static class Employee {
        int employeeId;
        String name;
        String position;
        double salary;

        Employee(int employeeId, String name, String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        void display() {
            System.out.println(employeeId + "\t" + name + "\t" + position + "\tRs. " + salary);
        }
    }

    static Employee[] employees = new Employee[10];
    static int count = 0;

   
    static void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
            System.out.println("Employee Added Successfully.");
        } else {
            System.out.println("Employee Array is Full.");
        }
    }

   
    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    
    static void traverseEmployees() {
        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

   
    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    
    public static void main(String[] args) {

        addEmployee(new Employee(101, "Anand", "Developer", 50000));
        addEmployee(new Employee(102, "Rahul", "Tester", 40000));
        addEmployee(new Employee(103, "Priya", "Manager", 70000));
        addEmployee(new Employee(104, "Neha", "HR", 45000));

        traverseEmployees();

        System.out.println("\nSearching Employee with ID 103:");
        searchEmployee(103);

        System.out.println("\nDeleting Employee with ID 102:");
        deleteEmployee(102);

        traverseEmployees();

        System.out.println("\nTime Complexity Analysis");
        System.out.println("Add Employee      : O(1)");
        System.out.println("Search Employee   : O(n)");
        System.out.println("Traverse Employee : O(n)");
        System.out.println("Delete Employee   : O(n)");

        System.out.println("\nLimitations of Arrays:");
        System.out.println("1. Fixed size.");
        System.out.println("2. Insertion and deletion are costly.");
        System.out.println("3. Memory may be wasted if array is not full.");
        System.out.println("4. Searching is slow for unsorted arrays.");

        System.out.println("\nWhen to Use Arrays:");
        System.out.println("1. When the number of elements is fixed.");
        System.out.println("2. When fast index-based access is required.");
        System.out.println("3. Suitable for small datasets.");
    }
}