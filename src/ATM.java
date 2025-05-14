import java.util.ArrayList;
import java.util.Scanner;

public class ATM{
    private ArrayList<String> availableBooks = new ArrayList<>();

    public void addBook(String bookName) {
        availableBooks.add(bookName);
    }

    public void borrowBook(String bookName) {
        if (availableBooks.contains(bookName)) {
            availableBooks.remove(bookName);
            System.out.println("You have borrowed: " + bookName);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void viewBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (String book : availableBooks) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        ATM library = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book 2. Borrow Book 3. View Available Books 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter book name to add:");
                    String bookNameToAdd = sc.nextLine();
                    library.addBook(bookNameToAdd);
                    break;
                case 2:
                    System.out.println("Enter book name to borrow:");
                    String bookNameToBorrow = sc.nextLine();
                    library.borrowBook(bookNameToBorrow);
                    break;
                case 3:
                    library.viewBooks();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
