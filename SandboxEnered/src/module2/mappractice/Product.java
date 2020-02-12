package module2.mappractice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private String description;
    private double price;
    private Set<String> tags;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        tags = new HashSet<>();
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
