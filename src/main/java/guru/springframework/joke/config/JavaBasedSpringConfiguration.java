package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 5/25/17.
 */
//@Configuration
public class JavaBasedSpringConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        System.out.println("In the JavaBasedSpringConfiguration");
        return new ChuckNorrisQuotes();
    }

}
