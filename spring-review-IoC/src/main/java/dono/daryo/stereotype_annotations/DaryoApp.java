package dono.daryo.stereotype_annotations;

import dono.daryo.stereotype_annotations.config.AppConfig;
import dono.daryo.stereotype_annotations.model.DataStructure;
import dono.daryo.stereotype_annotations.model.ExtraHours;
import dono.daryo.stereotype_annotations.model.MicroServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DaryoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure ds = container.getBean(DataStructure.class);
        ds.getTotalHours();
        MicroServices ms = container.getBean(MicroServices.class);
        ms.getTotalHours();

        ExtraHours eh = container.getBean(ExtraHours.class);
        System.out.println("eh.getHours() = " + eh.getHours());

    }

}
