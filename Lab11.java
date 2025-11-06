import java.util.*;

class Product {
String name;
double price;

Product(String name, double price) {
this.name = name;
this.price = price;
}

public String toString() {
return name + " - $" + price;
}
}

public class Lab11 {
public static void main(String[] args) {
List<Product> products = new ArrayList<>();

products.add(new Product("Laptop", 80000));
products.add(new Product("Phone", 60000));
products.add(new Product("Headphones", 2000));
products.add(new Product("Tablet", 25000));

System.out.println("Original List:");
products.forEach(p -> System.out.println(p));

products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
System.out.println("\nSorted by Price:");
products.forEach(p -> System.out.println(p));

products.sort((p1, p2) -> p1.name.compareTo(p2.name));
System.out.println("\nSorted by Name:");
products.forEach(p -> System.out.println(p));
}
}
