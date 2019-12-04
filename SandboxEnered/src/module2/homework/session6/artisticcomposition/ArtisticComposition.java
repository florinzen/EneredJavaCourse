package module2.homework.session6.artisticcomposition;

public abstract class ArtisticComposition implements Comparable<ArtisticComposition> {
    private String name;
    private int yearOfRelease;

    public ArtisticComposition(String name, int yearOfRelease) {
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

    @Override
    public int compareTo(ArtisticComposition o) {
        if(this.yearOfRelease > o.yearOfRelease) {
            return 1;
        }
        if(this.yearOfRelease == o.yearOfRelease) {
            return 0;
        }
        return -1;
    }
}
