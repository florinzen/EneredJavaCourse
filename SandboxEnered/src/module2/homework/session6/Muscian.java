package module2.homework.session6;

public class Muscian extends Artist {
    private String[] musicalInstruments;

    public Muscian(String name, String hometown, ArtisticCompostion[] artisticCompostions, String[] musicalInstruments) {
        super(name, hometown, artisticCompostions);
        this.musicalInstruments = musicalInstruments;
    }

    public String[] getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(String[] musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }
}
