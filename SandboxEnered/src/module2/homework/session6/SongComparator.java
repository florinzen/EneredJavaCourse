package module2.homework.session6;

import module2.homework.session6.artisticcomposition.Song;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
