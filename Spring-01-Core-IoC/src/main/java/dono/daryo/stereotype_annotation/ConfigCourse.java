package dono.daryo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan //@ComponentScan checks every class in the current package for @Component
@ComponentScan(basePackages = "dono.daryo")//looks for classes outside the current package
public class ConfigCourse {

}
