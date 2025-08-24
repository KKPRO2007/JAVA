package Lab_sheet_2;

public class Experiment_1 {
    private String title;
    private String author;
    private double price;

    public Experiment_1(String title, String author, double price) {
        if (title == null || author == null || price <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
    public static void main(String[] args) {
        Experiment_1 book = new Experiment_1("Java Programming", "James Gosling", 599.0);
        book.displayDetails();
    }
}
