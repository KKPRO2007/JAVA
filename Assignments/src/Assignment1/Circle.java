package Assignment1;
public class Circle {

 public void calculateArea() {
     double radius = 7;
     double area = 3.14 * radius * radius;
     System.out.println("Area of the circle: " + area);
 }

 public static void main(String[] args) {
     Circle obj = new Circle();
     obj.calculateArea();
 }
}
