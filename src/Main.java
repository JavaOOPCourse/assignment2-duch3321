import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        kukutjtjytjyt
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    break;

                case 5:
                    // TODO: Borrow book
                    break;

                case 6:
                    // TODO: Return book
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
