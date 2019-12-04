package module2.homework.session6.inheritace;

import module2.homework.session6.Forest;
import module2.homework.session6.Mountain;
import module2.homework.session6.Paintable;

import java.time.Year;

public class Painter extends Artist {

    public Paintable[] paintables = new Paintable[3];

    public Painter(String name, String hometown) {
        super(name, hometown);
    }

    public void addPaintable(Paintable newPaintable, int pos) {
        System.out.println("Adding a new paintable for painter "
                + super.getName());
        this.paintables[pos] = newPaintable;
    }
    @Override
    public void perform() {
        for(Paintable p : paintables) {
            p.paint();
        }
    }

    public static void main(String[] args) {
        Painter a = new Painter("Picasso", "Zaragoza");
        Paintable x = new Mountain();
        Paintable y = new Forest();
        Paintable z = new Mountain();

        a.addPaintable(x, 0);
        a.addPaintable(y, 1);
        a.addPaintable(z, 2);

        a.perform();
    }



    @Override
    public Painting createNewArt() {
        // (Math.random()*((max-min)+1))+min; -> Generating random numbers
        return new Painting(super.getName() + " signature", Year.now().getValue(), (Math.random() * ((4000 - 2000) + 1)) + 2000);
    }
}
