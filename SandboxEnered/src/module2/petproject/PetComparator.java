package module2.petproject;

import module2.petproject.model.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet pet, Pet otherPet) {
        return pet.getName().compareTo(otherPet.getName());
    }
}
