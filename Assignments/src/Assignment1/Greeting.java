package Assignment1;

public class Greeting {

    public void sayHello() {
        String name = "Riya";  // Replace with your name if you want
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void main(String[] args) {
        Greeting obj = new Greeting();
        obj.sayHello();
    }
}