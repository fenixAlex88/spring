package by.fenix.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusicMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusicMusic;
    }



    public String playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
        return "Playing: " + classicalMusic.getSong();
    }
}
