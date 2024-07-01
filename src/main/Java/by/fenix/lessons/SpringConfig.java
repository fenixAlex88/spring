package by.fenix.lessons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.fenix.lessons")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusicBean() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusicBean() {
        return new ClassicalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusicBean(), classicalMusicBean());
    }
}
