package module1.practice;

public class Exercises {

    // Write a program to calculate the average value of array elements.
    public static double computeAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;
        return average;
    }

    // Write a program to test if an array contains a specific value.
    public static boolean isElementPresent(int[] array, int x) {
        // Iterez pe valorile din array
        for (int i = 0; i < array.length; i++) {
            // Daca am gasit elementul cautat in array pot returna true
            if (array[i] == x) {
                return true;
            }
        }

        // daca am terminat de iterat pe array
        // este clar ca elementul cautat nu se afla
        // printre elementele din array, deci pot returna false
        return false;
    }

    // Write a program to find the maximum and minimum value of an array.
    public static int maximum(int[] array) {
        // Stabilim ca primul element va fi maximul
        int max = array[0];
        int index = 1;
        // Iteram folosind bucla while
        while (index < array.length) {
            // Daca gasim un alt numar in array mai mare decat max
            // Inseamna ca am descoperit un nou maxim
            if (max < array[index]) {
                max = array[index];
            }
            index++;
        }

        // La final returnam valoarea maxima din array
        return max;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        int index = 1;
        while (index < array.length) {
            if (min > array[index]) {
                min = array[index];
            }
            index++;
        }
        return min;
    }

    public static void displayReverse(String s) {
        int index = s.length() - 1; // salvam in variabila index ultima pozitie din string

        // Atunci cand indexul atinge valoarea 0 inseamna ca
        // am parcurs toate caracterele din string
        while(index >= 0) {
            char c = s.charAt(index); // salvam caracterul de la pozitia indexului
            System.out.print(c);
            index--; // decrementam
        }

        // Adaugam un spatiu pentru a fi mai usor de citit
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {100,2,3,10,2};

        System.out.println("Is element present output: " + isElementPresent(array, 2));

        System.out.println("Average of array values: " + computeAverage(array));

        System.out.println("Array minimum: " + minimum(array));

        System.out.println("Array maximum: " + maximum(array));
        displayReverse("Hello World!");
    }


}
