package module2.petproject;

import module2.petproject.model.*;

import java.util.Scanner;

public class PetMain {

    public static void main(String[] args) {
        Animal tarantula = new Spider();
        Animal cat = new Cat("Mitzi");
        Animal fish = new Fish();
        Animal otherCat = new Cat();

        Spider someSpider = new Spider();

        tarantula.walk();
        tarantula.eat();

        fish.eat();
        fish.walk();

        cat.eat();
        cat.walk();

        otherCat.walk();
        otherCat.eat();

        playWithAnimal(cat);
        playWithAnimal(tarantula);
        playWithAnimal(fish);
        playWithAnimal(otherCat);
        playWithAnimal(someSpider);

        PetShop petShop = new PetShop();

        Pet p1 = new Cat();
        Pet p2 = new Cat("Tom");
        Pet p3 = new Fish();
        Pet p4 = new Cat("Armando");
        p3.setName("Goldie");
        petShop.addPet(p1);
        petShop.addPet(p2);
        petShop.addPet(p3);
        petShop.addPet(p4);

        petShop.displayPets();

        Scanner sc = new Scanner(System.in);
        System.out.println("What pet animal do you want? [cat/fish]");
        Pet myPet = null;
        String answer = sc.nextLine();
        boolean isValid = false;
        do {
            if (answer.equals("cat")) {
                myPet = new Cat();
                isValid = true;
            } else if (answer.equals("fish")) {
                myPet = new Fish();
                isValid = true;
            } else {
                System.out.println("You can only choose between cat/fish");
                answer = sc.nextLine();
            }
        } while (!isValid);


        System.out.println("How do you want to name your pet?");
        System.out.print("Name: ");
        String name = sc.nextLine();
        myPet.setName(name);


        System.out.println("Enter 1 if you want to play with your pet");
        System.out.println("Enter 2 if you want to walk with your pet");
        System.out.println("Enter 3 if you want to see the details of the pet");
        System.out.println("Enter exit if you want to turn off the program");

        isValid = false;
        do {
            String inputFromUser = sc.nextLine();
            switch (inputFromUser) {
                case "1":
                    myPet.play();
                    break;
                case "2":
                    ((Animal) myPet).walk();
                    break;
                case "3":
                    System.out.println(myPet);
                    break;
                case "exit":
                    isValid = true;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }while(!isValid);

    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet myPet = (Pet) a;
            myPet.play();
        } else if (a instanceof Spider) {
            System.out.println("Danger! Wild Animal!!");
        }
    }
}
