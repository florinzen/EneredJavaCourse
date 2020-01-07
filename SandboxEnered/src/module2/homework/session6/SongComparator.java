package module2.homework.session6;

import module2.homework.session6.artisticcomposition.Song;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        // Used for sorting in ascending order the songs by duration
        return o1.getDuration() - o2.getDuration();
    }
}
