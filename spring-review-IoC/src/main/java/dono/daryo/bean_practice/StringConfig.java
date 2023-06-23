package dono.daryo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class StringConfig {

    @Bean(name = "String 1")
    public String str1(){
        return "Welcome to DaryoApp";
    }

    @Bean
    @Primary
    public String str2(){
        return "Spring Core Practice";
    }

}
