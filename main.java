public class Main {
    public static void main(String[] args) {

        Book book = new Book(
                "9781234567890",
                "Introduction to Java",
                "John Smith"
        );

        Student student = new Student("ST001", "Grace");
        Publisher publisher = new Publisher("PUB001", "ABC Publishers");
        Librarian librarian = new Librarian("LIB001", "Alice");

        System.out.println(book);

        System.out.println(student);
        System.out.println("Student fee: " + student.calculateFees());

        System.out.println(publisher);
        System.out.println("Publisher fee: " + publisher.calculateFees());

        System.out.println(librarian);
        System.out.println("Librarian fee: " + librarian.calculateFees());
    }
}