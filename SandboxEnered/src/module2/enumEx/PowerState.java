package module2.enumEx;

public enum PowerState {
    OFF("The power is off"),
    ON("The usage power is high"),
    SUSPEND("The power usage is low");

    private String description;
    private PowerState(String desc) {
        description = desc;
    }

    public String getDescription() {
        return description;
    }
}
