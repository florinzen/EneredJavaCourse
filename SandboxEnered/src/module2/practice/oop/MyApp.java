package module2.practice.oop;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p;
        System.out.println("Let's create a product!");
        System.out.print("Please enter a product name: ");

        String productName = scanner.nextLine();

        System.out.print("\nPlease enter a product price: ");

        double productPrice = Double.parseDouble(scanner.nextLine());

        p = new Product(productName, productPrice);
        p.display();

        Product[] products = new Product[3];
        products[0] = new Product("Soap", 10);
        products[1] = new ElectronicProduct("Samsung TV", 1200, false, 200);
        products[2] = new Product("Toothbrush", 18);

        for(Product product : products) {
            product.display();
        }

    }
}
