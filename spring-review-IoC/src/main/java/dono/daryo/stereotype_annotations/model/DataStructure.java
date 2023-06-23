package dono.daryo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor//@Autowired for dependency injection is added on top of constructor by default
public class DataStructure {

    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours : " + (20 + extraHours.getHours()));
    }
}
