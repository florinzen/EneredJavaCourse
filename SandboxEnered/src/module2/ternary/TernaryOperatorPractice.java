package module2.ternary;

import java.util.ArrayList;
import java.util.List;

public class TernaryOperatorPractice {

    public static void main(String[] args) {
        String twelveDigits = "AAAAAAAAAAAA";
        String tenDigits = "AAAAAAAAAA";
        String elevenDigits = "AAAAAAAAAAA";


        boolean resultTwelveDigits = isStringValidClassic(twelveDigits);
        boolean resultTenDigits = isStringValidTernary(tenDigits);
        boolean resultElevenDigits = isStringValidClassic(elevenDigits);

        System.out.println("Twelve digits: " + resultTwelveDigits);
        System.out.println("Ten digits: " + resultTenDigits);
        System.out.println("Eleven digits: " + resultElevenDigits);

        List<String> names = new ArrayList<>();
        names.add("Dorin");
        names.add("Carmen");
        names.add("Petru");
        names.add("Matei");
        names.add("Camelia");
        names.add("Irina");

        System.out.println("For each: ");
        names.forEach(x -> {
            System.out.println("Name: " + x);
        });

        // VS

        System.out.println("Enhanced for: ");
        for(String b : names) {
            System.out.println("Name: " + b);
        }

    }

    public static boolean isStringValidTernary(String x) {
        return ((x.length() % 5 == 0) || (x.length() % 6 == 0)) ? true : false;
    }

    public static boolean isStringValidClassic(String x) {
        if((x.length() % 5 == 0) || (x.length() % 6 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
