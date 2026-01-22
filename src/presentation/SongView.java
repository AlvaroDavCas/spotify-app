package presentation;

import domain.GetSongsUseCase;
import domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase();

        ArrayList<Song> songsList = getSongsUseCase.execute();

        System.out.println(songsList);
    }
}
