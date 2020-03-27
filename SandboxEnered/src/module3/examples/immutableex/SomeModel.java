package module3.examples.immutableex;

import java.util.ArrayList;
import java.util.List;

public final class SomeModel {
    private final String someString;
    private final List<Integer> someIntegers;
    private final int someInt;

    public SomeModel(String someString, List<Integer> someIntegers, int someInt) {
        this.someString = someString;
        this.someIntegers = new ArrayList<>(someIntegers);
        this.someInt = someInt;
    }

    public String getSomeString() {
        return someString;
    }

    public List<Integer> getSomeIntegers() {
        return new ArrayList<>(someIntegers);
    }

    public int getSomeInt() {
        return someInt;
    }

    @Override
    public String toString() {
        return "SomeModel{" +
                "someString='" + someString + '\'' +
                ", someIntegers=" + someIntegers +
                ", someInt=" + someInt +
                '}';
    }
}
