package dono.daryo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor // Spring will do constructor injection automatically
public class Java {

    //Field injection
    //@Autowired
    //OfficeHours officeHours;

    OfficeHours officeHours;

    //Constructor injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }

}
