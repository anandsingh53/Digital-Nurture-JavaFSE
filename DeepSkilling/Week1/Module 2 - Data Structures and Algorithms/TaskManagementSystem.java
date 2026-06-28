public class TaskManagementSystem {

    // Task Class
    static class Task {
        int taskId;
        String taskName;
        String status;
        Task next;

        Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }
    }

    static Task head = null;

    // Add Task
    static void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);

        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    static void searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Task Found:");
                System.out.println(temp.taskId + "\t" + temp.taskName + "\t" + temp.status);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    static void traverseTasks() {
        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        System.out.println("\nTask List:");
        Task temp = head;

        while (temp != null) {
            System.out.println(temp.taskId + "\t" + temp.taskName + "\t" + temp.status);
            temp = temp.next;
        }
    }

    // Delete Task
    static void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task Deleted Successfully.");
        }
    }

    // Main Method
    public static void main(String[] args) {

        addTask(1, "Design Database", "Pending");
        addTask(2, "Develop API", "In Progress");
        addTask(3, "Testing", "Pending");
        addTask(4, "Deployment", "Completed");

        traverseTasks();

        System.out.println("\nSearching Task with ID 2:");
        searchTask(2);

        System.out.println("\nDeleting Task with ID 3:");
        deleteTask(3);

        traverseTasks();

        System.out.println("\nTime Complexity Analysis");
        System.out.println("Add Task      : O(n)");
        System.out.println("Search Task   : O(n)");
        System.out.println("Traverse Task : O(n)");
        System.out.println("Delete Task   : O(n)");

        System.out.println("\nAdvantages of Linked List over Arrays:");
        System.out.println("1. Dynamic size.");
        System.out.println("2. Easy insertion and deletion.");
        System.out.println("3. No memory wastage due to fixed size.");
        System.out.println("4. Efficient for frequently changing data.");
    }
}