package by.fenix.lessons;

import org.springframework.stereotype.Component;
@Component("classicalMusicBean")
public class ClassicalMusic implements Music{

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String[] getSong() {
        return new String[]{"Hungarian Rhapsody", "2", "3"};
    }
}
