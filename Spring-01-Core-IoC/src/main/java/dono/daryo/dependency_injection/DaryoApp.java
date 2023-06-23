package dono.daryo.dependency_injection;

import dono.daryo.stereotype_annotation.Agile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Java java = context.getBean(Java.class);

        java.getTeachingHours();



    }

}
