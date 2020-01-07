package module2.practice.objectmethods;

public class Dummy {
    public String name;
    public int value;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Test");
    }
}
