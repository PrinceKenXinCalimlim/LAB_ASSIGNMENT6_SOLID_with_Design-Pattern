public class BookProcessor {

    private Student student;
    private Book book;

    public BookProcessor(Student student, Book book) {
        this.student = student;
        this.book = book;
    }

    public void processBook() {
        book.borrow(student.getTitle());
    }
}
