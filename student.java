public class Student extends Member {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFees() {
        if (getId() != null && !getId().isEmpty()) {
            return 0;
        } else {
            return 5000;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}