package dono.daryo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mentor")
public class MentorHoursService implements ExtraSessions{
    @Override
    public int getHours() {
        return 8;
    }
}
