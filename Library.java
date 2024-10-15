/*Here's a scenario-based question on ArrayList:

Scenario:

You are developing a simple library management system. You need to store and manage book information, including title, author, and publication year.

Task:

Write a Java program using ArrayList to store and retrieve book information. Implement the following methods:

1. addBook(Book book): Adds a new book to the library.
2. removeBook(String title): Removes a book by title.
3. getBook(String title): Retrieves a book by title.
4. displayBooks(): Displays all books in the library.*/

import java.util.ArrayList;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Publication Year: " + book.getPublicationYear());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Get Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book publication year: ");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    library.addBook(new Book(title, author, publicationYear));
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to retrieve: ");
                    String retrieveTitle = scanner.nextLine();
                    Book retrievedBook = library.getBook(retrieveTitle);
                    if (retrievedBook != null) {
                        System.out.println("Title: " + retrievedBook.getTitle() +
                                ", Author: " + retrievedBook.getAuthor() +
                                ", Publication Year: " + retrievedBook.getPublicationYear());
 } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

