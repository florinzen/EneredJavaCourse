package module2.homework.session6.inheritace;

public class Painting extends ArtisticComposition {
    private double price;

    public Painting(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public Painting(String name, int yearOfRelease, double price) {
        this(name, yearOfRelease);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "price=" + price +
                "} is a " + super.toString();
    }
}
