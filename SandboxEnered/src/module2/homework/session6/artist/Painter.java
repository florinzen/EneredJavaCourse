package module2.homework.session6.artist;

import module2.homework.session6.artisticcomposition.Painting;

import java.time.Year;

public class Painter extends Artist {

    public Painter(String name, String hometown) {
        super(name, hometown);
    }

    @Override
    public void perform() {
        System.out.println("Sorry, I cannot make a live performance.");
    }

    @Override
    public Painting createNewArt() {
        // (Math.random()*((max-min)+1))+min; -> Generating random numbers
        return new Painting(super.getName() + " signature", Year.now().getValue(), (Math.random() * ((4000 - 2000) + 1)) + 2000);
    }
}
