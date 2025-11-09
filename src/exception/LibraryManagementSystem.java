package exception;
import java.util.*;

//Custom Exceptions
class BookNotAvailableException extends Exception {
 public BookNotAvailableException(String message) {
     super(message);
 }
}

class InvalidReturnException extends Exception {
 public InvalidReturnException(String message) {
     super(message);
 }
}

class UserLimitExceededException extends Exception {
 public UserLimitExceededException(String message) {
     super(message);
 }
}

//Library class
class Library {
 private Map<String, Boolean> books = new HashMap<>();  // book name → available or not
 private Map<String, List<String>> userRecords = new HashMap<>(); // user → borrowed books

 public Library() {
     // Predefined books
     books.put("Java Basics", true);
     books.put("Python Guide", true);
     books.put("C++ Handbook", true);
     books.put("Data Structures", true);
 }

 // Borrow a book
 public void borrowBook(String user, String book)
         throws BookNotAvailableException, UserLimitExceededException {
     if (!books.containsKey(book) || !books.get(book)) {
         throw new BookNotAvailableException("Book '" + book + "' is not available right now!");
     }

     List<String> borrowed = userRecords.getOrDefault(user, new ArrayList<>());

     if (borrowed.size() >= 5) {
         throw new UserLimitExceededException(user + " cannot borrow more than 5 books!");
     }

     borrowed.add(book);
     userRecords.put(user, borrowed);
     books.put(book, false);

     System.out.println("✅ " + user + " borrowed '" + book + "'");
 }

 // Return a book
 public void returnBook(String user, String book) throws InvalidReturnException {
     List<String> borrowed = userRecords.getOrDefault(user, new ArrayList<>());

     if (!borrowed.contains(book)) {
         throw new InvalidReturnException("Book '" + book + "' was not borrowed by " + user);
     }

     borrowed.remove(book);
     books.put(book, true);
     System.out.println("✅ " + user + " returned '" + book + "'");
 }
}

//Main class
public class LibraryManagementSystem {
 public static void main(String[] args) {
     Library lib = new Library();

     System.out.println("=== Library Management System ===");

     try {
         lib.borrowBook("Alice", "Java Basics");
         lib.borrowBook("Alice", "Python Guide");
         lib.returnBook("Alice", "C++ Handbook");  // Invalid return
     } catch (BookNotAvailableException | InvalidReturnException | UserLimitExceededException e) {
         System.out.println("❌ Error: " + e.getMessage());
     }
 }
}

