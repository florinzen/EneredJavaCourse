package module2.enumEx;

public class Main {

    public static void main(String[] args) {
        printDayMessage(Days.MONDAY);
        printDayMessage(Days.FRIDAY);

        Computer comp = new Computer();
        comp.setPowerState(PowerState.SUSPEND);
        System.out.println("Current state: " + comp.getPowerState());
        System.out.println("Description: " + comp.getPowerState().getDescription());

        comp.setPowerState(PowerState.ON);
        System.out.println("Current state: " + comp.getPowerState());
        System.out.println("Description: " + comp.getPowerState().getDescription());
    }

    public static void printDayMessage(Days day) {
        switch(day) {
            case MONDAY:
                System.out.println("Today is monday, have a great week!");
                break;
            case TUESDAY:
                System.out.println("Go to the java course");
                break;
            case FRIDAY:
                System.out.println("Today is " + day);
                break;
            default:
                System.out.println("Enjoy your day!");
                break;
        }
    }
}
