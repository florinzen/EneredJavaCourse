package module2.petproject;

import module2.petproject.model.Pet;

import java.util.Set;
import java.util.TreeSet;

public class PetShop {

    // Providing a comparator in order to sort the pets added to this set
    private Set<Pet> pets = new TreeSet<>(new PetComparator());

    public boolean addPet(Pet p) {
        return pets.add(p);
    }

    public void displayPets() {
        for(Pet p : pets) {
            System.out.println(p);
        }
    }
}
