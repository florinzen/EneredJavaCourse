package module2.practice.interfaces.clothing;

public abstract class Clothing {
    private int id;
    private double price;
    private char colorCode;
    private char sizeCode;

    public Clothing(int id, double price, char colorCode, char sizeCode) {
        this.id = id;
        this.price = price;
        this.colorCode = colorCode;
        this.sizeCode = sizeCode;
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

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public char getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(char sizeCode) {
        this.sizeCode = sizeCode;
    }
}
