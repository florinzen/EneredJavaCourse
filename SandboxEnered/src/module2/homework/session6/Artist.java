package module2.homework.session6;

public abstract class Artist implements Comparable<Artist> {
    private String name;
    private String hometown;
    private ArtisticComposition[] artisticCompositions;

    public Artist(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        artisticCompositions = new ArtisticComposition[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public ArtisticComposition[] getArtisticCompositions() {
        return artisticCompositions;
    }

    public void setArtisticCompositions(ArtisticComposition[] artisticCompositions) {
        this.artisticCompositions = artisticCompositions;
    }

    public abstract void perform();

    public abstract ArtisticComposition createNewArt();

    @Override
    public int compareTo(Artist a) {
        return this.name.compareTo(a.getName());
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + "\'}";
    }
}
