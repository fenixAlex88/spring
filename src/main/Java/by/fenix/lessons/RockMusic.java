package by.fenix.lessons;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[]{"Wind cries Mary", "2", "3"};
    }
}
