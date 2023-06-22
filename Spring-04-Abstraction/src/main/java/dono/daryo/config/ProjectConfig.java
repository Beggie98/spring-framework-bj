package dono.daryo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "dono.daryo")
@ComponentScan(basePackages = {"dono.daryo.proxy", "dono.daryo.service", "dono.daryo.repository"})
public class ProjectConfig {

}
