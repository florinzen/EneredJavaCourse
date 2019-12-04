package module2.homework.session6;

import module2.homework.session6.artist.Artist;
import module2.homework.session6.artist.Musician;
import module2.homework.session6.artist.Painter;
import module2.homework.session6.artisticcomposition.ArtisticComposition;
import module2.homework.session6.artisticcomposition.Song;

import java.util.Arrays;

public class InterfacePractice {

    public static void main(String[] args) {
        Artist a1 = new Musician("Bon Jovi", "New Jersey", new String[]{"Guitar", "Vocals"});
        Artist a2 = new Painter("Vincent van Gogh", "Zundert");
        Artist a3 = new Painter("Andreea Popescu", "Vaslui");
        Artist a4 = new Painter("Zoe Popescu", "Vaslui");

        ArtisticComposition b1 = new Song("It's my life", 1986);
        ArtisticComposition b2 = new Song("Livin on a prayer",  1990);
        ArtisticComposition b3 = new Song("All I want for Christmas is you", 1994);

        Artist[] newArray = {a1, a4, a2, a3};
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));


        ArtisticComposition[] artisticCompositions = {b1, b2, b3};
        Arrays.sort(artisticCompositions);
        System.out.println(Arrays.toString(artisticCompositions));


        Song s1 = new Song("Master of Puppets", 1986, 9);
        Song s2 = new Song("Don't start now", 2019, 4);
        Song s3 = new Song("November rain", 1992, 6);
        Song s4 = new Song("All I want for Christmas is you", 1994, 4);
        Song s5 = new Song("Beat it", 1982, 4);
        Song[] songs = {s1, s2, s3, s4, s5};

        Arrays.sort(songs);
        System.out.println(Arrays.toString(songs));

        Arrays.sort(songs, new SongComparator());

        System.out.println(Arrays.toString(songs));
    }
}
