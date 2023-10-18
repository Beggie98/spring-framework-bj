package dono.daryo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Ticket")
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity {


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    private int seatNumber;
    private int rowNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserAccount userAccount;


    public Ticket(LocalDateTime dateTime, int seatNumber, int rowNumber) {
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
