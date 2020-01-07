package module2.practice.interfaces.outdoors;

import module2.practice.interfaces.Returnable;

public class Stove extends Outdoors implements Returnable {
    public Stove(int id, double price, double weight) {
        super(id, price, weight);
    }

    @Override
    public String doReturn() {
        return "Stove must be returned within 15 days";
    }
}
