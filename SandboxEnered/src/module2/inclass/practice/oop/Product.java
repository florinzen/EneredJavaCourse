package module2.practice.oop;

public class Product {

    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product details: " + name + ", " + price);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Product product = (Product) other;
        return Double.compare(product.price, this.price) == 0 &&
                this.name.equals(product.name);
    }

    @Override
    public String toString() {
        return "Product: name: " + this.name + ", price:" + this.price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("iPhone", 200);
        Product p2 = new Product("iPhone", 200);

        System.out.println(p1 == p2);
        System.out.println("Cele 2 produse sunt egale: "
                +p1.equals(p2));

        System.out.println(p1);
    }


}
