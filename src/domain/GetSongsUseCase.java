package domain;

import java.awt.*;
import java.util.ArrayList;

public class GetSongsUseCase(){

    private SongRepository songRepository;

    public GetSongsUseCase(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> execute() {
        return songRepository.findAll();
    }
}
