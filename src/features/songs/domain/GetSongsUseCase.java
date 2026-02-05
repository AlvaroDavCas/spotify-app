package features.songs.domain;

import java.util.ArrayList;
import java.util.List;

public class GetSongsUseCase {

    private SongRepository songRepository;

    public GetSongsUseCase(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public ArrayList<Song> execute() {
        return songRepository.findAll();
    }
}