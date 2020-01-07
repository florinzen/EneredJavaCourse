package module2.practice.interfaces.clothing;

import module2.practice.interfaces.Returnable;

public class Trousers extends Clothing implements Returnable {

    private char gender;
    public Trousers(int id, double price, char colorCode, char sizeCode, char gender) {
        super(id, price, colorCode, sizeCode);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String doReturn() {
        return "Trousers must be returned within 10 days";
    }
}
