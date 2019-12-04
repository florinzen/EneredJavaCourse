package module2.practice.oop;

public class ElectronicProduct extends Product {

    private boolean isItByBattery;
    private int voltage;

    public ElectronicProduct(String name, double price,
                             boolean isItByBattery, int voltage) {
        super(name, price);
        super.display();
        this.isItByBattery = isItByBattery;
        this.voltage = voltage;
    }

    public boolean isItByBattery() {
        return isItByBattery;
    }

    public void setItByBattery(boolean itByBattery) {
        isItByBattery = itByBattery;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Is it by batter: " + isItByBattery
                + ", voltage: " + voltage);
    }

}
