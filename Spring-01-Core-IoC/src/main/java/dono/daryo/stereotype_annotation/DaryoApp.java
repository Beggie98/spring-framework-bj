package dono.daryo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        context.getBean(Java.class).getTeachingHours();

        Agile agile = context.getBean(Agile.class);

        agile.getTeachingHours();

    }

}
