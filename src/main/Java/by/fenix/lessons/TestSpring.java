package by.fenix.lessons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
       // musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);



        context.close();
    }
}
