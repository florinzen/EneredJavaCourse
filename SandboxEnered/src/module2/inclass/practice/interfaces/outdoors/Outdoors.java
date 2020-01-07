package module2.practice.interfaces.outdoors;

public abstract class Outdoors {
    private int id;
    private double price;
    private double weight;

    public Outdoors(int id, double price, double weight) {
        this.id = id;
        this.price = price;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
