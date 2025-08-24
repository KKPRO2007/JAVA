package Lab_sheet_2;

public class Experiment_2 {
    private double length;
    private double breadth;

    public Experiment_2() {
        this.length = 1;
        this.breadth = 1;
    }

    public Experiment_2(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Invalid length or breadth!");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }


    public static void main(String[] args) {
        Experiment_2 rect1 = new Experiment_2();
        rect1.calculateArea(); 

        Experiment_2 rect2 = new Experiment_2(5,3);
        rect2.calculateArea(); 
    }
}
