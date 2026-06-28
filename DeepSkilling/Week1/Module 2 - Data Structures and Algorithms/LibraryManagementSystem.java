public class LibraryManagementSystem {

    // Book Class
    static class Book {
        int bookId;
        String title;
        String author;

        Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println(bookId + "\t" + title + "\t" + author);
        }
    }

    // Linear Search
    static void linearSearch(Book[] books, String key) {
        boolean found = false;

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(key)) {
                System.out.println("Book Found (Linear Search):");
                book.display();
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Book Not Found.");
    }

    // Binary Search
    static void binarySearch(Book[] books, String key) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(key);

            if (result == 0) {
                System.out.println("Book Found (Binary Search):");
                books[mid].display();
                return;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        // Books should be sorted by title for Binary Search
        Book[] books = {
                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Java Programming", "James Gosling"),
                new Book(104, "Operating System", "Galvin"),
                new Book(105, "Python Programming", "Guido van Rossum")
        };

        System.out.println("Library Books:");
        for (Book b : books)
            b.display();

        System.out.println("\nSearching using Linear Search:");
        linearSearch(books, "Java Programming");

        System.out.println("\nSearching using Binary Search:");
        binarySearch(books, "Java Programming");

        System.out.println("\nTime Complexity");
        System.out.println("Linear Search : Best O(1), Worst O(n)");
        System.out.println("Binary Search : Best O(1), Worst O(log n)");

        System.out.println("\nWhen to Use:");
        System.out.println("Linear Search - Small or Unsorted Data");
        System.out.println("Binary Search - Large and Sorted Data");
    }
}