package module2.practice.interfaces.clothing;

import module2.practice.interfaces.Returnable;

public class Shirt extends Clothing implements Returnable {

    private String fit;

    public Shirt(int id, double price, char colorCode, char sizeCode, String fit) {
        super(id, price, colorCode, sizeCode);
        this.fit = fit;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    public String doReturn() {
        return "Shirt must be returned within 3 days";
    }
}
