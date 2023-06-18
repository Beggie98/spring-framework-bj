package dono.daryo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    // we have crated bean by using existing class, This way we are not able to create object by using stereotype annotation
    // that why we are still using bean annotation structure.
    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
