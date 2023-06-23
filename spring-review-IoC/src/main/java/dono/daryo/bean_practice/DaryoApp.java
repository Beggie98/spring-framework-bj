package dono.daryo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        //creating Spring container
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, StringConfig.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str1 = container.getBean("String 1",String.class);
        System.out.println(str1);

        String str2 = container.getBean(String.class);
        System.out.println(str2);

    }


}
