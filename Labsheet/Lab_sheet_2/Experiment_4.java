package Lab_sheet_2;

public class Experiment_4 {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

   
    public static void main(String[] args) {
        Experiment_4 mathOps = new Experiment_4();

        int sumInts = mathOps.add(5, 3);
        System.out.println(sumInts);  

        double sumDoubles = mathOps.add(4.5, 6.5);
        System.out.println(sumDoubles);  
    }
}
