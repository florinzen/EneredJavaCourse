package module2.homework.session6.inheritace;

import java.time.Year;

public class Musician extends Artist {
    private String[] musicalInstruments;

    public Musician(String name, String hometown, String[] musicalInstruments) {
        super(name, hometown);
        this.musicalInstruments = musicalInstruments;
    }

    public String[] getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(String[] musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    @Override
    public void perform() {
        for(String musicalInstrument : musicalInstruments) {
            System.out.println("Performing with " + musicalInstrument);
        }
    }

    @Override
    public Song createNewArt() {
        return new Song("Hello from " + getName(), Year.now().getValue());
    }
}
