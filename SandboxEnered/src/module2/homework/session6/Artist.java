package module2.homework.session6;

import java.util.Arrays;

public abstract class Artist {
    private String name;
    private String hometown;
    private ArtisticCompostion[] artisticCompositions;

    public Artist(String name, String hometown, ArtisticCompostion[] artisticCompostions) {
        this.name = name;
        this.hometown = hometown;
        this.artisticCompositions = artisticCompostions;
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

    public ArtisticCompostion[] getArtisticCompositions() {
        return artisticCompositions;
    }

    public void setArtisticCompositions(ArtisticCompostion[] artisticCompositions) {
        this.artisticCompositions = artisticCompositions;
    }
}
