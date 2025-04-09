public class TestProgram {
    public static void main(String[] args) {
        
        Student stud1 = new Student("246", "Bateman", "Patrick", "American Psycho");
        BookProcessor process1 = new BookProcessor(stud1, new Book());
        process1.processBook();
    
        Student stud2 = new Student("456", "Corleone", "Michael", "The Godfather");
        BookProcessor process2 = new BookProcessor(stud2, new Book());
        process2.processBook();
    
        Student stud3 = new Student("236", "Dunne", "Amy", "The Civil War Diary");
        JournalProcessor process3 = new JournalProcessor(stud3, new Journal());
        process3.processJournal();
    
        Student stud4 = new Student("556", "Thurman", "Uma", "The Journals of Sylvia Plath");
        JournalProcessor process4 = new JournalProcessor(stud4, new Journal());
        process4.processJournal();
    }
}