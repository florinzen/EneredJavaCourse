package module3.exceptions;

public class ExceptionsPractice {

    public static void main(String[] args) {
        int result1 = divide(10, 0);
        System.out.println("Result 1: " + result1);
        int result2 = divide(10, 5);
        System.out.println("Result 2: " + result2);
        int result3 = divide(10, 2);
        System.out.println("Result 3: " + result3);
        int result4 = divide(25, 5);
        System.out.println("Result 4: " + result4);

        int result = 0;
        try {
            result = otherDivide(10, 0);
            System.out.println("asdasdasdas"); // Line which does not get printed. Exception occured above
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Result: " + result);


        int val1 = 10;
        int val2 = 0;

        if(val2 != 0) {
            int otherResult = otherDivide(val1, val2);
            System.out.println("Other result: " + otherResult);
        }

        val2 = 10;
        if(val2 != 0) {
            int otherResult = otherDivide(val1, val2);
            System.out.println("Other result: " + otherResult);
        }

    }

    public static int otherDivide(int a, int b) {
        return a/b;
    }

    public static int divide(int a, int b) {
        int result;
        try {
            //System.exit(5);
            result = divide(a, b);
            return result;
        } catch (Exception e) {
            System.out.println("Oooops! Division by 0 is not allowed :(");
            return 0;
        } finally {
            System.out.println("Finally gets always executed.");
        }
    }
}