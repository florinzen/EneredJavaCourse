package module2.homework.session6;

public abstract class ArtisticCompostion {
    private String name;
    private int yearOfRelease;

    public ArtisticCompostion(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "ArtisticCompostion{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
