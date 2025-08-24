package Lab_sheet_2;

public class Experiment_3 {
    private String name;
    private double marks;

    public Experiment_3(String name, double marks) {
        if (name == null || marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Experiment_3 student = new Experiment_3("Amit", 85);
        student.displayInfo();
    }
}
