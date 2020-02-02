package module2.petproject.model;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name = "Fluffy";
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
