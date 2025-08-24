package Oops;

public class Arithmetic_operations_derived extends Arithmetic_operations {
    int num = 89;

    void mul(int x, int y) {
        z = x * y;
        System.out.println("multiply = " + z);
        System.out.println("num = " + num);
        System.out.println("num = " + (super.num - num));
    }

    void display() {
        System.out.println("Derived class");
        super.display();
    }

    public static void main(String[] args) {
        Arithmetic_operations baseObj = new Arithmetic_operations();
        baseObj.add(7, 5);
        baseObj.sub(7, 5);
        baseObj.display();

        Arithmetic_operations_derived derivedObj = new Arithmetic_operations_derived();
        derivedObj.add(2, 8);
        derivedObj.sub(10, 8);
        derivedObj.mul(3, 9);
        derivedObj.display();
    }
}
