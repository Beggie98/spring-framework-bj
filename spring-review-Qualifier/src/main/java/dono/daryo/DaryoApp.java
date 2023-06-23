package dono.daryo;

import dono.daryo.config.ConfigApp;
import dono.daryo.service.JavaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        JavaService javaService = context.getBean(JavaService.class);


    }

}
