package module3.examples.exceptions;

public class ProgramFlow {

    static class A {
        protected int x = 0;

        A(int x) {
            this.x = x;
            System.out.println("Instantiating an object of type " +
                    this.getClass());
        }

        public final int calculateSum(int y) {
            System.out.println("computing...");
            return x + y;
        }
    }

    static class B extends A {
        B(int x) {
            super(x);
        }

        public int calculateSumeDifferently(int y) {
            return super.calculateSum(y) + 1;
        }
    }

    static class Test extends Exception {}

    public static void main(String[] args) {
        try {
            throw new Test();
        } catch (Test t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }

    }

    public static void method1(String x) {
        System.out.print(x.charAt(4));
    }

    public static void method2(String x) {
        method1(x);
    }

    public static void method3(String x) {
        System.out.print(x.charAt(0));
    }

    public static void method4(String x) {
        method2(x);
    }


}
