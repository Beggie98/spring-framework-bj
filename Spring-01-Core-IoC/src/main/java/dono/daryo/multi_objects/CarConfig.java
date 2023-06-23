package dono.daryo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    //@Bean(name = "c1")
    @Bean
    Car car1(){
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }

    //@Bean(name = "c2")
    @Bean
    @Primary
    Car car2(){
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }


}
