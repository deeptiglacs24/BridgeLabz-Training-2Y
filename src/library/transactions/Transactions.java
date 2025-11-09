package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transactions {
    private Book book;
    private Member member;
    private String status; // "Issued" or "Returned"

    public Transactions(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.status = "Pending";
    }

    public void issueBook() {
        if (!book.isIssued()) {
            book.issueBook();
            status = "Issued";
            System.out.println("Book issued to member: " + member.getName());
        } else {
            System.out.println("Cannot issue book. Already issued.");
        }
    }

    public void returnBook() {
        if (book.isIssued()) {
            book.returnBook();
            status = "Returned";
            System.out.println("Book returned by member: " + member.getName());
        } else {
            System.out.println("Book was not issued.");
        }
    }

    @Override
    public String toString() {
        return "Transaction [Book=" + book.getTitle() + ", Member=" + member.getName() + ", Status=" + status + "]";
    }
}
