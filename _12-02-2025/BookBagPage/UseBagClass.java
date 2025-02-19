import java.util.Scanner;

public class UseBagClass {
    private static final Scanner scanner = new Scanner(System.in);
    private static Bag bag = new Bag();
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Construct a Bag");
            System.out.println("2. Add Books");
            System.out.println("3. Search by Keyword");
            System.out.println("4. Find Book with Most Keyword Occurrences");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> {
                    bag = new Bag();
                    System.out.println("New bag created!");
                }
                    
                case 2 -> addBook();
                    
                case 3 -> searchByKeyword();
                    
                case 4 -> findBookWithMostOccurrences();
                    
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                    
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    
    private static void addBook() {
        if (bag.getSize() >= 10) {
            System.out.println("Bag is full!");
            return;
        }
        
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        
        Book book = new Book(bookName, author);
        
        System.out.print("Enter number of pages: ");
        int numPages = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numPages; i++) {
            System.out.print("Enter text for page " + (i + 1) + ": ");
            String text = scanner.nextLine();
            book.addPage(new Page(text));
        }
        
        bag.insertBook(book);
        System.out.println("Book added successfully!");
    }
    
    private static void searchByKeyword() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        
        Book[] found = bag.searchByKeyword(keyword);
        if (found.length == 0) {
            System.out.println("No books found containing the keyword.");
        } else {
            System.out.println("Found books:");
            for (Book book : found) {
                System.out.println("- " + book.getBookName() + " by " + book.getAuthor());
                System.out.println("  Occurrences: " + book.countKeywordOccurrences(keyword));
            }
        }
    }
    
    private static void findBookWithMostOccurrences() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        
        Book book = bag.searchBookWithMostOccurrences(keyword);
        if (book != null) {
            System.out.println("Book with most occurrences of '" + keyword + "':");
            System.out.println("- " + book.getBookName() + " by " + book.getAuthor());
            System.out.println("  Occurrences: " + book.countKeywordOccurrences(keyword));
        } else {
            System.out.println("No books found.");
        }
    }
}