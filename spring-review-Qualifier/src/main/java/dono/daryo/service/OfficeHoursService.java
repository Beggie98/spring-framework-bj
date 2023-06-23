package dono.daryo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Office")
public class OfficeHoursService implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
