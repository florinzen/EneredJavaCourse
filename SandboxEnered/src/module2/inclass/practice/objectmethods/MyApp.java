package module2.practice.objectmethods;

public class MyApp {

    public static void main(String[] args) {

        for(int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            test();
        }
    }

    public static void test() {
        Dummy d = new Dummy();
        d.name = "asdf";
        d.value = 300;

        Dummy d2 = new Dummy();
        d = null;

        int i = Integer.MIN_VALUE;
        while(i < Integer.MAX_VALUE) {
            i++;
        }
    }
}
