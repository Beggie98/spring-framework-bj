package dono.daryo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Cinema")
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity{

    private String name;
    @Column(name = "sponsored_name")
    private String sponsoredName;


    @ManyToOne
    private Location location;

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", sponsoredName='" + sponsoredName + '\'' +
                ", location=" + location +
                '}';
    }
}
