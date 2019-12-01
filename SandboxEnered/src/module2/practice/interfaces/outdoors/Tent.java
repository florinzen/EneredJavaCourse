package module2.practice.interfaces.outdoors;

import module2.practice.interfaces.Returnable;

public class Tent extends Outdoors implements Returnable {
    private String type;
    public Tent(int id, double price, double weight, String type) {
        super(id, price, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String doReturn() {
        return "Tent must be returned within 8 days";
    }
}
