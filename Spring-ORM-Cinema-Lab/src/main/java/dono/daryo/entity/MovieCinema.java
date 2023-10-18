package dono.daryo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Join;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class MovieCinema extends BaseEntity{


    @ManyToOne(fetch = FetchType.EAGER)
    private Cinema cinema;

    @ManyToOne(fetch = FetchType.EAGER)
    private Movie movie;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

}
