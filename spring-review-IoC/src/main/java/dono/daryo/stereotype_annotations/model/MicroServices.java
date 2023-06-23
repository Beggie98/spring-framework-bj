package dono.daryo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MicroServices {

    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours : " + (25+ extraHours.getHours()));
    }
}
