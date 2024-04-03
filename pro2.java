// Java program code to implement deserialization concept for given class Product object, has fields id, name, category and price.
import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Product product = (Product) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Product Details:");
            product.displayDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
