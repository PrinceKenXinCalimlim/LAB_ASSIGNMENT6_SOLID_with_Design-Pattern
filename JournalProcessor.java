public class JournalProcessor {

    private Student student;
    private Journal journal;

    public JournalProcessor(Student student, Journal journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}

