package by.fenix.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusicBean") Music music2,
                       @Qualifier("rockMusicBean") Music music1)
    {
        this.music2 = music2;
        this.music1 = music1;
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        switch (genre) {
            case CLASSICAL:
                return "Playing: " + music1.getSong()[random.nextInt(2)];
            case ROCK:
                return "Playing: " + music2.getSong()[random.nextInt(2)];
            default:
                return "Неверный жанр";
        }
    }
}
