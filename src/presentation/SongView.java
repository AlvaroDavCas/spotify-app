package presentation;

import data.SongDataRepository;
import domain.GetSongsUseCase;
import domain.Song;


import java.util.ArrayList;

public class SongView {

    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new SongDataRepository(new SongDataRepository());

        ArrayList<Song> songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }
}
