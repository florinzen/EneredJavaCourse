package module3.examples.assertions;

public class InvariantPractice {

    static void checkNum(int num) {
        int x = num;
        if(x > 0) {
            System.out.println("Number is positive " + x);
        } else if (x == 0) {
            System.out.println("Number is zero " + x);
        } else {
           assert x > 0 : "asdasdas";
        }
    }

    public static void main(String args[]) {
        checkNum(-4);

        PersonClassInvariant a = new PersonClassInvariant();
        a.age = 22;
        a.changeName("asdasd");

        a.age = 15;
        a.changeName("AAAA");

    }

    static class PersonClassInvariant {
        String name;
        String cnp;
        int age;

        private void checkAge() {
            assert age >= 18 && age < 140;
        }

        void changeName(String newName) {
            checkAge();
            name = newName;
        }
    }
}
