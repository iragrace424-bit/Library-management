public class Librarian extends Member {

    public Librarian(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFees() {
        return 0;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}