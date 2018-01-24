package eu.badgerlabs.springboot2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args ->
                Flux
                        .just(
                                new Chapter("Chapter 1"),
                                new Chapter("Chapter 2"),
                                new Chapter("Chapter 3"),
                                new Chapter("Chapter 4"),
                                new Chapter("Chapter 5"),
                                new Chapter("Chapter 6"),
                                new Chapter("Chapter 7"))
                        .flatMap(repository::save)
                        .subscribe(System.out::println);
    }
}
