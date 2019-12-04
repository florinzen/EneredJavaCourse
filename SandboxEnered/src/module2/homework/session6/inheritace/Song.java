package module2.homework.session6.inheritace;

public class Song extends ArtisticComposition {

    private int duration;

    public Song(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public Song(String name, int yearOfRelease, int duration) {
        this(name, yearOfRelease);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "duration=" + duration +
                "} is a " + super.toString();
    }
}
