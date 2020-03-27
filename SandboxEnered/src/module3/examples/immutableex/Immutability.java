 package module3.examples.immutableex;

import java.util.ArrayList;
import java.util.List;

public class Immutability {
    public static void main(String[] args) {
        List<Integer> someList = new ArrayList<>();
        someList.add(1);
        someList.add(2);
        someList.add(3);
        someList.add(4);

        SomeModel a = new SomeModel("Test", someList, 10);

        System.out.println(a);

        List<Integer> otherList = a.getSomeIntegers();
        boolean areTheSameReference = someList == otherList;
        boolean areTheSameInnerValues = someList.equals(otherList);

        otherList.add(5);

        System.out.println("Are the same reference? " + areTheSameReference);
        System.out.println("Are the same values inside the list? " + areTheSameInnerValues);
        System.out.println(a);

        String s1 = "Hello World"; // These are called String literals
        String s2 = "Hello World";
        String s3 = new String("Hello World");

        String someString = "1" + "2" + "3" + "4";


        boolean isSameReference = s1 == s2; // Always true.
        boolean isSameReference2 = s2 == s3;
        boolean isSameValue = s2.equals(s3);

        System.out.println("Is same reference? " + isSameReference);
        System.out.println("Is same reference? " + isSameReference2);
        System.out.println("Is same value? " + isSameValue);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");

        char[] someArray = ", Galaxy and".toCharArray();
        sb.insert(5, someArray);
        System.out.println(sb);

        String hi = "Hi, ";
        String mom = "mom.";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hi).append(mom);

        System.out.println(stringBuilder);

        String together = hi + mom;
        System.out.println(together);

        StringBuilder otherSb = new StringBuilder(hi);
        otherSb.append(mom);

        System.out.println(otherSb);

    }
}
