package dono.daryo.repository;

import dono.daryo.model.Java;
import org.springframework.stereotype.Component;

@Component
public class DBJavaRepository implements JavaRepository{
    @Override
    public int returnHours() {
        //Assume this is coming from database
        Java java = new Java(30);

        return java.getTeachingHours();
    }
}
