public class publisher extends Member {
    public publisher(String id, String name) {
        super(id, name);
    }
    @Override
    public double calculateFees() {
        double flatfee = 5000;
        return flatfee + (0.05 * flatfee) + 20000;
    }
    @Override
    public String toString() {
        return "Publisher{" +
}