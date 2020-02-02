package module2.petproject;

import module2.petproject.model.*;

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
