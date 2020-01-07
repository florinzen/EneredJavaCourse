package module2.homework.session6;

import module2.homework.session6.artist.Artist;
import module2.homework.session6.artist.Musician;
import module2.homework.session6.artist.Painter;
import module2.homework.session6.artisticcomposition.ArtisticComposition;
import module2.homework.session6.artisticcomposition.Painting;
import module2.homework.session6.artisticcomposition.Song;

import java.util.Arrays;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Artist a1 = new Musician("Bon Jovi", "New Jersey", new String[]{"Guitar", "Vocals"});
        Artist a2 = new Painter("Vincent van Gogh", "Zundert");

        Artist[] artists = {a1, a2};
        displayArtisticCompositionsFor(artists); // two sets of null values (no compositions for the artists yet)

        ArtisticComposition b1 = new Song("It's my life", 1986);
        ArtisticComposition b2 = new Song("Livin on a prayer",  1990);

        a1.setArtisticCompositions(new ArtisticComposition[]{b1, b2}); //

        displayArtisticCompositionsFor(artists); // without a toString methods, something like module2.homework.session6.artisticcomposition.Song@1b6d3586, module2.homework.session6.artisticcomposition.Song@1b6d3586 will be printed for Bon Jovi

        // After adding the toString method (check the Song and ArtisticComposition classes, the output should look something like this:
        // [Song{duration=0} is a ArtisticCompostion{name='It's my life', yearOfRelease=1986}, Song{duration=0} is a ArtisticCompostion{name='Livin on a prayer', yearOfRelease=1986}]

        Scanner input = new Scanner(System.in);
        System.out.println("Let's create a paining for the Artist " + a2.getName());
        System.out.print("Insert the name of the painting: ");
        String name = input.nextLine();
        System.out.print("\nInsert the year of release: ");
        int yearOfRelease = Integer.parseInt(input.nextLine());
        System.out.print("\nInsert the price of the painting: ");
        double price = Double.parseDouble(input.nextLine());

        ArtisticComposition b3 = new Painting(name, yearOfRelease, price);

        System.out.println("Setting the artistic composition to " + a2.getName());
        a2.setArtisticCompositions(new ArtisticComposition[]{b3});

        displayArtisticCompositionsFor(artists);


        for(int i = 0; i < 10; i++) {
            System.out.println(a2.createNewArt());
        }


    }

    private static void displayArtisticCompositionsFor(Artist[] artists) {
        for(Artist a : artists) {
            System.out.println(Arrays.toString(a.getArtisticCompositions()));
        }
    }
}
