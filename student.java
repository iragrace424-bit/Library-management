public class student extends Member {
    public student(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFees() {
        if (getid() != null && !getid().isEmpty()) {
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